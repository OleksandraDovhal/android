package com.dovhal.android_labs.android.lab5.dialogs

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.view.View
import android.widget.TextView
import com.dovhal.android_labs.android.lab5.R
import com.dovhal.android_labs.android.lab5.network.responces.WeatherResponse
import java.util.*

class WeatherDialog(val weatherResponse: WeatherResponse, context: Context) : AlertDialog(context),
    DialogInterface.OnClickListener {

    val textViewTemperature: TextView
    val textWindSpeed: TextView
    val textTime: TextView

    init {
        val view = View.inflate(
            context,
            R.layout.weather_dialog_fragment, null
        )
        setView(view)

        textViewTemperature = view.findViewById(R.id.textViewTemperature)
        textWindSpeed = view.findViewById(R.id.textWindSpeed)
        textTime = view.findViewById(R.id.textTime)

        textViewTemperature.text = "Temperature: ${weatherResponse.currentWeather.temperature}"
        textWindSpeed.text = "Wind Speed: ${weatherResponse.currentWeather.windspeed}"
        textTime.text = "Weather requested at: ${weatherResponse.currentWeather.time}"

        this.setButton(DialogInterface.BUTTON_POSITIVE, "Ok", this)
    }

    override fun onClick(dialog: DialogInterface?, which: Int) {
        when (which) {
            DialogInterface.BUTTON_POSITIVE -> {
                dismiss()
            }
            DialogInterface.BUTTON_NEGATIVE -> cancel()
        }
    }

}