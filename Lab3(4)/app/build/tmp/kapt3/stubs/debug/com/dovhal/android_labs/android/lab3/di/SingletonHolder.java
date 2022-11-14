package com.dovhal.android_labs.android.lab3.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\nR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00158BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001a"}, d2 = {"Lcom/dovhal/android_labs/android/lab3/di/SingletonHolder;", "", "()V", "appDatabase", "Lcom/dovhal/android_labs/android/lab3/database/ApplicationDatabase;", "getAppDatabase", "()Lcom/dovhal/android_labs/android/lab3/database/ApplicationDatabase;", "appDatabase$delegate", "Lkotlin/Lazy;", "application", "Landroid/app/Application;", "getApplication", "()Landroid/app/Application;", "setApplication", "(Landroid/app/Application;)V", "cityRepository", "Lcom/dovhal/android_labs/android/lab3/CityRepository;", "getCityRepository", "()Lcom/dovhal/android_labs/android/lab3/CityRepository;", "cityRepository$delegate", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "init", "", "app_debug"})
public final class SingletonHolder {
    @org.jetbrains.annotations.NotNull()
    public static final com.dovhal.android_labs.android.lab3.di.SingletonHolder INSTANCE = null;
    public static android.app.Application application;
    private static final kotlin.Lazy appDatabase$delegate = null;
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
    
    private final com.dovhal.android_labs.android.lab3.database.ApplicationDatabase getAppDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dovhal.android_labs.android.lab3.CityRepository getCityRepository() {
        return null;
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
    }
}