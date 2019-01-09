package com.solidscorpion.dogelover.di

import com.facebook.stetho.okhttp3.StethoInterceptor
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.solidscorpion.dogelover.Constants
import com.solidscorpion.dogelover.api.FlickrService
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
            .addInterceptor(StethoInterceptor())
            .build()
    }

    @Provides
    @Named("flickr")
    fun provideflickrRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .baseUrl(Constants.FLICKR_API)
            .client(okHttpClient)
            .build()

    }

    @Provides
    fun provideFlickrService(@Named("flickr") retrofit: Retrofit): FlickrService {
        return retrofit.create(FlickrService::class.java)
    }
}