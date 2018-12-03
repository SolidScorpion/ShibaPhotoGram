package com.solidscorpion.dogelover.di

import androidx.lifecycle.ViewModel
import com.solidscorpion.dogelover.DogeLoverViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(DogeLoverViewModel::class)
    abstract fun bindDogeLoverViewModel(model: DogeLoverViewModel): ViewModel
}