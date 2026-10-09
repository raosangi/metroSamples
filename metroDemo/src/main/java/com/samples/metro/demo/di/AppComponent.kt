package com.samples.metro.demo.di


import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.DependencyGraph
import dev.zacsweers.metro.createGraph


@DependencyGraph(scope = AppScope::class, bindingContainers = [
    ErrorModule::class,
    TrackingModule::class,
    DataSourceModule::class
])
interface AppComponent {
    val mainActivitySubComponentFactory: MainActivitySubComponent.Factory

}


object AppComponentHolder {

    val appComponent: AppComponent by lazy {
        createGraph()
    }

}

