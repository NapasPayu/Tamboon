package com.napas.tamboon.domain.repository

import com.napas.tamboon.domain.model.DonationCreation
import com.napas.tamboon.domain.model.Result
import com.napas.tamboon.domain.model.ResultWrapper

interface DonationRepository {
    suspend fun createDonation(donationCreation: DonationCreation): ResultWrapper<Result>
}