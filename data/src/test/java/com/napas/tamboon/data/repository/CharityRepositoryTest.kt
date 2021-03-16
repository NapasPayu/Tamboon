package com.napas.tamboon.data.repository

import com.napas.tamboon.data.model.CharityEntity
import com.napas.tamboon.data.model.CharityListEntity
import com.napas.tamboon.data.model.mapper.CharityMapper
import com.napas.tamboon.data.remote.CharityService
import com.napas.tamboon.domain.model.ResultWrapper
import com.napas.tamboon.domain.repository.CharityRepository
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertTrue
import org.junit.Test

class CharityRepositoryTest {

    private val charityService: CharityService = mockk()
    private val charityMapper: CharityMapper = mockk(relaxed = true)
    private val charityRepository: CharityRepository =
        CharityRepositoryImpl(charityService, charityMapper)

    @Test
    fun `get charities with successful service`() = runBlocking {
        coEvery { charityService.getCharities() } returns CharityListEntity(
            total = 1, data = listOf(
                CharityEntity(
                    id = 7331,
                    name = "Habitat for Humanity",
                    logoUrl = "http://www.adamandlianne.com/uploads/2/2/1/6/2216267/3231127.gif"
                )
            )
        )
        val result = charityRepository.getCharities()
        assertTrue(result is ResultWrapper.Success)
    }

    @Test
    fun `get charities with failed service`() = runBlocking {
        coEvery { charityService.getCharities() } throws Exception()
        val result = charityRepository.getCharities()
        assertTrue(result is ResultWrapper.GenericError)
    }
}