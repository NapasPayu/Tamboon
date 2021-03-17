package com.napas.tamboon.data.model

import com.google.gson.annotations.SerializedName

data class CharityEntity(
    val id: Int?,
    val name: String?,
    @SerializedName("logo_url")
    val logoUrl: String?
)