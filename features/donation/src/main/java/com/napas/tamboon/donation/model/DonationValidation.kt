package com.napas.tamboon.donation.model

data class DonationValidation(
    val isCreditCardValid: Boolean = false,
    val isCardNameValid: Boolean = false,
    val isExpiryDateValid: Boolean = false,
    val isSecurityCodeValid: Boolean = false,
    val amount: String = ""
) {
    val isValid: Boolean get() = isCreditCardValid && isCardNameValid && isExpiryDateValid && isSecurityCodeValid && amount.isNotEmpty()
}