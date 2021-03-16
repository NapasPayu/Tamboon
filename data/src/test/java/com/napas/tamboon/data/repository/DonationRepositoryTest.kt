package com.napas.tamboon.data.repository

import com.napas.tamboon.data.model.ResultEntity
import com.napas.tamboon.data.model.mapper.DonationCreationMapper
import com.napas.tamboon.data.model.mapper.ResultMapper
import com.napas.tamboon.data.remote.DonationService
import com.napas.tamboon.domain.model.DonationCreation
import com.napas.tamboon.domain.model.ResultWrapper
import com.napas.tamboon.domain.repository.DonationRepository
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertTrue
import org.junit.Test

class DonationRepositoryTest {

    private val donationService: DonationService = mockk()
    private val donationCreationMapper: DonationCreationMapper = mockk(relaxed = true)
    private val resultMapper: ResultMapper = mockk(relaxed = true)
    private val donationRepository: DonationRepository =
        DonationRepositoryImpl(donationService, donationCreationMapper, resultMapper)
    private val fakeDonationCreation = DonationCreation(
        name = "John Doe",
        token = "tokn_test_deadbeef",
        amount = 10000
    )

    @Test
    fun `create donation with successful service`() = runBlocking {
        coEvery { donationService.createDonation(any()) } returns ResultEntity(
            success = true,
            errorCode = "insufficient_minerals",
            errorMessage = "Card has insufficient balance."
        )
        val result = donationRepository.createDonation(fakeDonationCreation)
        assertTrue(result is ResultWrapper.Success)
    }

    @Test
    fun `create donation with failed service`() = runBlocking {
        coEvery { donationService.createDonation(any()) } throws Exception()
        val result = donationRepository.createDonation(fakeDonationCreation)
        assertTrue(result is ResultWrapper.GenericError)
    }
}