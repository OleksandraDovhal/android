package com.dovhal.android_labs.android.lab5.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J5\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/dovhal/android_labs/android/lab5/network/WeatherApiService;", "", "getCurrentWeather", "Lretrofit2/Call;", "Lcom/dovhal/android_labs/android/lab5/network/responces/WeatherResponse;", "latitude", "", "longitude", "currentWeather", "", "(FFZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface WeatherApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "forecast?")
    public abstract java.lang.Object getCurrentWeather(@retrofit2.http.Query(value = "latitude")
    float latitude, @retrofit2.http.Query(value = "longitude")
    float longitude, @retrofit2.http.Query(value = "current_weather")
    boolean currentWeather, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Call<com.dovhal.android_labs.android.lab5.network.responces.WeatherResponse>> continuation);
}