package com.samples.interop.dagger.demo.tracking

import javax.inject.Inject
import javax.inject.Qualifier

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

class TrackingAdapter4 @Inject constructor(): TrackingAdapter {
    override fun adapt(trackId: String): String = trackId + "Adapt3"
}

class TrackingAdapter5 @Inject constructor(): TrackingAdapter {
    override fun adapt(trackId: String): String = trackId + "Adapt3"
}

class TrackingAdapter6 @Inject constructor(): TrackingAdapter {
    override fun adapt(trackId: String): String = trackId + "Adapt3"
}

class TrackingAdapter7 @Inject constructor(): TrackingAdapter {
    override fun adapt(trackId: String): String = trackId + "Adapt3"
}

class TrackingAdapter8 @Inject constructor(): TrackingAdapter {
    override fun adapt(trackId: String): String = trackId + "Adapt3"
}


class MainActivityTrackingAdapter @Inject constructor(): TrackingAdapter {
    override fun adapt(trackId: String): String = trackId + "MainActivityAdapt4"
}