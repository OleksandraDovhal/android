package com.dovhal.android_labs.android.lab5.network.interceptors

import com.dovhal.android_labs.android.lab5.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response

class AuthInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(
            chain.request().newBuilder().url(
                chain.request().url.newBuilder()
                    .addQueryParameter("appid", BuildConfig.API_KEY)
                    .build()
            ).build()
        )
    }
}