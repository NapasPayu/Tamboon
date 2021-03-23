package com.napas.tamboon.domain.model

data class CardParam(
    val name: String = "",
    val number: String = "",
    val expirationMonth: Int = 0,
    val expirationYear: Int = 0,
    val securityCode: String = ""
)