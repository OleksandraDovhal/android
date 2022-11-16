package com.dovhal.android_labs.android.lab5.network

import com.dovhal.android_labs.android.lab5.network.responces.WeatherResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApiService {

    @GET("forecast?")
    suspend fun getCurrentWeather(
        @Query("latitude") latitude: Float,
        @Query("longitude") longitude: Float,
        @Query("current_weather") currentWeather: Boolean
    ): Call<WeatherResponse>

}