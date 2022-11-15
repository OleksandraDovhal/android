package com.dovhal.android_labs.android.lab5.network

import com.dovhal.android_labs.android.lab5.annotations.OpenClass
import retrofit2.Retrofit

@OpenClass
class ApiClient(retrofit: Retrofit) {

    val weatherService: WeatherApiService = retrofit.create(WeatherApiService::class.java)
}