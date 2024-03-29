package com.marcosfa.firebaseyroom.Room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Houses::class ], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun houseDAO():HousesDAO

}
