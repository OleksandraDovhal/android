package com.dovhal.android_labs.android.lab3.database;

import java.lang.System;

@androidx.room.Database(entities = {com.dovhal.android_labs.android.lab3.database.City.class}, version = 3, exportSchema = true)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/dovhal/android_labs/android/lab3/database/ApplicationDatabase;", "Landroidx/room/RoomDatabase;", "()V", "cityDao", "Lcom/dovhal/android_labs/android/lab3/database/CityDao;", "app_debug"})
public abstract class ApplicationDatabase extends androidx.room.RoomDatabase {
    
    public ApplicationDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.dovhal.android_labs.android.lab3.database.CityDao cityDao();
}