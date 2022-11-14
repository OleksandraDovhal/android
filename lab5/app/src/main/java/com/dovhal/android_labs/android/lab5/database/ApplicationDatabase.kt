package com.dovhal.android_labs.android.lab5.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.dovhal.android_labs.android.lab5.database.dao.UserDao
import com.dovhal.android_labs.android.lab5.database.enities.User

@Database(entities = [User::class], version = 2)
abstract class ApplicationDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao

    companion object {
        @Volatile
        private var INSTANCE: ApplicationDatabase? = null

        fun getInstance(context: Context): ApplicationDatabase {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        ApplicationDatabase::class.java,
                        "users_database"
                    )
                        .allowMainThreadQueries()
                        .fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}
