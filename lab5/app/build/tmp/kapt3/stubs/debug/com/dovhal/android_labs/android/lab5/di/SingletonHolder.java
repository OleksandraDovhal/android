package com.dovhal.android_labs.android.lab5.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010)\u001a\u00020*2\u0006\u0010\u000e\u001a\u00020\u000fR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\b\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\b\u001a\u0004\b\u001f\u0010 R)\u0010\"\u001a\n $*\u0004\u0018\u00010#0#8BX\u0082\u0084\u0002\u00a2\u0006\u0012\n\u0004\b(\u0010\b\u0012\u0004\b%\u0010\u0002\u001a\u0004\b&\u0010\'\u00a8\u0006+"}, d2 = {"Lcom/dovhal/android_labs/android/lab5/di/SingletonHolder;", "", "()V", "apiClient", "Lcom/dovhal/android_labs/android/lab5/network/ApiClient;", "getApiClient", "()Lcom/dovhal/android_labs/android/lab5/network/ApiClient;", "apiClient$delegate", "Lkotlin/Lazy;", "appDatabase", "Lcom/dovhal/android_labs/android/lab5/database/ApplicationDatabase;", "getAppDatabase", "()Lcom/dovhal/android_labs/android/lab5/database/ApplicationDatabase;", "appDatabase$delegate", "application", "Landroid/app/Application;", "getApplication", "()Landroid/app/Application;", "setApplication", "(Landroid/app/Application;)V", "cityRepository", "Lcom/dovhal/android_labs/android/lab5/CityRepository;", "getCityRepository", "()Lcom/dovhal/android_labs/android/lab5/CityRepository;", "cityRepository$delegate", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "okHttpClient", "Lokhttp3/OkHttpClient;", "getOkHttpClient", "()Lokhttp3/OkHttpClient;", "okHttpClient$delegate", "retrofit", "Lretrofit2/Retrofit;", "kotlin.jvm.PlatformType", "getRetrofit$annotations", "getRetrofit", "()Lretrofit2/Retrofit;", "retrofit$delegate", "init", "", "app_debug"})
public final class SingletonHolder {
    @org.jetbrains.annotations.NotNull()
    public static final com.dovhal.android_labs.android.lab5.di.SingletonHolder INSTANCE = null;
    public static android.app.Application application;
    private static final kotlin.Lazy appDatabase$delegate = null;
    private static final kotlin.Lazy okHttpClient$delegate = null;
    private static final kotlin.Lazy retrofit$delegate = null;
    private static final kotlin.Lazy apiClient$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy cityRepository$delegate = null;
    
    private SingletonHolder() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Application getApplication() {
        return null;
    }
    
    public final void setApplication(@org.jetbrains.annotations.NotNull()
    android.app.Application p0) {
    }
    
    private final android.content.Context getContext() {
        return null;
    }
    
    private final com.dovhal.android_labs.android.lab5.database.ApplicationDatabase getAppDatabase() {
        return null;
    }
    
    private final okhttp3.OkHttpClient getOkHttpClient() {
        return null;
    }
    
    private final retrofit2.Retrofit getRetrofit() {
        return null;
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.serialization.ExperimentalSerializationApi.class})
    @java.lang.Deprecated()
    private static void getRetrofit$annotations() {
    }
    
    private final com.dovhal.android_labs.android.lab5.network.ApiClient getApiClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dovhal.android_labs.android.lab5.CityRepository getCityRepository() {
        return null;
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
    }
}