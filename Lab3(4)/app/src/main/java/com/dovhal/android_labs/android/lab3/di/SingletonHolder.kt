package com.dovhal.android_labs.android.lab3.di

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.dovhal.android_labs.android.lab3.CityRepository
import com.dovhal.android_labs.android.lab3.database.ApplicationDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

// Singleton Holder is a simple solution that allows user to create Singleton objects in Kotlin. Not an actual Dependency Injection.
object SingletonHolder {

    lateinit var application: Application
    private val context: Context get() = application

    private val appDatabase by lazy {
        Room.databaseBuilder(
            application,
            ApplicationDatabase::class.java,
            "database"
        )
            .fallbackToDestructiveMigration()
            .build()
    }

    val cityRepository: CityRepository by lazy {
        CityRepository(
            appDatabase.cityDao(),
            context
        )
    }

    fun init(application: Application) {
        this.application = application
    }
    fun clearDatabase() {
        GlobalScope.launch(Dispatchers.IO) {
            appDatabase.cityDao().deleteAll()
        }

    }
}