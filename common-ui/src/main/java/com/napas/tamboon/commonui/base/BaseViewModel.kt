package com.napas.tamboon.commonui.base

import androidx.annotation.StringRes
import androidx.lifecycle.ViewModel
import com.napas.tamboon.commonui.model.AlertEvent
import com.napas.tamboon.commonui.util.SingleLiveEvent

abstract class BaseViewModel : ViewModel() {
    val loadingEvent by lazy { SingleLiveEvent<Boolean>() }
    val alertEvent by lazy { SingleLiveEvent<AlertEvent>() }

    protected fun alert(
        title: String? = null,
        message: String? = null,
        @StringRes titleRes: Int? = null,
        @StringRes messageRes: Int? = null
    ) {
        alertEvent.value = AlertEvent(
            title = title,
            message = message,
            titleRes = titleRes,
            messageRes = messageRes
        )
    }

    protected fun showLoading() {
        loadingEvent.value = true
    }

    protected fun hideLoading() {
        loadingEvent.value = false
    }
}