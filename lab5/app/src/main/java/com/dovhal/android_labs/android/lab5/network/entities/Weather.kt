package com.dovhal.android_labs.android.lab5.network.entities

import kotlinx.serialization.Serializable

@Serializable
data class Weather(
    val id: Long,
    val main: String,
    val description: String,
    val icon: String
)