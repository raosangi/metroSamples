package com.samples.metro.demo.tracking

import dev.zacsweers.metro.Inject
import dev.zacsweers.metro.Qualifier
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@Qualifier
annotation class OldTrackingQualifier

@Qualifier
annotation class NewTrackingQualifier

interface TrackingAdapter {
    fun adapt(trackId: String) : String
}

class TrackingAdapter2 @Inject constructor(): TrackingAdapter {
    override fun adapt(trackId: String): String = trackId + "Adapt2"
}

class TrackingAdapter3 @Inject constructor(): TrackingAdapter {
    override fun adapt(trackId: String): String = trackId + "Adapt3"
}


class TrackingAdapter4 @Inject constructor():
    TrackingAdapter {
    override fun adapt(trackId: String): String = trackId + "Adapt4"
}

class TrackingAdapter5 @Inject constructor():
    TrackingAdapter {
    override fun adapt(trackId: String): String = trackId + "Adapt5"
}

class TrackingAdapter6 @Inject constructor():
    TrackingAdapter {
    override fun adapt(trackId: String): String = trackId + "Adapt6"
}

class TrackingAdapter7 @Inject constructor():
    TrackingAdapter {
    override fun adapt(trackId: String): String = trackId + "Adapt7"
}

class TrackingAdapter8 @Inject constructor():
    TrackingAdapter {
    override fun adapt(trackId: String): String = trackId + "Adapt8"
}

class TrackingAdapter9 @Inject constructor(
    val optionalExporter: TrackingExporter? = null
) : TrackingAdapter {
    override fun adapt(trackId: String): String = trackId + "Adapt9" + optionalExporter?.export(trackId)
}

class MainActivityTrackingAdapter @Inject constructor(): TrackingAdapter {
    override fun adapt(trackId: String): String = trackId + "MainActivityAdapt4"
}