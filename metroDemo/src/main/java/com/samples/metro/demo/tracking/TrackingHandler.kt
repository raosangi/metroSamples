package com.samples.metro.demo.tracking

import android.util.Log
import dev.zacsweers.metro.Inject
import kotlin.reflect.KClass


interface TrackingHandler {
    fun handleTracking(trackId: String)
}



class DefaultTrackingHandler @Inject constructor(
    val trackingAdapter: Set<@JvmSuppressWildcards TrackingAdapter>,
    val trackingTags: Map<KClass<*>, @JvmSuppressWildcards  Any>
) : TrackingHandler {
    override fun handleTracking(trackId: String) {
        val tracking = trackingAdapter.fold(trackId) { acc, current -> acc + current.adapt(trackId) }
        Log.d("TrackingHandler", tracking)
        Log.d("TrackingHandler", "Tags ${trackingTags[String::class].toString()}")
    }
}

