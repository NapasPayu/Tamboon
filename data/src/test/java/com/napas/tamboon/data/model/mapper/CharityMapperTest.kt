package com.napas.tamboon.data.model.mapper

import com.napas.tamboon.data.model.CharityEntity
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class CharityMapperTest {

    private lateinit var charityMapper: CharityMapper

    @Before
    fun setup() {
        charityMapper = CharityMapper()
    }

    @Test
    fun `map from entity`() {
        val charityEntity = CharityEntity(
            id = 7331,
            name = "Habitat for Humanity",
            logoUrl = "http://www.adamandlianne.com/uploads/2/2/1/6/2216267/3231127.gif"
        )
        val charity = charityMapper.map(charityEntity)
        assertEquals(charityEntity.id, charity.id)
        assertEquals(charityEntity.name, charity.name)
        assertEquals(charityEntity.logoUrl, charity.logoUrl)
    }
}