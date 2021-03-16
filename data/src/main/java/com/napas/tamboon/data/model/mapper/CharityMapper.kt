package com.napas.tamboon.data.model.mapper

import com.napas.tamboon.data.model.CharityEntity
import com.napas.tamboon.domain.model.Charity

class CharityMapper : Mapper<CharityEntity, Charity> {

    override fun map(input: CharityEntity): Charity {
        return with(input) {
            Charity(
                id = id ?: 0,
                name = name ?: "",
                logoUrl = logoUrl ?: ""
            )
        }
    }
}