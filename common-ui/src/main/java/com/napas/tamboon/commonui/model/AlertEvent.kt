package com.napas.tamboon.commonui.model

import androidx.annotation.StringRes

data class AlertEvent(
    val title: String? = null,
    val message: String? = null,
    @StringRes val titleRes: Int? = null,
    @StringRes val messageRes: Int? = null
)