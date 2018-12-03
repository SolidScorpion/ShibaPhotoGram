package com.solidscorpion.dogelover.di

import com.solidscorpion.dogelover.Constants
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Named

@Module
class NetworkModule {
    @Provides
    fun provideOkHttp(): OkHttpClient {
        return OkHttpClient.Builder()
            .build()
    }

    @Provides
    @Named("flickr")
    fun provideflickr(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            .baseUrl(Constants.FLICKR_API)
            .client(okHttpClient)
            .build()

    }
}