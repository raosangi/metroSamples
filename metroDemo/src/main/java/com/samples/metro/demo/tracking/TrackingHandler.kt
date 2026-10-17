package com.samples.metro.demo.tracking

import android.util.Log
import kotlin.collections.fold
import kotlin.reflect.KClass


interface TrackingHandler {
    fun handleTracking(trackId: String)
}



class DefaultTrackingHandler(
    val oldTrackingAdapter: () -> Set<TrackingAdapter>,
    val newTrackingAdapter: () -> Set<TrackingAdapter>,
    val trackingTags: Map<KClass<*>, () -> TrackingIdentifier>,
) : TrackingHandler {
    override fun handleTracking(trackId: String) {
        val trackingOld = oldTrackingAdapter().fold(trackId) { acc, current -> acc + current.adapt(trackId) }
        Log.d("TrackingHandler", "Tracking Old: $trackingOld")

        val trackingNew = newTrackingAdapter().fold(trackId) { acc, current -> acc + current.adapt(trackId) }
        Log.d("TrackingHandler", "Tracking Old: $trackingOld")

        Log.d("TrackingHandler", "Tags ${trackingTags.size}")
    }
}