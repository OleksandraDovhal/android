package com.dovhal.android_labs.android.lab3

import android.app.Application
import com.dovhal.android_labs.android.lab3.di.SingletonHolder
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        SingletonHolder.init(this)
        GlobalScope.launch {
            SingletonHolder.cityRepository.deleteAll()
        }
    }
}