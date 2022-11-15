package com.dovhal.android_labs.android.lab5.network.entities

import kotlinx.serialization.SerialName

data class MainWeatherInfo(
    val temp: Double,
    val humidity: Double,
    val pressure: Double,
    @SerialName("temp_min") val tempMin: Double,
    @SerialName("temp_max") val tempMax: Double
)