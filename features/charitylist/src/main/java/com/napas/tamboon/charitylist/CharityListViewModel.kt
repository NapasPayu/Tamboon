package com.napas.tamboon.charitylist

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.napas.tamboon.commonui.base.BaseViewModel
import com.napas.tamboon.domain.model.Charity
import com.napas.tamboon.domain.model.ResultWrapper
import com.napas.tamboon.domain.usecase.GetCharitiesUseCase
import kotlinx.coroutines.launch

class CharityListViewModel(
    private val getCharitiesUseCase: GetCharitiesUseCase
) : BaseViewModel() {

    val charities = MutableLiveData<List<Charity>>()

    init {
        showLoading()
        viewModelScope.launch {
            when (val result = getCharitiesUseCase()) {
                is ResultWrapper.Success -> {
                    charities.value = result.data
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