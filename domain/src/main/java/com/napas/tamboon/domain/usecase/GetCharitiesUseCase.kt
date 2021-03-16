package com.napas.tamboon.domain.usecase

import com.napas.tamboon.domain.repository.CharityRepository

class GetCharitiesUseCase(
    private val charityRepository: CharityRepository
) {
    suspend operator fun invoke() = charityRepository.getCharities()
}