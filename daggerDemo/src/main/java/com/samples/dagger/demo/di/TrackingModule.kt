package com.samples.dagger.demo.di

import com.samples.dagger.demo.tracking.DefaultTrackingHandler
import com.samples.dagger.demo.tracking.TrackingAdapter
import com.samples.dagger.demo.tracking.TrackingAdapter2
import com.samples.dagger.demo.tracking.TrackingAdapter3
import com.samples.dagger.demo.tracking.TrackingHandler
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoSet


@Module
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