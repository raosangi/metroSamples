package com.samples.interop.dagger.demo.tracking

import android.util.Log
import com.samples.interop.dagger.demo.network.DataSource
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
    val trackingTags: Map<KClass<*>, () -> TrackingIdentifier>,
) : TrackingHandler {
    override fun handleTracking(trackId: String) {
        val trackingOld = oldTrackingAdapter.get().fold(trackId) { acc, current -> acc + current.adapt(trackId) }
        Log.d("TrackingHandler", "Tracking Old: $trackingOld")

        val trackingNew = newTrackingAdapter.get().fold(trackId) { acc, current -> acc + current.adapt(trackId) }
        Log.d("TrackingHandler", "Tracking Old: $trackingOld")

        Log.d("TrackingHandler", "Tags ${trackingTags.size}")
    }
}
