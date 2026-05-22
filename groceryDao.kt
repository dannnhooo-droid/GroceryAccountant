package com.example.grocery

import androidx.room.*

@Dao
interface GroceryDao {
    @Insert suspend fun insertGood(good: Good)
    @Insert suspend fun insertSupplier(supplier: Supplier)
    @Insert suspend fun insertSale(sale: Sale)
    @Insert suspend fun insertPurchase(purchase: Purchase)
    @Query("SELECT * FROM goods") suspend fun getAllGoods(): List<Good>
    @Query("SELECT * FROM suppliers") suspend fun getAllSuppliers(): List<Supplier>
    @Query("SELECT SUM(totalPrice) FROM sales WHERE saleDate = :date") suspend fun getDailySales(date: String): Double?
    @Query("SELECT SUM(totalPrice) FROM sales WHERE saleDate BETWEEN :start AND :end") suspend fun getSalesBetween(start: String, end: String): Double?
    @Query("SELECT SUM(totalPrice) FROM purchases WHERE paymentType='???' AND isPaid=0") suspend fun getTotalDebt(): Double?
    @Update suspend fun updatePurchase(purchase: Purchase)
}
