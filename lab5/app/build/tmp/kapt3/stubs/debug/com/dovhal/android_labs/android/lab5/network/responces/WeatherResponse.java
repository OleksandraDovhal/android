package com.dovhal.android_labs.android.lab5.network.responces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\bH\u00c6\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r\u00a8\u0006\u001e"}, d2 = {"Lcom/dovhal/android_labs/android/lab5/network/responces/WeatherResponse;", "", "latitude", "", "longitude", "generationTime", "elevation", "currentWeather", "Lcom/dovhal/android_labs/android/lab5/network/entities/Weather;", "(FFFFLcom/dovhal/android_labs/android/lab5/network/entities/Weather;)V", "getCurrentWeather", "()Lcom/dovhal/android_labs/android/lab5/network/entities/Weather;", "getElevation", "()F", "getGenerationTime", "getLatitude", "getLongitude", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class WeatherResponse {
    private final float latitude = 0.0F;
    private final float longitude = 0.0F;
    private final float generationTime = 0.0F;
    private final float elevation = 0.0F;
    @org.jetbrains.annotations.NotNull()
    private final com.dovhal.android_labs.android.lab5.network.entities.Weather currentWeather = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.dovhal.android_labs.android.lab5.network.responces.WeatherResponse copy(float latitude, float longitude, @com.squareup.moshi.Json(name = "generationtime_ms")
    float generationTime, @com.squareup.moshi.Json(name = "elevation")
    float elevation, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "current_weather")
    com.dovhal.android_labs.android.lab5.network.entities.Weather currentWeather) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public WeatherResponse(float latitude, float longitude, @com.squareup.moshi.Json(name = "generationtime_ms")
    float generationTime, @com.squareup.moshi.Json(name = "elevation")
    float elevation, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "current_weather")
    com.dovhal.android_labs.android.lab5.network.entities.Weather currentWeather) {
        super();
    }
    
    public final float component1() {
        return 0.0F;
    }
    
    public final float getLatitude() {
        return 0.0F;
    }
    
    public final float component2() {
        return 0.0F;
    }
    
    public final float getLongitude() {
        return 0.0F;
    }
    
    public final float component3() {
        return 0.0F;
    }
    
    public final float getGenerationTime() {
        return 0.0F;
    }
    
    public final float component4() {
        return 0.0F;
    }
    
    public final float getElevation() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dovhal.android_labs.android.lab5.network.entities.Weather component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dovhal.android_labs.android.lab5.network.entities.Weather getCurrentWeather() {
        return null;
    }
}