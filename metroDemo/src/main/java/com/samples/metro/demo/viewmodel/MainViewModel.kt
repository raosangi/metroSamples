package com.samples.metro.demo.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.samples.metro.demo.network.DataSource
import com.samples.metro.demo.tracking.TrackingHandler
import dev.zacsweers.metro.Inject

class MainViewModel @Inject constructor(
    val trackingHandler: TrackingHandler,
    val dataSource: DataSource,
    val savedStateHandle: SavedStateHandle
): ViewModel() {

    val message: String = "hello"

    fun track() {
        dataSource.getData("Main")
        trackingHandler.handleTracking("hello tracking")
    }

}