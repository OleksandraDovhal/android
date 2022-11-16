package com.dovhal.android_labs.android.lab5.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import java.util.*

@Entity(
    tableName = "city",
    indices = [Index("city_id")]
)
data class City(
    @PrimaryKey
    @ColumnInfo(name = "city_id") val cityId: String = UUID.randomUUID().toString(),
    @ColumnInfo(name = "city_name") val cityName: String,
    @ColumnInfo(name = "city_area") val cityArea: String,
    @ColumnInfo(name = "founded") val founded: Int,
    @ColumnInfo(name = "latitude") val latitude: Float,
    @ColumnInfo(name = "longitude") val longitude: Float
)
