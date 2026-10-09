package com.samples.metro.demo.tracking

import android.util.Log
import dev.zacsweers.metro.Inject


interface TrackingHandler {
    fun handleTracking(trackId: String)
}



class DefaultTrackingHandler @Inject constructor(
    val trackingAdapter: Set<@JvmSuppressWildcards TrackingAdapter>
) : TrackingHandler {
    override fun handleTracking(trackId: String) {
        val tracking = trackingAdapter.fold(trackId) { acc, current -> acc + current.adapt(trackId) }
        Log.d("TrackingHandler", tracking)
    }
}

