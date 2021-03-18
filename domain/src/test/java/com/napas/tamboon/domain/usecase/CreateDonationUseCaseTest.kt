package com.napas.tamboon.domain.usecase

import com.napas.tamboon.domain.model.DonationCreation
import com.napas.tamboon.domain.model.Result
import com.napas.tamboon.domain.model.ResultWrapper
import com.napas.tamboon.domain.repository.DonationRepository
import io.mockk.coEvery
import io.mockk.mockk
import org.junit.Assert.assertTrue
import org.junit.Test

class CreateDonationUseCaseTest : BaseTest() {

    private val donationRepository: DonationRepository = mockk()
    private val createDonationUseCase = CreateDonationUseCase(donationRepository)
    private val fakeDonationCreation = DonationCreation(
        name = "John Doe",
        token = "tokn_test_deadbeef",
        amount = 10000
    )

    @Test
    fun `create donation with successful repository`() = testCoroutineRule.runBlockingTest {
        coEvery { donationRepository.createDonation(any()) } returns ResultWrapper.Success(
            Result(
                success = true
            )
        )
        val resultWrapper = createDonationUseCase(fakeDonationCreation)
        assertTrue(resultWrapper is ResultWrapper.Success && resultWrapper.data.success)
    }

    @Test
    fun `create donation with failed repository`() = testCoroutineRule.runBlockingTest {
        coEvery { donationRepository.createDonation(any()) } returns ResultWrapper.HttpError(Result())
        val resultWrapper = createDonationUseCase(fakeDonationCreation)
        assertTrue(resultWrapper is ResultWrapper.HttpError && !resultWrapper.result.success)
    }
}