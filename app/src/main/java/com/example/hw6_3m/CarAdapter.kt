package com.example.hw6_3m

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.hw6_3m.databinding.ItemCarBinding

class CarAdapter(private val dataList: List<Car>) : RecyclerView.Adapter<CarAdapter.ViewHolder>() {
    class ViewHolder(private var binding: ItemCarBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(car: Car) {
            binding.tvCar.text = car.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarAdapter.ViewHolder {
        return ViewHolder(
            ItemCarBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CarAdapter.ViewHolder, position: Int) {
        holder.bind(dataList[position])

    }

    override fun getItemCount(): Int {
       return dataList.size
    }
}