package com.dovhal.android_labs.android.lab5.network.entities

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Weather(
    val temperature: Float,
    val windspeed: Float,
    val winddirection: Float,
    val weathercode: Int,
    val time: String
)