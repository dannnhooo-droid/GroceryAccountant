package com.example.grocery

import android.content.Context
import androidx.room.*

@Database(entities = [Good::class, Supplier::class, Sale::class, Purchase::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun groceryDao(): GroceryDao
    
    companion object {
        @Volatile private var INSTANCE: AppDatabase? = null
        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                Room.databaseBuilder(context, AppDatabase::class.java, "grocery_db").build()
                    .also { INSTANCE = it }
            }
        }
    }
}
