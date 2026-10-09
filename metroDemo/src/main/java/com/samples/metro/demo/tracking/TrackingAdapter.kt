package com.samples.metro.demo.tracking

import dev.zacsweers.metro.Inject


interface TrackingAdapter {
    fun adapt(trackId: String) : String
}

class TrackingAdapter2 @Inject constructor(): TrackingAdapter {
    override fun adapt(trackId: String): String = trackId + "Adapt2"
}

class TrackingAdapter3 @Inject constructor(): TrackingAdapter {
    override fun adapt(trackId: String): String = trackId + "Adapt3"
}

class MainActivityTrackingAdapter @Inject constructor(): TrackingAdapter {
    override fun adapt(trackId: String): String = trackId + "MainActivityAdapt4"
}