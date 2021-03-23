package com.napas.tamboon.data.model.mapper

import com.napas.tamboon.domain.model.CardParam

class CardParamMapper : Mapper<CardParam, co.omise.android.models.CardParam> {

    override fun map(input: CardParam): co.omise.android.models.CardParam {
        return with(input) {
            co.omise.android.models.CardParam(
                name = name,
                number = number,
                expirationMonth = expirationMonth,
                expirationYear = expirationYear,
                securityCode = securityCode
            )
        }
    }
}