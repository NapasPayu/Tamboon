package com.napas.tamboon.data.repository

import com.napas.tamboon.data.model.mapper.DonationCreationMapper
import com.napas.tamboon.data.model.mapper.ResultMapper
import com.napas.tamboon.data.remote.DonationService
import com.napas.tamboon.data.util.safeApiCall
import com.napas.tamboon.domain.model.DonationCreation
import com.napas.tamboon.domain.model.Result
import com.napas.tamboon.domain.model.ResultWrapper
import com.napas.tamboon.domain.repository.DonationRepository

class DonationRepositoryImpl(
    private val donationService: DonationService,
    private val donationCreationMapper: DonationCreationMapper,
    private val resultMapper: ResultMapper
) : DonationRepository {
    override suspend fun createDonation(donationCreation: DonationCreation): ResultWrapper<Result> {
        val donationCreationEntity = donationCreationMapper.map(donationCreation)
        return safeApiCall {
            donationService.createDonation(donationCreationEntity).let {
                resultMapper.map(it)
            }
        }
    }
}