package com.napas.tamboon.data.model.di

import com.napas.tamboon.data.model.mapper.CharityMapper
import com.napas.tamboon.data.model.mapper.DonationCreationMapper
import com.napas.tamboon.data.model.mapper.ResultMapper
import org.koin.dsl.module

val modelModule = module {
    single { CharityMapper() }
    single { DonationCreationMapper() }
    single { ResultMapper() }
}
