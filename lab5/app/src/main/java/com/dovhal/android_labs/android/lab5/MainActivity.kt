package com.dovhal.android_labs.android.lab5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dovhal.android_labs.android.lab5.adapters.CityListAdapter
import com.dovhal.android_labs.android.lab5.database.City
import com.dovhal.android_labs.android.lab5.di.SingletonHolder
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity(), CityListAdapter.Callback {

    private val defaultData = listOf(
        City(
            cityName = "Cherkasy",
            cityArea = "78 square km",
            founded = 1284,
            location = "Cherkasy,ua"
        ),
        City(
            cityName = "Bila Tserkva",
            cityArea = "67.8  square km",
            founded = 1032,
            location = "Bila Tserkva,ua"
        ),
        City(
            cityName = "Zhytomyr",
            cityArea = "65 square km",
            founded = 884,
            location = "Zhytomyr,ua"
        ),
        City(
            cityName = "Kherson",
            cityArea = "135.7 square km",
            founded = 1778,
            location = "Kherson,ua"
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

    }
}