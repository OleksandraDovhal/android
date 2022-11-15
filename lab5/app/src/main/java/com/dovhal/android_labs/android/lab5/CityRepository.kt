package com.dovhal.android_labs.android.lab5

import android.content.Context
import android.util.Log
import com.dovhal.android_labs.android.lab5.database.City
import com.dovhal.android_labs.android.lab5.database.CityDao
import com.dovhal.android_labs.android.lab5.network.ApiClient
import com.dovhal.android_labs.android.lab5.network.responces.WeatherResponse
import kotlinx.coroutines.GlobalScope.coroutineContext
import kotlinx.coroutines.withContext
import retrofit2.await

class CityRepository(
    private val cityDao: CityDao,
    val apiClient: ApiClient,
    val context: Context
) {

    suspend fun getCurrentWeather(location: String): WeatherResponse =
        withContext(coroutineContext) {
            apiClient.weatherService.getCurrentWeather(location).await()
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