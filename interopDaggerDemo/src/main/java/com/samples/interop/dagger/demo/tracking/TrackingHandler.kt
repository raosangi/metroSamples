package com.samples.interop.dagger.demo.tracking

import android.util.Log
import dagger.Provides
import javax.inject.Inject
import javax.inject.Provider
import kotlin.reflect.KClass


interface TrackingHandler {
    fun handleTracking(trackId: String)
}





class DefaultTrackingHandler @Inject constructor(
    val trackingAdapter: Set<@JvmSuppressWildcards TrackingAdapter>,
    val trackingTags: Map<Class<*>, @JvmSuppressWildcards  Any>, // Using provider here, throws an exception in Metro 1.5.0-snapshot version
) : TrackingHandler {
    override fun handleTracking(trackId: String) {
        val tracking = trackingAdapter.fold(trackId) { acc, current -> acc + current.adapt(trackId) }
        Log.d("TrackingHandler", tracking)

        Log.d("TrackingHandler", "Tags ${trackingTags[String::class.java].toString()}")
    }
}
