package com.samples.interop.dagger.demo.di


import com.samples.interop.dagger.demo.network.ScreenDetailHandler
import com.samples.interop.dagger.demo.tracking.NewTrackingQualifier
import com.samples.interop.dagger.demo.tracking.OldTrackingQualifier
import com.samples.interop.dagger.demo.tracking.TrackingAdapter
import com.samples.interop.dagger.demo.tracking.TrackingIdentifier
import dagger.Component
import dev.zacsweers.metro.createGraph
import javax.inject.Provider
import javax.inject.Singleton
import kotlin.reflect.KClass

@Singleton
@Component(modules = [
    ErrorModule::class,
    TrackingModule::class,
    DataSourceModule::class
])
interface AppComponent {

    @OldTrackingQualifier
    val trackingAdapterOld: Provider<Set<TrackingAdapter>>

    @NewTrackingQualifier
    val trackingAdapterNew: Provider<Set<TrackingAdapter>>

    val screenContextProviderMap: Map<String,Provider<ScreenDetailHandler>>

    val trackingTags: Map<Class<*>, () -> TrackingIdentifier>

    val mainActivitySubComponentFactory: MainActivitySubComponent.Factory
}


object AppComponentHolder {

    val appComponent: AppComponent by lazy {
        createGraph()
    }

}

