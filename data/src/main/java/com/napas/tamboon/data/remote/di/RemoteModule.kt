package com.napas.tamboon.data.remote.di

import com.napas.tamboon.data.BuildConfig
import com.napas.tamboon.data.remote.CharityService
import com.napas.tamboon.data.remote.DonationService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

fun createRemoteModule(baseApiUrl: String = BuildConfig.BASE_API_URL) = module {
    single {
        HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
    }
    single {
        OkHttpClient.Builder()
            .addInterceptor(get<HttpLoggingInterceptor>())
            .build()
    }
    single {
        Retrofit.Builder()
            .client(get())
            .baseUrl(baseApiUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    single { get<Retrofit>().create(CharityService::class.java) }
    single { get<Retrofit>().create(DonationService::class.java) }
}