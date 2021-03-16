package com.napas.tamboon.data.remote

import com.napas.tamboon.data.model.DonationCreationEntity
import com.napas.tamboon.data.model.ResultEntity
import retrofit2.http.Body
import retrofit2.http.POST

interface DonationService {

    @POST("donations")
    suspend fun createDonation(@Body donationCreationEntity: DonationCreationEntity): ResultEntity
}