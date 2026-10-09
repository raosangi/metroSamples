package com.samples.interop.dagger.demo.di


import dagger.Component
import dev.zacsweers.metro.createGraph
import javax.inject.Singleton

@Singleton
@Component(modules = [
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

