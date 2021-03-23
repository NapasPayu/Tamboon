package com.napas.tamboon.domain.di

import com.napas.tamboon.domain.usecase.CreateDonationUseCase
import com.napas.tamboon.domain.usecase.GetCharitiesUseCase
import com.napas.tamboon.domain.usecase.GetCreditCardTokenUseCase
import org.koin.dsl.module

val domainModule = module {
    single { GetCharitiesUseCase(get()) }
    single { CreateDonationUseCase(get()) }
    single { GetCreditCardTokenUseCase(get()) }
}