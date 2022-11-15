package com.dovhal.android_labs.android.lab5.database

import androidx.room.*

@Dao
interface CityDao {
    @Query("SELECT * FROM city")
    fun getAll(): List<City>

    @Insert
    fun insertAll(cities: List<City>)

    @Insert
    fun insert(city: City)

    @Delete
    fun delete(city: City)

    @Query("DELETE FROM city")
    fun deleteAll()
}
