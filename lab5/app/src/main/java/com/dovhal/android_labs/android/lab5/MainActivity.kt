package com.dovhal.android_labs.android.lab5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dovhal.android_labs.android.lab5.adapters.CityListAdapter
import com.dovhal.android_labs.android.lab5.database.entities.City
import com.dovhal.android_labs.android.lab5.di.SingletonHolder
import com.dovhal.android_labs.android.lab5.dialogs.WeatherDialog
import com.dovhal.android_labs.android.lab5.network.responces.WeatherResponse
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity(), CityListAdapter.Callback {

    val result: MutableLiveData<WeatherResponse> = MutableLiveData()

    private val defaultData = listOf(
        City(
            cityName = "Cherkasy",
            cityArea = "78 square km",
            founded = 1284,
            latitude = 49.4444F,
            longitude = 32.0598F
        ),
        City(
            cityName = "Bila Tserkva",
            cityArea = "67.8  square km",
            founded = 1032,
            latitude = 49.7968F,
            longitude = 30.1311F
        ),
        City(
            cityName = "Zhytomyr",
            cityArea = "65 square km",
            founded = 884,
            latitude = 50.2547F,
            longitude = 28.6587F
        ),
        City(
            cityName = "Kherson",
            cityArea = "135.7 square km",
            founded = 1778,
            latitude = 46.6354F,
            longitude = 32.6169F
        )
    )

    var recyclerView: RecyclerView? = null

    @OptIn(DelicateCoroutinesApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycleView)
        fillWithDefaultValues()

        recyclerView?.layoutManager = LinearLayoutManager(this)

        GlobalScope.launch(Dispatchers.IO) {
            SingletonHolder.cityRepository.getCitiesList()?.let { setupRecyclerView(it) }
        }

        result.observe(this) {
            WeatherDialog(
                it,
                this
            ).show()
        }

    }

    private fun setupRecyclerView(list: List<City>) {
        recyclerView?.adapter = CityListAdapter(list, this)
    }

    private fun fillWithDefaultValues() {
        GlobalScope.launch(Dispatchers.IO) {
            defaultData.forEach {
                SingletonHolder.cityRepository.insertCity(it)
            }
        }
    }


    override fun onClick(city: City) {
        GlobalScope.launch(Dispatchers.Main) {
            result.value =
                SingletonHolder.cityRepository.getCurrentWeather(city.latitude, city.longitude)
        }
    }
}