package com.samples.metro.demo.di


import com.samples.metro.demo.network.DataSource
import com.samples.metro.demo.network.ScreenDetailHandler
import com.samples.metro.demo.tracking.NewTrackingQualifier
import com.samples.metro.demo.tracking.OldTrackingQualifier
import com.samples.metro.demo.tracking.TrackingAdapter
import com.samples.metro.demo.tracking.TrackingHandler
import com.samples.metro.demo.tracking.TrackingIdentifier
import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.DependencyGraph
import dev.zacsweers.metro.createGraph
import kotlin.reflect.KClass


@DependencyGraph(scope = AppScope::class, bindingContainers = [
    ErrorModule::class,
    TrackingModule::class,
    DataSourceModule::class
])
interface AppComponent {

    @OldTrackingQualifier
    val trackingAdapterOld: () -> Set<TrackingAdapter>

    @NewTrackingQualifier
    val trackingAdapterNew: () -> Set<TrackingAdapter>

    val screenContextProviderMap: Map<String, () -> ScreenDetailHandler>

    val trackingTags: Map<KClass<*>, () -> TrackingIdentifier>

    val mainActivitySubComponentFactory: MainActivitySubComponent.Factory

}


object AppComponentHolder {

    val appComponent: AppComponent by lazy {
        createGraph()
    }

}

