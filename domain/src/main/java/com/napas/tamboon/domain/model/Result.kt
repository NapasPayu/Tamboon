package com.napas.tamboon.domain.model

data class Result(
    val success: Boolean = false,
    val code: String = "",
    val message: String = ""
)