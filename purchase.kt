package com.example.grocery

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "purchases")
data class Purchase(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val goodId: Int,
    val quantity: Int,
    val totalPrice: Double,
    val paymentType: String,
    val receiveDate: String,
    val isPaid: Boolean = false,
    val payDate: String? = null
)
