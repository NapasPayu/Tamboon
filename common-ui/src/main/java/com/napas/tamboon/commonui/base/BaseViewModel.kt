package com.napas.tamboon.commonui.base

import androidx.lifecycle.ViewModel
import com.napas.tamboon.commonui.model.AlertEvent
import com.napas.tamboon.commonui.util.SingleLiveEvent

abstract class BaseViewModel : ViewModel() {
    val loadingEvent by lazy { SingleLiveEvent<Boolean>() }
    val alertEvent by lazy { SingleLiveEvent<AlertEvent>() }
}