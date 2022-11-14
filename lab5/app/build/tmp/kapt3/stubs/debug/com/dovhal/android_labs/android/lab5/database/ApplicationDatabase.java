package com.dovhal.android_labs.android.lab5.database;

import java.lang.System;

@androidx.room.Database(entities = {com.dovhal.android_labs.android.lab5.database.enities.User.class}, version = 2)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/dovhal/android_labs/android/lab5/database/ApplicationDatabase;", "Landroidx/room/RoomDatabase;", "()V", "userDao", "Lcom/dovhal/android_labs/android/lab5/database/dao/UserDao;", "Companion", "app_debug"})
public abstract class ApplicationDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.dovhal.android_labs.android.lab5.database.ApplicationDatabase.Companion Companion = null;
    @kotlin.jvm.Volatile()
    private static volatile com.dovhal.android_labs.android.lab5.database.ApplicationDatabase INSTANCE;
    
    public ApplicationDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.dovhal.android_labs.android.lab5.database.dao.UserDao userDao();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/dovhal/android_labs/android/lab5/database/ApplicationDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/dovhal/android_labs/android/lab5/database/ApplicationDatabase;", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.dovhal.android_labs.android.lab5.database.ApplicationDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}