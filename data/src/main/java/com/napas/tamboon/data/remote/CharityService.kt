package com.napas.tamboon.data.remote

import com.napas.tamboon.data.model.CharityListEntity
import retrofit2.http.GET

interface CharityService {

    @GET("charities")
    suspend fun getCharities(): CharityListEntity
}