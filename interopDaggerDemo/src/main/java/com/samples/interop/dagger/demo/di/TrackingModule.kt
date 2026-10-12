package com.samples.interop.dagger.demo.di

import com.samples.interop.dagger.demo.tracking.DefaultTrackingHandler
import com.samples.interop.dagger.demo.tracking.TrackingAdapter
import com.samples.interop.dagger.demo.tracking.TrackingAdapter2
import com.samples.interop.dagger.demo.tracking.TrackingAdapter3
import com.samples.interop.dagger.demo.tracking.TrackingHandler
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
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

    companion object {
        @Provides
        @IntoMap
        @ClassKey(String::class)
        fun providesStringTag(): Any = "TrackingTag"
    }
}