package com.napas.tamboon.donation.model

data class DonationValidation(
    val creditCardNumber: String = "",
    val amount: String = ""
) {
    val isValid: Boolean get() = creditCardNumber.length == 16 && amount.isNotEmpty()
}