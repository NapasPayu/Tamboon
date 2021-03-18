package com.napas.tamboon.data.model.mapper

import com.napas.tamboon.data.model.ResultEntity
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class ResultMapperTest {

    private lateinit var resultMapper: ResultMapper

    @Before
    fun setup() {
        resultMapper = ResultMapper()
    }

    @Test
    fun `map from entity`() {
        val resultEntity = ResultEntity(
            success = true,
            errorCode = "insufficient_minerals",
            errorMessage = "Card has insufficient balance."
        )
        val result = resultMapper.map(resultEntity)
        assertEquals(resultEntity.success, result.success)
        assertEquals(resultEntity.errorCode, result.code)
        assertEquals(resultEntity.errorMessage, result.message)
    }
}