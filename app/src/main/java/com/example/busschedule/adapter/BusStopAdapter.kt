package com.example.busschedule.adapter

import android.annotation.SuppressLint
import android.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.busschedule.database.Schedule
import com.example.busschedule.databinding.BusStopItemBinding
import java.text.SimpleDateFormat
import java.util.*

class BusStopAdapter(private val onItemClicked: (Schedule) -> Unit): ListAdapter<Schedule, BusStopAdapter.BusStopViewHolder>(DiffCallBack) {

    class BusStopViewHolder(private val binding: BusStopItemBinding):RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("SimpleDateFormat")
        fun bind(schedule: Schedule) {
            binding.stopNameTextView.text = schedule.stopName
            binding.arrivalTimeTextView.text = SimpleDateFormat(
                "h:mm a").format(
                Date(schedule.arrivalTime.toLong() * 1000)
            )
        }
    }
}