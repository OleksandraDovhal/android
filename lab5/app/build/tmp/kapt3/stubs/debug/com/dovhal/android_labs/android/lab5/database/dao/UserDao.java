package com.dovhal.android_labs.android.lab5.database.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\'J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\bH\'J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\'J!\u0010\u000e\u001a\u00020\u00032\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0010\"\u00020\u0005H\'\u00a2\u0006\u0002\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/dovhal/android_labs/android/lab5/database/dao/UserDao;", "", "delete", "", "user", "Lcom/dovhal/android_labs/android/lab5/database/enities/User;", "findByName", "first", "", "last", "findUserById", "userId", "getAll", "", "insertAll", "users", "", "([Lcom/dovhal/android_labs/android/lab5/database/enities/User;)V", "app_debug"})
public abstract interface UserDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM user")
    public abstract java.util.List<com.dovhal.android_labs.android.lab5.database.enities.User> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM user WHERE first_name LIKE :first AND last_name LIKE :last LIMIT 1")
    public abstract com.dovhal.android_labs.android.lab5.database.enities.User findByName(@org.jetbrains.annotations.NotNull()
    java.lang.String first, @org.jetbrains.annotations.NotNull()
    java.lang.String last);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM user WHERE userId==:userId")
    public abstract com.dovhal.android_labs.android.lab5.database.enities.User findUserById(@org.jetbrains.annotations.NotNull()
    java.lang.String userId);
    
    @androidx.room.Insert()
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    com.dovhal.android_labs.android.lab5.database.enities.User... users);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.dovhal.android_labs.android.lab5.database.enities.User user);
}