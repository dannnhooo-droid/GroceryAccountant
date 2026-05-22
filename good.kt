package com.example.grocery

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "goods")
data class Good(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val unitPriceBuy: Double,
    val unitPriceSell: Double,
    val supplierId: Int
)
