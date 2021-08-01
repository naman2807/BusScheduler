package com.example.busschedule.adapter

import android.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.busschedule.database.Schedule

class BusStopAdapter(private val onItemClicked: (Schedule) -> Unit): ListAdapter<Schedule, BusStopAdapter.BusStopViewHolder>(DiffCallBack) {

    class BusStopViewHolder {

    }
}