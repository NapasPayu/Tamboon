package com.napas.tamboon.charitylist.di

import com.napas.tamboon.charitylist.CharityListViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val featureCharityListModule = module {
    viewModel { CharityListViewModel(get()) }
}