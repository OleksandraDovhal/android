package com.dovhal.android_labs.android.lab5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dovhal.android_labs.android.lab5.database.City
import com.dovhal.android_labs.android.lab5.R

class CityListAdapter(private val data: List<City>) : RecyclerView.Adapter<CityListAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val largeTextView: TextView = itemView.findViewById(R.id.textViewLarge)
        val smallTextView: TextView = itemView.findViewById(R.id.textViewSmall)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityListAdapter.MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.recyclerview_item, parent, false)

        return MyViewHolder(itemView)
    }

    override fun getItemCount() = data.size
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.largeTextView.text = "${data[position].cityName} ${data[position].cityArea}"
        holder.smallTextView.text = "Founded: ${data[position].founded}"
    }
}
