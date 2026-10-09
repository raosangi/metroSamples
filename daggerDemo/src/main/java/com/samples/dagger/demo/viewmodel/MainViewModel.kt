package com.samples.dagger.demo.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.samples.dagger.demo.network.DataSource
import com.samples.dagger.demo.tracking.TrackingHandler
import javax.inject.Inject

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