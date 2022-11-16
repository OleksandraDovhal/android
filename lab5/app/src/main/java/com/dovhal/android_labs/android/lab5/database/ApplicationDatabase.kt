package com.dovhal.android_labs.android.lab5.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.dovhal.android_labs.android.lab5.database.entities.City
import com.dovhal.android_labs.android.lab5.database.dao.CityDao

@Database(
    entities = [City::class],
    version = 5,
    exportSchema = true
)
abstract class ApplicationDatabase : RoomDatabase() {
    abstract fun cityDao(): CityDao
}
