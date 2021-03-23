package com.napas.tamboon.data.repository.di

import com.napas.tamboon.data.repository.CharityRepositoryImpl
import com.napas.tamboon.data.repository.DonationRepositoryImpl
import com.napas.tamboon.data.repository.OmiseRepositoryImpl
import com.napas.tamboon.domain.repository.CharityRepository
import com.napas.tamboon.domain.repository.DonationRepository
import com.napas.tamboon.domain.repository.OmiseRepository
import org.koin.dsl.module

val repositoryModule = module {
    single<CharityRepository> { CharityRepositoryImpl(get(), get()) }
    single<DonationRepository> { DonationRepositoryImpl(get(), get(), get()) }
    single<OmiseRepository> { OmiseRepositoryImpl(get(), get(), get()) }
}