package com.solidscorpion.dogelover.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.solidscorpion.dogelover.pojo.Dogo

@Database(entities = [Dogo::class], version = 1, exportSchema = false)
abstract class AppDb : RoomDatabase() {
    abstract fun getDogoDao(): DogoDao
}