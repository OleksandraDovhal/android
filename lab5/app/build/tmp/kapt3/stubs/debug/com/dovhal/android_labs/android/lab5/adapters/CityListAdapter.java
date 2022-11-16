package com.dovhal.android_labs.android.lab5.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0019\u001aB\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u001c\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lcom/dovhal/android_labs/android/lab5/adapters/CityListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/dovhal/android_labs/android/lab5/adapters/CityListAdapter$CityViewHolder;", "data", "", "Lcom/dovhal/android_labs/android/lab5/database/City;", "callback", "Lcom/dovhal/android_labs/android/lab5/adapters/CityListAdapter$Callback;", "(Ljava/util/List;Lcom/dovhal/android_labs/android/lab5/adapters/CityListAdapter$Callback;)V", "value", "cityList", "getCityList", "()Ljava/util/List;", "setCityList", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Callback", "CityViewHolder", "app_debug"})
public final class CityListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.dovhal.android_labs.android.lab5.adapters.CityListAdapter.CityViewHolder> {
    private final com.dovhal.android_labs.android.lab5.adapters.CityListAdapter.Callback callback = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.dovhal.android_labs.android.lab5.database.City> cityList;
    
    public CityListAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.dovhal.android_labs.android.lab5.database.City> data, @org.jetbrains.annotations.NotNull()
    com.dovhal.android_labs.android.lab5.adapters.CityListAdapter.Callback callback) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.dovhal.android_labs.android.lab5.database.City> getCityList() {
        return null;
    }
    
    public final void setCityList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.dovhal.android_labs.android.lab5.database.City> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.dovhal.android_labs.android.lab5.adapters.CityListAdapter.CityViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.dovhal.android_labs.android.lab5.adapters.CityListAdapter.CityViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/dovhal/android_labs/android/lab5/adapters/CityListAdapter$Callback;", "", "onClick", "", "city", "Lcom/dovhal/android_labs/android/lab5/database/City;", "app_debug"})
    public static abstract interface Callback {
        
        public abstract void onClick(@org.jetbrains.annotations.NotNull()
        com.dovhal.android_labs.android.lab5.database.City city);
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0012\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\u00a8\u0006\u0012"}, d2 = {"Lcom/dovhal/android_labs/android/lab5/adapters/CityListAdapter$CityViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "itemView", "Landroid/view/View;", "(Lcom/dovhal/android_labs/android/lab5/adapters/CityListAdapter;Landroid/view/View;)V", "largeTextView", "Landroid/widget/TextView;", "getLargeTextView", "()Landroid/widget/TextView;", "smallTextView", "getSmallTextView", "onBind", "", "item", "Lcom/dovhal/android_labs/android/lab5/database/City;", "onClick", "v", "app_debug"})
    public final class CityViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView largeTextView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView smallTextView = null;
        
        public CityViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getLargeTextView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getSmallTextView() {
            return null;
        }
        
        public final void onBind(@org.jetbrains.annotations.NotNull()
        com.dovhal.android_labs.android.lab5.database.City item) {
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.Nullable()
        android.view.View v) {
        }
    }
}