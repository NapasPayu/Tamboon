package com.napas.tamboon.data.model.mapper

import co.omise.android.models.Token

class TokenMapper : Mapper<Token, String> {

    override fun map(input: Token): String {
        return with(input) {
            id ?: ""
        }
    }
}