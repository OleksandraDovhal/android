package com.dovhal.android_labs.android.lab5.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [City::class],
    version = 4,
    exportSchema = true
)
abstract class ApplicationDatabase : RoomDatabase() {
    abstract fun cityDao(): CityDao
}
