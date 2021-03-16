package com.napas.tamboon.domain.usecase

import com.napas.tamboon.domain.model.DonationCreation
import com.napas.tamboon.domain.repository.DonationRepository

class CreateDonationUseCase(
    private val donationRepository: DonationRepository
) {
    suspend operator fun invoke(donationCreation: DonationCreation) =
        donationRepository.createDonation(donationCreation)
}