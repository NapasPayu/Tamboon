package com.napas.tamboon.donation

import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.napas.tamboon.commonui.base.BaseViewModel
import com.napas.tamboon.domain.model.DonationCreation
import com.napas.tamboon.domain.model.Result
import com.napas.tamboon.domain.model.ResultWrapper
import com.napas.tamboon.domain.usecase.CreateDonationUseCase
import com.napas.tamboon.donation.model.DonationValidation
import kotlinx.coroutines.launch

class DonationViewModel(
    private val createDonationUseCase: CreateDonationUseCase
) : BaseViewModel() {

    val creditCardNumber = MutableLiveData<String>()
    val amount = MutableLiveData<String>()
    val donationResult = MutableLiveData<Result>()
    val donationValidation = MediatorLiveData<DonationValidation>()

    init {
        donationValidation.apply {
            addSource(creditCardNumber) {
                donationValidation.value =
                    donationValidation.value?.copy(creditCardNumber = it) ?: DonationValidation(
                        creditCardNumber = it
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

    fun donate() {
        showLoading()
        val donationCreation = DonationCreation(
            name = BuildConfig.DONATION_NAME,
            token = BuildConfig.DONATION_TOKEN,
            amount = amount.value?.toIntOrNull() ?: 0
        )
        viewModelScope.launch {
            when (val result = createDonationUseCase(donationCreation)) {
                is ResultWrapper.Success -> {
                    donationResult.value = result.data
                }
                is ResultWrapper.HttpError -> {
                    alert(titleRes = R.string.error_title, message = result.result.message)
                }
                is ResultWrapper.GenericError -> {
                    alert(titleRes = R.string.error_title, messageRes = R.string.error_msg_generic)
                }
            }

            hideLoading()
        }
    }
}