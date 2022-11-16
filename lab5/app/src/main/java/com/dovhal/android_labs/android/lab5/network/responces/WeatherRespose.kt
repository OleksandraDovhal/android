package com.dovhal.android_labs.android.lab5.network.responces

import com.dovhal.android_labs.android.lab5.network.entities.MainWeatherInfo
import com.dovhal.android_labs.android.lab5.network.entities.Weather
import com.dovhal.android_labs.android.lab5.network.entities.Wind
import kotlinx.serialization.Serializable

@Serializable
data class WeatherResponse(
    val id: Long,
    val main: MainWeatherInfo,
    val weather: List<Weather>,
    val wind: Wind,
    val rain: Map<String, Int>?,
    val clouds: Map<String, Int>?
)