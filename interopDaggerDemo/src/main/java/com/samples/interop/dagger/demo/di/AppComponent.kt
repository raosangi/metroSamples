package com.samples.interop.dagger.demo.di


import com.samples.interop.dagger.demo.network.ScreenDetailHandler
import com.samples.interop.dagger.demo.tracking.TrackingAdapter
import dagger.Component
import dev.zacsweers.metro.createGraph
import javax.inject.Singleton
import kotlin.reflect.KClass

@Singleton
@Component(modules = [
    ErrorModule::class,
    TrackingModule::class,
    DataSourceModule::class
])
interface AppComponent {

    val trackingAdapter: Set<TrackingAdapter>

    val screenContextProviderMap: Map<String, ScreenDetailHandler>

    val mainActivitySubComponentFactory: MainActivitySubComponent.Factory
}


object AppComponentHolder {

    val appComponent: AppComponent by lazy {
        createGraph()
    }

}

