package com.solidscorpion.dogelover.data.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.solidscorpion.dogelover.pojo.Dogo

@Dao
interface DogoDao {
    @Query("SELECT * FROM dogo")
    fun getAll(): List<Dogo>

    @Insert
    fun insertAll(vararg users: Dogo)

    @Delete
    fun delete(user: Dogo)
}