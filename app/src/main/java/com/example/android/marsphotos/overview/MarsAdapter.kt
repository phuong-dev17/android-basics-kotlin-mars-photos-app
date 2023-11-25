package com.example.android.marsphotos.overview

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android.marsphotos.network.MarsPhoto

class MarsAdapter(private val data: List<MarsPhoto>) : RecyclerView.Adapter<MarsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MarsViewHolder {
        return MarsViewHolder.create(parent)
    }

    override fun getItemCount(): Int {
       return data.size
    }

    override fun onBindViewHolder(holder: MarsViewHolder, position: Int) {
        holder.bind(data[position])
    }

}