package com.dovhal.android_labs.android.lab5.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dovhal.android_labs.android.lab5.R
import com.dovhal.android_labs.android.lab5.database.City

class CityListAdapter(
    data: List<City>,
    private val callback: Callback
) :
    RecyclerView.Adapter<CityListAdapter.CityViewHolder>() {

    interface Callback {
        fun onClick(city: City)
    }

    var cityList: List<City> = data
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CityListAdapter.CityViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.recyclerview_item, parent, false)

        return CityViewHolder(itemView)
    }

    override fun getItemCount() = cityList.size
    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {
        holder.onBind(cityList[position])
    }


    inner class CityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {

        init {
            itemView.setOnClickListener(this)
        }

        val largeTextView: TextView = itemView.findViewById(R.id.textViewLarge)
        val smallTextView: TextView = itemView.findViewById(R.id.textViewSmall)

        fun onBind(item: City) {
            largeTextView.text = "${item.cityName} ${item.cityArea}"
            smallTextView.text = "Founded: ${item.founded}"
        }

        override fun onClick(v: View?) {
            callback.onClick(cityList[adapterPosition])
        }
    }

}
