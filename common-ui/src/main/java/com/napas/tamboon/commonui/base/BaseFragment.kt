package com.napas.tamboon.commonui.base

import androidx.fragment.app.Fragment
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.napas.tamboon.commonui.R
import com.napas.tamboon.commonui.model.AlertEvent

abstract class BaseFragment : Fragment() {

    protected fun showAlertDialog(alertEvent: AlertEvent) {
        context?.let {
            MaterialAlertDialogBuilder(it).apply {
                alertEvent.title?.let { title ->
                    setTitle(title)
                }
                alertEvent.titleRes?.let { titleRes ->
                    setTitle(titleRes)
                }
                alertEvent.message?.let { message ->
                    setMessage(message)
                }
                alertEvent.messageRes?.let { messageRes ->
                    setMessage(messageRes)
                }
                setPositiveButton(R.string.ok, null)
            }.show()
        }

    }
}