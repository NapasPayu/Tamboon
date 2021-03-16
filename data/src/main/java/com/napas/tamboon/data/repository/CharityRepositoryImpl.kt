package com.napas.tamboon.data.repository

import com.napas.tamboon.data.model.mapper.CharityMapper
import com.napas.tamboon.data.remote.CharityService
import com.napas.tamboon.data.util.safeApiCall
import com.napas.tamboon.domain.model.Charity
import com.napas.tamboon.domain.model.ResultWrapper
import com.napas.tamboon.domain.repository.CharityRepository

class CharityRepositoryImpl(
    private val charityService: CharityService,
    private val charityMapper: CharityMapper
) : CharityRepository {
    override suspend fun getCharities(): ResultWrapper<List<Charity>> {
        return safeApiCall {
            charityService.getCharities().data?.map {
                charityMapper.map(it)
            } ?: emptyList()
        }
    }
}