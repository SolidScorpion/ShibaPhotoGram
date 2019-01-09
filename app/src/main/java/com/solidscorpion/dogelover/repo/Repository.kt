package com.solidscorpion.dogelover.repo

import com.solidscorpion.dogelover.pojo.Dogo
import kotlinx.coroutines.Deferred
import okhttp3.ResponseBody

interface Repository {
    fun search(apiKey: String, tags: String): Deferred<ResponseBody>

    fun getAllDogos(): List<Dogo>
}