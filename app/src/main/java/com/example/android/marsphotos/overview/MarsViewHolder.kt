package com.example.android.marsphotos.overview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.android.marsphotos.databinding.GridViewItemBinding
import com.example.android.marsphotos.network.MarsPhoto

class MarsViewHolder (
    private val binding: GridViewItemBinding
    ): RecyclerView.ViewHolder(binding.root){

        fun bind(marsPhoto: MarsPhoto) {
            val imgUri = marsPhoto.imgSrcUrl.toUri().buildUpon().scheme("https").build()
            binding.marsImage.load(imgUri)
        }

        companion object {
            fun create(parent: ViewGroup):MarsViewHolder {
                val binding = GridViewItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
                return MarsViewHolder(binding = binding)
            }
        }
    }