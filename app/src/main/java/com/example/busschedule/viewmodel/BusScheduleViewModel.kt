package com.example.busschedule.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.busschedule.database.Schedule
import com.example.busschedule.database.ScheduleDao

class BusScheduleViewModel(private val scheduleDao: ScheduleDao):ViewModel() {
    fun fullSchedule(): List<Schedule> = scheduleDao.getAll()
    fun scheduleForStopName(name: String): List<Schedule> = scheduleDao.getByStopName(name)
}

/**
 * you can't just instantiate a BusScheduleViewModel directly and expect everything to work.
 * As the ViewModel class BusScheduleViewModel needs from is meant to be lifecycle aware, it should
 * be instantiated by an object that can respond to lifecycle events. If you instantiate it directly
 * in one of your fragments, then your fragment object will have to handle everything all the
 * memory management, which is beyond the scope of what your app's code should do. Instead, you can
 * create a class, called a factory, that will instantiate view model objects for you.
 **/

class BusScheduleViewModelFactory(private val scheduleDao: ScheduleDao) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(BusScheduleViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return BusScheduleViewModel(scheduleDao) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}