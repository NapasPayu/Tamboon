package com.napas.tamboon.domain.usecase

import com.napas.tamboon.domain.model.Charity
import com.napas.tamboon.domain.model.Result
import com.napas.tamboon.domain.model.ResultWrapper
import com.napas.tamboon.domain.repository.CharityRepository
import io.mockk.coEvery
import io.mockk.mockk
import org.junit.Assert.assertTrue
import org.junit.Test

class GetCharitiesUseCaseTest : BaseTest() {

    private val charityRepository: CharityRepository = mockk()
    private val getCharitiesUseCase = GetCharitiesUseCase(charityRepository)

    @Test
    fun `get charities with successful repository`() = testCoroutineRule.runBlockingTest {
        coEvery { charityRepository.getCharities() } returns ResultWrapper.Success(listOf(Charity()))
        val resultWrapper = getCharitiesUseCase()
        assertTrue(resultWrapper is ResultWrapper.Success && resultWrapper.data.isNotEmpty())
    }

    @Test
    fun `get charities with failed repository`() = testCoroutineRule.runBlockingTest {
        coEvery { charityRepository.getCharities() } returns ResultWrapper.HttpError(Result())
        val resultWrapper = getCharitiesUseCase()
        assertTrue(resultWrapper is ResultWrapper.HttpError && !resultWrapper.result.success)
    }
}