package com.dovhal.android_labs.android.lab5.database.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0003H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\n\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'\u00a8\u0006\f"}, d2 = {"Lcom/dovhal/android_labs/android/lab5/database/dao/CityDao;", "", "delete", "", "city", "Lcom/dovhal/android_labs/android/lab5/database/entities/City;", "deleteAll", "getAll", "", "insert", "insertAll", "cities", "app_debug"})
public abstract interface CityDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM city")
    public abstract java.util.List<com.dovhal.android_labs.android.lab5.database.entities.City> getAll();
    
    @androidx.room.Insert()
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.dovhal.android_labs.android.lab5.database.entities.City> cities);
    
    @androidx.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.dovhal.android_labs.android.lab5.database.entities.City city);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.dovhal.android_labs.android.lab5.database.entities.City city);
    
    @androidx.room.Query(value = "DELETE FROM city")
    public abstract void deleteAll();
}