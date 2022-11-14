package com.dovhal.android_labs.android.lab5.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dovhal.android_labs.android.lab5.entities.UserDto
import com.eragoo.cdu_labs.andoroid.lab3.R

class RecyclerAdapter(private val data: List<UserDto>) : RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val largeTextView: TextView = itemView.findViewById(R.id.textViewLarge)
        val smallTextView: TextView = itemView.findViewById(R.id.textViewSmall)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.recyclerview_item, parent, false)

        return MyViewHolder(itemView)
    }

    override fun getItemCount() = data.size
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.largeTextView.text = data[position].name + " " + data[position].surname
        holder.smallTextView.text = data[position].email
    }
}
