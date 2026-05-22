package com.example.grocery

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "sales")
data class Sale(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val goodId: Int,
    val quantity: Int,
    val totalPrice: Double,
    val saleDate: String
)
