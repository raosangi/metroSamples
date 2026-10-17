package com.samples.metro.demo.di

import com.samples.metro.demo.tracking.DefaultTrackingHandler
import com.samples.metro.demo.tracking.NewTrackingQualifier
import com.samples.metro.demo.tracking.OldTrackingIdentifier
import com.samples.metro.demo.tracking.OldTrackingQualifier
import com.samples.metro.demo.tracking.TrackingAdapter
import com.samples.metro.demo.tracking.TrackingAdapter2
import com.samples.metro.demo.tracking.TrackingAdapter3
import com.samples.metro.demo.tracking.TrackingAdapter4
import com.samples.metro.demo.tracking.TrackingAdapter5
import com.samples.metro.demo.tracking.TrackingAdapter6
import com.samples.metro.demo.tracking.TrackingAdapter7
import com.samples.metro.demo.tracking.TrackingAdapter8
import com.samples.metro.demo.tracking.TrackingAdapter9
import com.samples.metro.demo.tracking.TrackingHandler
import com.samples.metro.demo.tracking.TrackingIdentifier
import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ClassKey
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.IntoSet
import dev.zacsweers.metro.Provides
import kotlin.reflect.KClass


@BindingContainer
interface TrackingModule {

    @IntoSet
    @Binds
    @OldTrackingQualifier
    fun bindsTrackingAdapter2(instance: TrackingAdapter2) : TrackingAdapter

    @[IntoSet Binds NewTrackingQualifier]
    fun bindsTrackingAdapter3(instance: TrackingAdapter3) : TrackingAdapter

    @[IntoSet Binds NewTrackingQualifier]
    fun bindsTrackingAdapter4(instance: TrackingAdapter4) : TrackingAdapter

    @[IntoSet Binds NewTrackingQualifier]
    fun bindsTrackingAdapter5(instance: TrackingAdapter5) : TrackingAdapter

    @[IntoSet Binds NewTrackingQualifier]
    fun bindsTrackingAdapter6(instance: TrackingAdapter6) : TrackingAdapter

    @[IntoSet Binds NewTrackingQualifier]
    fun bindsTrackingAdapter7(instance: TrackingAdapter7) : TrackingAdapter

    @[IntoSet Binds NewTrackingQualifier]
    fun bindsTrackingAdapter8(instance: TrackingAdapter8) : TrackingAdapter

    @[IntoSet Binds NewTrackingQualifier]
    fun bindsTrackingAdapter9(instance: TrackingAdapter9) : TrackingAdapter


    @Binds
    @IntoMap
    @ClassKey
    fun providesStringTag(instance: OldTrackingIdentifier): TrackingIdentifier

    companion object {
        @Provides
        fun providesTrackingHandler(
            @OldTrackingQualifier oldTrackingAdapter: () -> Set<@JvmSuppressWildcards TrackingAdapter>,
            @NewTrackingQualifier newTrackingAdapter: () -> Set<@JvmSuppressWildcards TrackingAdapter>,
            trackingTags: Map<KClass<*>, () -> TrackingIdentifier>,
        ): TrackingHandler =
            DefaultTrackingHandler(oldTrackingAdapter, newTrackingAdapter, trackingTags)
    }

}