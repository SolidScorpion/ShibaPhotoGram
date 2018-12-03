package com.solidscorpion.dogelover.api

import kotlinx.coroutines.Deferred
import okhttp3.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface FlickrService {
    @GET("method=flickr.photos.search&format=json&nojsoncallback=1")
    fun search(@Query("api_key") apiKey: String, @Query("tags") tags: String): Deferred<Response>
}