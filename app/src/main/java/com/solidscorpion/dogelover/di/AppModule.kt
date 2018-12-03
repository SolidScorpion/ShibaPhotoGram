package com.solidscorpion.dogelover.di

import dagger.Module

@Module(includes = [ViewModelModule::class, NetworkModule::class])
class AppModule {
}