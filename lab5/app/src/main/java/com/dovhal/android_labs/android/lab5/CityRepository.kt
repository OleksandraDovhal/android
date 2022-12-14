package com.dovhal.android_labs.android.lab5

import android.content.Context
import android.util.Log
import com.dovhal.android_labs.android.lab5.database.entities.City
import com.dovhal.android_labs.android.lab5.database.dao.CityDao
import com.dovhal.android_labs.android.lab5.network.ApiClient
import com.dovhal.android_labs.android.lab5.network.responces.WeatherResponse
import kotlinx.coroutines.GlobalScope.coroutineContext
import kotlinx.coroutines.withContext
import retrofit2.await

class CityRepository(
    private val cityDao: CityDao,
    private val apiClient: ApiClient,
    val context: Context
) {

    suspend fun getCurrentWeather(latitude: Float, longitude: Float): WeatherResponse =
        withContext(coroutineContext) {
            return@withContext apiClient.weatherService.getCurrentWeather(latitude, longitude, true)
        }

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