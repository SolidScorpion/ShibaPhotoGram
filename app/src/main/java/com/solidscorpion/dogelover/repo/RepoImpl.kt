package com.solidscorpion.dogelover.repo

import com.solidscorpion.dogelover.api.FlickrService
import com.solidscorpion.dogelover.database.AppDb
import com.solidscorpion.dogelover.pojo.Dogo
import kotlinx.coroutines.Deferred
import okhttp3.ResponseBody
import javax.inject.Inject

class RepoImpl @Inject constructor(
    private val api: FlickrService,
    private val db: AppDb
) : Repository {
    override fun getAllDogos(): List<Dogo> {
        return db.getDogoDao().getAll()
    }

    override fun search(apiKey: String, tags: String): Deferred<ResponseBody> {
        return api.search(apiKey, tags)
    }
}