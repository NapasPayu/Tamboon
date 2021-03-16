package com.napas.tamboon.di

import com.napas.tamboon.charitylist.di.featureCharityListModule
import com.napas.tamboon.data.model.di.modelModule
import com.napas.tamboon.data.remote.di.createRemoteModule
import com.napas.tamboon.data.repository.di.repositoryModule
import com.napas.tamboon.domain.di.domainModule

val appModule = listOf(
    modelModule,
    createRemoteModule(),
    repositoryModule,
    domainModule,
    featureCharityListModule
)