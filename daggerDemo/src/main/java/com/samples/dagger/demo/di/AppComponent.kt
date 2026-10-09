package com.samples.dagger.demo.di


import dagger.Component
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
        DaggerAppComponent.create()
    }

}

