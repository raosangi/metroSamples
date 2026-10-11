package com.samples.metro.demo.di


import com.samples.metro.demo.network.DataSource
import com.samples.metro.demo.network.ScreenDetailHandler
import com.samples.metro.demo.tracking.TrackingAdapter
import com.samples.metro.demo.tracking.TrackingHandler
import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.DependencyGraph
import dev.zacsweers.metro.createGraph


@DependencyGraph(scope = AppScope::class, bindingContainers = [
    ErrorModule::class,
    TrackingModule::class,
    DataSourceModule::class
])
interface AppComponent {

    val trackingAdapter: Set<TrackingAdapter>

    val screenContextProviderMap: Map<String,ScreenDetailHandler>


    val mainActivitySubComponentFactory: MainActivitySubComponent.Factory

}


object AppComponentHolder {

    val appComponent: AppComponent by lazy {
        createGraph()
    }

}

