package com.solidscorpion.dogelover.repo

import com.solidscorpion.dogelover.Constants
import com.solidscorpion.dogelover.data.api.FlickrService
import com.solidscorpion.dogelover.data.database.AppDb
import com.solidscorpion.dogelover.pojo.Dogo
import kotlinx.coroutines.Deferred
import okhttp3.ResponseBody
import javax.inject.Inject

class RepoImpl @Inject constructor(
    private val api: FlickrService,
    private val db: AppDb
) : Repository {
    override fun getAllDogos(): List<Dogo> {
        return db.dogoDao().getAll()
    }

    override fun search(apiKey: String, tags: String): Deferred<ResponseBody> {
        return api.search(Constants.FLICKR_KEY, tags)
    }
}