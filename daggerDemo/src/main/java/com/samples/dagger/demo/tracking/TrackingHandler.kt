package com.samples.dagger.demo.tracking

import android.util.Log
import com.samples.dagger.demo.network.DataSource
import dagger.Provides
import javax.inject.Inject
import javax.inject.Provider
import kotlin.reflect.KClass


interface TrackingHandler {
    fun handleTracking(trackId: String)
}





class DefaultTrackingHandler(
    val oldTrackingAdapter: Provider<Set<TrackingAdapter>>,
    val newTrackingAdapter: Provider<Set<TrackingAdapter>>,
    val trackingTags: Map<Class<*>, Provider<TrackingIdentifier>>,
) : TrackingHandler {
    override fun handleTracking(trackId: String) {
        val trackingOld = oldTrackingAdapter.get().fold(trackId) { acc, current -> acc + current.adapt(trackId) }
        Log.d("TrackingHandler", "Tracking Old: $trackingOld")

        val trackingNew = newTrackingAdapter.get().fold(trackId) { acc, current -> acc + current.adapt(trackId) }
        Log.d("TrackingHandler", "Tracking Old: $trackingOld")

        Log.d("TrackingHandler", "Tags ${trackingTags.size}")
    }
}
