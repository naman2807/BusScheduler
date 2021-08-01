package com.example.busschedule.adapter

import android.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.busschedule.database.Schedule

class BusStopAdapter:ListAdapter<Schedule, BusStopAdapter.BusStopViewHolder>(DiffCallBack) {
}