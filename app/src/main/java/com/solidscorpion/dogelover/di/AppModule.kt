package com.solidscorpion.dogelover.di

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import androidx.room.Room
import com.solidscorpion.dogelover.Constants
import com.solidscorpion.dogelover.data.database.AppDb
import com.solidscorpion.dogelover.repo.RepoImpl
import com.solidscorpion.dogelover.repo.Repository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [ViewModelModule::class, NetworkModule::class])
class AppModule {

    @Provides
    @Singleton
    fun provideRepo(repoImpl: RepoImpl): Repository = repoImpl

    @Provides
    @Singleton
    fun provideDatabase(app: Application): AppDb {
        return Room.databaseBuilder(app, AppDb::class.java, "dogo-db")
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    fun providePreferences(app: Application): SharedPreferences {
        return app.getSharedPreferences(Constants.PREF_NAME, Context.MODE_PRIVATE)
    }
}