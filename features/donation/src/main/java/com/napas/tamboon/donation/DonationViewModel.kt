package com.napas.tamboon.donation

import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.napas.tamboon.commonui.base.BaseViewModel
import com.napas.tamboon.commonui.util.SingleLiveEvent
import com.napas.tamboon.domain.model.*
import com.napas.tamboon.domain.usecase.CreateDonationUseCase
import com.napas.tamboon.domain.usecase.GetCreditCardTokenUseCase
import com.napas.tamboon.donation.model.DonationValidation
import kotlinx.coroutines.launch

class DonationViewModel(
    private val getCreditCardTokenUseCase: GetCreditCardTokenUseCase,
    private val createDonationUseCase: CreateDonationUseCase
) : BaseViewModel() {

    val amount = MutableLiveData<String>()
    val donationResult = SingleLiveEvent<Result>()
    val donationValidation = MediatorLiveData<DonationValidation>()
    private val isCreditCardValid = MutableLiveData<Boolean>()
    private val isCardNameValid = MutableLiveData<Boolean>()
    private val isExpiryDateValid = MutableLiveData<Boolean>()
    private val isSecurityCodeValid = MutableLiveData<Boolean>()

    init {
        donationValidation.apply {
            addSource(isCreditCardValid) {
                donationValidation.value =
                    donationValidation.value?.copy(isCreditCardValid = it) ?: DonationValidation(
                        isCreditCardValid = it
                    )
            }
            addSource(isCardNameValid) {
                donationValidation.value =
                    donationValidation.value?.copy(isCardNameValid = it) ?: DonationValidation(
                        isCardNameValid = it
                    )
            }
            addSource(isExpiryDateValid) {
                donationValidation.value =
                    donationValidation.value?.copy(isExpiryDateValid = it) ?: DonationValidation(
                        isExpiryDateValid = it
                    )
            }
            addSource(isSecurityCodeValid) {
                donationValidation.value =
                    donationValidation.value?.copy(isSecurityCodeValid = it) ?: DonationValidation(
                        isSecurityCodeValid = it
                    )
            }
            addSource(amount) {
                donationValidation.value =
                    donationValidation.value?.copy(amount = it) ?: DonationValidation(
                        amount = it
                    )
            }
        }
    }

    fun onCreditCardChanged(isValid: Boolean) {
        isCreditCardValid.value = isValid
    }

    fun onCardNameChanged(isValid: Boolean) {
        isCardNameValid.value = isValid
    }

    fun onExpiryDateChanged(isValid: Boolean) {
        isExpiryDateValid.value = isValid
    }

    fun onSecurityCodeChanged(isValid: Boolean) {
        isSecurityCodeValid.value = isValid
    }

    fun donate(
        creditCard: String,
        cardName: String,
        expiryMonth: Int,
        expiryYear: Int,
        securityCode: String
    ) {
        showLoading()
        viewModelScope.launch {
            val cardParam = CardParam(
                number = creditCard,
                name = cardName,
                expirationMonth = expiryMonth,
                expirationYear = expiryYear,
                securityCode = securityCode
            )
            val resultToken: ResultWrapper<String> = getCreditCardTokenUseCase(cardParam)
            var resultDonation: ResultWrapper<Result>? = null
            if (resultToken is ResultWrapper.Success) {
                val donationCreation = DonationCreation(
                    name = cardName,
                    token = resultToken.data,
                    amount = amount.value?.toIntOrNull() ?: 0
                )
                resultDonation = createDonationUseCase(donationCreation)
            }
            when {
                resultToken is ResultWrapper.GenericError -> alert(
                    titleRes = R.string.error_title,
                    message = resultToken.throwable.localizedMessage
                )
                resultDonation is ResultWrapper.HttpError -> alert(
                    titleRes = R.string.error_title,
                    message = resultDonation.result.message
                )
                resultDonation is ResultWrapper.GenericError -> alert(
                    titleRes = R.string.error_title,
                    messageRes = R.string.error_msg_generic
                )
                resultDonation is ResultWrapper.Success -> {
                    donationResult.value = resultDonation.data
                }
            }

            hideLoading()
        }
    }
}