package com.napas.tamboon.data.model.mapper

import com.napas.tamboon.data.model.DonationCreationEntity
import com.napas.tamboon.domain.model.DonationCreation

class DonationCreationMapper : Mapper<DonationCreation, DonationCreationEntity> {

    override fun map(input: DonationCreation): DonationCreationEntity {
        return with(input) {
            DonationCreationEntity(
                name = name,
                token = token,
                amount = amount
            )
        }
    }
}