package com.napas.tamboon.data.model.di

import com.napas.tamboon.data.model.mapper.*
import org.koin.dsl.module

val modelModule = module {
    single { CharityMapper() }
    single { DonationCreationMapper() }
    single { ResultMapper() }
    single { CardParamMapper() }
    single { TokenMapper() }
}
