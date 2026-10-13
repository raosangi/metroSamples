package com.samples.interop.dagger.demo.di

import com.samples.interop.dagger.demo.tracking.DefaultTrackingHandler
import com.samples.interop.dagger.demo.tracking.NewTrackingQualifier
import com.samples.interop.dagger.demo.tracking.OldTrackingIdentifier
import com.samples.interop.dagger.demo.tracking.OldTrackingQualifier
import com.samples.interop.dagger.demo.tracking.TrackingAdapter
import com.samples.interop.dagger.demo.tracking.TrackingAdapter2
import com.samples.interop.dagger.demo.tracking.TrackingAdapter3
import com.samples.interop.dagger.demo.tracking.TrackingAdapter4
import com.samples.interop.dagger.demo.tracking.TrackingAdapter5
import com.samples.interop.dagger.demo.tracking.TrackingAdapter6
import com.samples.interop.dagger.demo.tracking.TrackingAdapter7
import com.samples.interop.dagger.demo.tracking.TrackingAdapter8
import com.samples.interop.dagger.demo.tracking.TrackingAdapter9
import com.samples.interop.dagger.demo.tracking.TrackingExporter
import com.samples.interop.dagger.demo.tracking.TrackingHandler
import com.samples.interop.dagger.demo.tracking.TrackingIdentifier
import dagger.Binds
import dagger.BindsOptionalOf
import dagger.Module
import dagger.Provides
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import dagger.multibindings.IntoSet
import javax.inject.Provider
import kotlin.reflect.KClass


@Module
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

    @BindsOptionalOf
    fun bindsOptionalOf(): TrackingExporter

    @Binds
    @IntoMap
    @ClassKey(OldTrackingIdentifier::class)
    fun providesStringTag(instance: OldTrackingIdentifier): TrackingIdentifier

    companion object {
        @Provides
        fun providesTrackingHandler(
            @OldTrackingQualifier oldTrackingAdapter: Provider<Set<@JvmSuppressWildcards TrackingAdapter>>,
            @NewTrackingQualifier newTrackingAdapter: Provider<Set<@JvmSuppressWildcards TrackingAdapter>>,
            trackingTags: Map<KClass<*>, () -> TrackingIdentifier>,
        ): TrackingHandler = DefaultTrackingHandler(oldTrackingAdapter, newTrackingAdapter, trackingTags)
    }

}