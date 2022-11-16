package com.dovhal.android_labs.android.lab5.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u001a\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0018"}, d2 = {"Lcom/dovhal/android_labs/android/lab5/dialogs/WeatherDialog;", "Landroid/app/AlertDialog;", "Landroid/content/DialogInterface$OnClickListener;", "weatherResponse", "Lcom/dovhal/android_labs/android/lab5/network/responces/WeatherResponse;", "context", "Landroid/content/Context;", "(Lcom/dovhal/android_labs/android/lab5/network/responces/WeatherResponse;Landroid/content/Context;)V", "textTime", "Landroid/widget/TextView;", "getTextTime", "()Landroid/widget/TextView;", "textViewTemperature", "getTextViewTemperature", "textWindSpeed", "getTextWindSpeed", "getWeatherResponse", "()Lcom/dovhal/android_labs/android/lab5/network/responces/WeatherResponse;", "onClick", "", "dialog", "Landroid/content/DialogInterface;", "which", "", "app_debug"})
public final class WeatherDialog extends android.app.AlertDialog implements android.content.DialogInterface.OnClickListener {
    @org.jetbrains.annotations.NotNull()
    private final com.dovhal.android_labs.android.lab5.network.responces.WeatherResponse weatherResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final android.widget.TextView textViewTemperature = null;
    @org.jetbrains.annotations.NotNull()
    private final android.widget.TextView textWindSpeed = null;
    @org.jetbrains.annotations.NotNull()
    private final android.widget.TextView textTime = null;
    
    public WeatherDialog(@org.jetbrains.annotations.NotNull()
    com.dovhal.android_labs.android.lab5.network.responces.WeatherResponse weatherResponse, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dovhal.android_labs.android.lab5.network.responces.WeatherResponse getWeatherResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTextViewTemperature() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTextWindSpeed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTextTime() {
        return null;
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.content.DialogInterface dialog, int which) {
    }
}