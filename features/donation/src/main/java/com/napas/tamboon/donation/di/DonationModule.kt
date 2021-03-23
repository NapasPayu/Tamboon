package com.napas.tamboon.donation.di

import com.napas.tamboon.donation.DonationViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val featureDonationModule = module {
    viewModel { DonationViewModel(get(), get()) }
}