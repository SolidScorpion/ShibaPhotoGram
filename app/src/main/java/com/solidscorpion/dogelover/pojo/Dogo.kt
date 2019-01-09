package com.solidscorpion.dogelover.pojo

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Dogo(
    @PrimaryKey var id: Int,
    var url: String
)