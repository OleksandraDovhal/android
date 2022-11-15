package com.dovhal.android_labs.android.lab5.di

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.dovhal.android_labs.android.lab5.BuildConfig
import com.dovhal.android_labs.android.lab5.CityRepository
import com.dovhal.android_labs.android.lab5.database.ApplicationDatabase
import com.dovhal.android_labs.android.lab5.network.ApiClient
import com.dovhal.android_labs.android.lab5.network.interceptors.AuthInterceptor
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.readystatesoftware.chuck.ChuckInterceptor
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Protocol
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit

// Singleton Holder is a simple solution that allows user to create Singleton objects in Kotlin. Not an actual Dependency Injection.
object SingletonHolder {

    lateinit var application: Application
    private val context: Context get() = application

    private val appDatabase by lazy {
        Room.databaseBuilder(
            application,
            ApplicationDatabase::class.java,
            "database"
        )
            .fallbackToDestructiveMigration()
            .build()
    }
    
    private val okHttpClient by lazy {
        OkHttpClient.Builder()
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .protocols(listOf(Protocol.HTTP_1_1))
            .addInterceptor(AuthInterceptor())
            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
            .addInterceptor(ChuckInterceptor(application))
            .build()
    }

    @OptIn(ExperimentalSerializationApi::class)
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(Json.asConverterFactory("application/x-www-form-urlencoded".toMediaType()))
            .build()
    }

    private val apiClient by lazy {
        ApiClient(retrofit = retrofit)
    }

    val cityRepository: CityRepository by lazy {
        CityRepository(
            appDatabase.cityDao(),
            apiClient,
            context
        )
    }

    fun init(application: Application) {
        this.application = application
    }
}