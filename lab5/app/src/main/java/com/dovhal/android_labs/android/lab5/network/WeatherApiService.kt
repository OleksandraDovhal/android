package com.dovhal.android_labs.android.lab5.network

import com.dovhal.android_labs.android.lab5.network.responces.WeatherResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApiService {

    @GET("weather")
    fun getCurrentWeather(@Query("q") location: String): Call<WeatherResponse>
}