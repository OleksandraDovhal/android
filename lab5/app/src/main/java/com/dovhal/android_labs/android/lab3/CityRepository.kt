package com.dovhal.android_labs.android.lab3

import android.content.Context
import android.util.Log
import com.dovhal.android_labs.android.lab3.database.City
import com.dovhal.android_labs.android.lab3.database.CityDao

class CityRepository(private val cityDao: CityDao, val context: Context) {

    suspend fun getCitiesList(): List<City>? {
        return try {
            cityDao.getAll()
        } catch (e: Exception) {
            Log.e(CityRepository::class.java.simpleName.toString(), e.toString())
            null
        }
    }

    suspend fun insertCitiesListToDb(list: List<City>) {
        try {
            cityDao.insertAll(list)
        } catch (e: Exception) {
            Log.e(CityRepository::class.java.simpleName.toString(), e.toString())
        }

    }
    suspend fun insertCity(city: City) {
        cityDao.insert(city)
    }

    suspend fun deleteAll() {
        cityDao.deleteAll()
    }
}