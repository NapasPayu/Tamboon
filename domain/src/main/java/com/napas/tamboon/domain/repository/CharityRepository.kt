package com.napas.tamboon.domain.repository

import com.napas.tamboon.domain.model.Charity
import com.napas.tamboon.domain.model.ResultWrapper

interface CharityRepository {
    suspend fun getCharities(): ResultWrapper<List<Charity>>
}