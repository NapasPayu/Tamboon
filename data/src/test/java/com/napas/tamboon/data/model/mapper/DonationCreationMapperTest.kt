package com.napas.tamboon.data.model.mapper

import com.napas.tamboon.domain.model.DonationCreation
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class DonationCreationMapperTest {

    private lateinit var donationCharityMapper: DonationCreationMapper

    @Before
    fun setup() {
        donationCharityMapper = DonationCreationMapper()
    }

    @Test
    fun `map from domain`() {
        val donationCreation = DonationCreation(
            name = "John Doe",
            token = "tokn_test_deadbeef",
            amount = 10000
        )
        val donationCreationEntity = donationCharityMapper.map(donationCreation)
        assertEquals(donationCreation.name, donationCreationEntity.name)
        assertEquals(donationCreation.token, donationCreationEntity.token)
        assertEquals(donationCreation.amount, donationCreationEntity.amount)
    }
}