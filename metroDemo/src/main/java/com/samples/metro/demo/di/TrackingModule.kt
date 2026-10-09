package com.samples.metro.demo.di

import com.samples.metro.demo.tracking.DefaultTrackingHandler
import com.samples.metro.demo.tracking.TrackingAdapter
import com.samples.metro.demo.tracking.TrackingAdapter2
import com.samples.metro.demo.tracking.TrackingAdapter3
import com.samples.metro.demo.tracking.TrackingHandler
import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.IntoSet


@BindingContainer
interface TrackingModule {

    @Binds
    fun bindsTrackingHandler(instance: DefaultTrackingHandler): TrackingHandler

    @IntoSet
    @Binds
    fun bindsTrackingAdapter2(instance: TrackingAdapter2) : TrackingAdapter

    @IntoSet
    @Binds
    fun bindsTrackingAdapter3(instance: TrackingAdapter3) : TrackingAdapter

}