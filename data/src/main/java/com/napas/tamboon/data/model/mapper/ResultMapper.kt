package com.napas.tamboon.data.model.mapper

import com.napas.tamboon.data.model.ResultEntity
import com.napas.tamboon.domain.model.Result

class ResultMapper : Mapper<ResultEntity, Result> {

    override fun map(input: ResultEntity): Result {
        return with(input) {
            Result(
                success = success ?: false,
                code = errorCode ?: "",
                message = errorMessage ?: ""
            )
        }
    }
}