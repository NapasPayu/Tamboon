package com.napas.tamboon.data.remote

import com.napas.tamboon.data.model.DonationCreationEntity
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertTrue
import org.junit.Test
import org.koin.test.inject
import retrofit2.HttpException
import java.net.HttpURLConnection

class DonationServiceTest : BaseTest() {

    private val donationService: DonationService by inject()
    private val fakeDonationCreationEntity = DonationCreationEntity(
        name = "John Doe",
        token = "tokn_test_deadbeef",
        amount = 10000
    )

    @Test
    fun `create donation successfully`() {
        mockHttpResponse(mockServer, HttpURLConnection.HTTP_OK, "donations_success.json")
        runBlocking {
            val resultEntity = donationService.createDonation(fakeDonationCreationEntity)
            assertTrue(resultEntity.success ?: false)
        }
    }

    @Test(expected = HttpException::class)
    fun `create donation failed`() {
        mockHttpResponse(mockServer, HttpURLConnection.HTTP_BAD_REQUEST, "donations_failure.json")
        runBlocking {
            donationService.createDonation(fakeDonationCreationEntity)
        }
    }
}