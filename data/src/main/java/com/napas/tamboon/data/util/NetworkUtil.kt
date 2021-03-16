package com.napas.tamboon.data.util

import com.google.gson.Gson
import com.napas.tamboon.data.model.ResultEntity
import com.napas.tamboon.domain.model.Result
import com.napas.tamboon.domain.model.ResultWrapper
import retrofit2.HttpException

suspend fun <T> safeApiCall(
    call: suspend () -> T
): ResultWrapper<T> {
    return try {
        ResultWrapper.Success(call())
    } catch (throwable: Throwable) {
        when (throwable) {
            is HttpException -> {
                convertErrorBody(throwable)?.let {
                    ResultWrapper.HttpError(it)
                } ?: ResultWrapper.GenericError(throwable)
            }
            else -> {
                ResultWrapper.GenericError(throwable)
            }
        }
    }
}

private fun convertErrorBody(throwable: HttpException): Result? {
    return try {
        throwable.response()?.errorBody()?.string()?.let {
            val resultEntity = Gson().fromJson(it, ResultEntity::class.java)
            with(resultEntity) {
                Result(
                    success = success ?: false,
                    code = errorCode ?: "",
                    message = errorMessage ?: ""
                )
            }
        }
    } catch (exception: Exception) {
        null
    }
}