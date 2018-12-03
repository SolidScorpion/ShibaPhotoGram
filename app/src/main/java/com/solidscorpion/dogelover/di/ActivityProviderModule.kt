package com.solidscorpion.dogelover.di

import com.solidscorpion.dogelover.ui.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityProviderModule {
    @ContributesAndroidInjector //(modules = [FragmentProviderModule::class])
    abstract fun contributeMainActivity(): MainActivity
}