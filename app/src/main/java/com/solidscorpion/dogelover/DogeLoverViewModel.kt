package com.solidscorpion.dogelover

import androidx.lifecycle.ViewModel
import okhttp3.OkHttpClient
import javax.inject.Inject

class DogeLoverViewModel @Inject constructor(private val okHttpClient: OkHttpClient) : ViewModel() {
}