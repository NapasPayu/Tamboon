package com.napas.tamboon.domain.model

sealed class ResultWrapper<out T> {
    data class Success<out T>(val data: T) : ResultWrapper<T>()
    data class HttpError(val result: Result) : ResultWrapper<Nothing>()
    data class GenericError(val throwable: Throwable) : ResultWrapper<Nothing>()
}