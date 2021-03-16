package com.napas.tamboon.data.remote

import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Test
import org.koin.test.inject
import retrofit2.HttpException
import java.net.HttpURLConnection

class CharityServiceTest : BaseTest() {

    private val charityService: CharityService by inject()

    @Test
    fun `get charities successfully`() {
        mockHttpResponse(mockServer, HttpURLConnection.HTTP_OK, "charities_success.json")
        runBlocking {
            val charityListEntity = charityService.getCharities()
            assertEquals(
                charityListEntity.data?.get(0)?.id,
                7331
            )
        }
    }

    @Test(expected = HttpException::class)
    fun `get charities failed`() {
        mockHttpResponse(mockServer, HttpURLConnection.HTTP_BAD_REQUEST, "charities_failure.json")
        runBlocking {
            charityService.getCharities()
        }
    }
}