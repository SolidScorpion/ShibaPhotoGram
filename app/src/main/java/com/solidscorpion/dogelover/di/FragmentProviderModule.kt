package com.solidscorpion.dogelover.di

import com.solidscorpion.dogelover.ui.main.StartFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentProviderModule {
    @ContributesAndroidInjector
    abstract fun provideStartFragment(): StartFragment
}