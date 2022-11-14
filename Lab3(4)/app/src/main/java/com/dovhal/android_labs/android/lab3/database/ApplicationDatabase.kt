package com.dovhal.android_labs.android.lab3.database

import android.content.Context
import androidx.annotation.VisibleForTesting
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

@Database(
    entities = [City::class],
    version = 3,
    exportSchema = true
)
abstract class ApplicationDatabase : RoomDatabase() {
    abstract fun cityDao(): CityDao
}
