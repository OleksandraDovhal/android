package com.dovhal.android_labs.android.lab5.database

import androidx.room.*
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
    @ColumnInfo(name = "location") val location: String
)
