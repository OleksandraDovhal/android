package com.dovhal.android_labs.android.lab3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dovhal.android_labs.android.lab3.database.City
import com.dovhal.android_labs.android.lab3.di.SingletonHolder
import com.eragoo.cdu_labs.andoroid.lab3.R
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private val defaultData = listOf(
        City(cityName = "Cherkasy", cityArea = "78 square km", founded = 1284),
        City(cityName = "Bila Tserkva", cityArea = "67.8  square km", founded = 1032),
        City(cityName = "Zhytomyr", cityArea = "65 square km", founded = 884),
        City(cityName = "Kherson", cityArea = "135.7 square km", founded = 1778)
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
        recyclerView?.adapter = CityListAdapter(list)
    }

    private fun fillWithDefaultValues() {
        GlobalScope.launch(Dispatchers.IO) {
            defaultData.forEach {
                SingletonHolder.cityRepository.insertCity(it)
            }
        }
    }
}