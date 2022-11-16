package com.dovhal.android_labs.android.lab5;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ!\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u000e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/dovhal/android_labs/android/lab5/CityRepository;", "", "cityDao", "Lcom/dovhal/android_labs/android/lab5/database/CityDao;", "apiClient", "Lcom/dovhal/android_labs/android/lab5/network/ApiClient;", "context", "Landroid/content/Context;", "(Lcom/dovhal/android_labs/android/lab5/database/CityDao;Lcom/dovhal/android_labs/android/lab5/network/ApiClient;Landroid/content/Context;)V", "getApiClient", "()Lcom/dovhal/android_labs/android/lab5/network/ApiClient;", "getContext", "()Landroid/content/Context;", "deleteAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCitiesList", "", "Lcom/dovhal/android_labs/android/lab5/database/City;", "getCurrentWeather", "Lcom/dovhal/android_labs/android/lab5/network/responces/WeatherResponse;", "latitude", "", "longitude", "(FFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertCitiesListToDb", "list", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertCity", "city", "(Lcom/dovhal/android_labs/android/lab5/database/City;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CityRepository {
    private final com.dovhal.android_labs.android.lab5.database.CityDao cityDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.dovhal.android_labs.android.lab5.network.ApiClient apiClient = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    public CityRepository(@org.jetbrains.annotations.NotNull()
    com.dovhal.android_labs.android.lab5.database.CityDao cityDao, @org.jetbrains.annotations.NotNull()
    com.dovhal.android_labs.android.lab5.network.ApiClient apiClient, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dovhal.android_labs.android.lab5.network.ApiClient getApiClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCurrentWeather(float latitude, float longitude, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.dovhal.android_labs.android.lab5.network.responces.WeatherResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCitiesList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.dovhal.android_labs.android.lab5.database.City>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertCitiesListToDb(@org.jetbrains.annotations.NotNull()
    java.util.List<com.dovhal.android_labs.android.lab5.database.City> list, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertCity(@org.jetbrains.annotations.NotNull()
    com.dovhal.android_labs.android.lab5.database.City city, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}