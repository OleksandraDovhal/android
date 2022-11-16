package com.dovhal.android_labs.android.lab5.network.responces

import com.dovhal.android_labs.android.lab5.network.entities.Weather
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class WeatherResponse(
    val latitude: Float,
    val longitude: Float,
    @Json(name = "generationtime_ms") val generationTime: Float,
    @Json(name = "elevation") val elevation: Float,
    @Json(name = "current_weather") val currentWeather: Weather
)