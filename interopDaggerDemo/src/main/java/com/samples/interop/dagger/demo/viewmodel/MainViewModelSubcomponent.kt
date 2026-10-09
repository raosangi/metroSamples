package com.samples.interop.dagger.demo.viewmodel

import androidx.lifecycle.SavedStateHandle
import com.samples.interop.dagger.demo.network.MainScreenDetailHandler
import com.samples.interop.dagger.demo.network.ScreenDetailHandler
import com.samples.interop.dagger.demo.tracking.MainActivityTrackingAdapter
import com.samples.interop.dagger.demo.tracking.TrackingAdapter
import dagger.Binds
import dagger.BindsInstance
import dagger.Module
import dagger.Subcomponent
import dagger.multibindings.IntoMap
import dagger.multibindings.IntoSet
import dagger.multibindings.StringKey


@Subcomponent(modules = [
    MainViewModelTrackingModule::class
])
interface MainViewModelSubcomponent {

    val mainViewModel: MainViewModel

    @Subcomponent.Factory
    interface Factory{
        fun create(@BindsInstance savedStateHandle: SavedStateHandle): MainViewModelSubcomponent
    }
}


@Module
interface MainViewModelTrackingModule {
    @IntoSet
    @Binds
    fun bindsTrackingAdapter3(instance: MainActivityTrackingAdapter) : TrackingAdapter

    @IntoMap
    @StringKey("Main")
    @Binds
    fun bindsMainScreenDetailHandler(instance: MainScreenDetailHandler) : ScreenDetailHandler
}