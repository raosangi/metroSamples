package com.samples.metro.demo.viewmodel

import androidx.lifecycle.SavedStateHandle
import com.samples.metro.demo.network.MainScreenDetailHandler
import com.samples.metro.demo.network.ScreenDetailHandler
import com.samples.metro.demo.tracking.MainActivityTrackingAdapter
import com.samples.metro.demo.tracking.TrackingAdapter
import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.GraphExtension
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.IntoSet
import dev.zacsweers.metro.Provides
import dev.zacsweers.metro.StringKey

@GraphExtension(bindingContainers = [
    MainViewModelTrackingModule::class
])
interface MainViewModelSubcomponent {

    val mainViewModel: MainViewModel

    @GraphExtension.Factory
    interface Factory{
        fun create(@Provides savedStateHandle: SavedStateHandle): MainViewModelSubcomponent
    }
}


@BindingContainer
interface MainViewModelTrackingModule {
    @IntoSet
    @Binds
    fun bindsTrackingAdapter3(instance: MainActivityTrackingAdapter) : TrackingAdapter

    @IntoMap
    @StringKey("Main")
    @Binds
    fun bindsMainScreenDetailHandler(instance: MainScreenDetailHandler) : ScreenDetailHandler
}