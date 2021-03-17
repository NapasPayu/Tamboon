package com.napas.tamboon.data.model

import com.google.gson.annotations.SerializedName

data class ResultEntity(
    val success: Boolean?,
    @SerializedName("error_code")
    val errorCode: String?,
    @SerializedName("error_message")
    val errorMessage: String?
)