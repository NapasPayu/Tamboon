package com.napas.tamboon.charitylist.di

import com.napas.tamboon.charitylist.CharityListViewModel
import org.koin.dsl.module

val featureCharityListModule = module {
    single { CharityListViewModel(get()) }
}