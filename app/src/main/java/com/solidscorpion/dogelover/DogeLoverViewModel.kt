package com.solidscorpion.dogelover

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import okhttp3.OkHttpClient
import javax.inject.Inject

class DogeLoverViewModel @Inject constructor(private val okHttpClient: OkHttpClient) : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String>
        get() = _data

    fun search(data: String?) {
        if (data.isNullOrEmpty()) return
        _data.value = data
    }

}