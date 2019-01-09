package com.solidscorpion.dogelover

import android.app.Activity
import android.app.Application
import com.facebook.stetho.Stetho
import com.solidscorpion.dogelover.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class DogeLoverApp : Application(), HasActivityInjector {
    @Inject
    lateinit var dispatcher: DispatchingAndroidInjector<Activity>

    override fun activityInjector(): AndroidInjector<Activity> = dispatcher

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Stetho.initializeWithDefaults(this)
        }
        DaggerAppComponent.builder().application(this)
            .build()
            .inject(this)
    }
}