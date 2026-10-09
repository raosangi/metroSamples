package com.samples.metro.demo.di

import com.samples.metro.demo.MainActivity
import com.samples.metro.demo.viewmodel.MainViewModelSubcomponent
import dev.zacsweers.metro.GraphExtension

@GraphExtension
interface MainActivitySubComponent {

    val mainActivitySubComponentFactory: MainViewModelSubcomponent.Factory

    fun inject(activity: MainActivity)

    @GraphExtension.Factory
    interface Factory {
        fun create(): MainActivitySubComponent
    }
}
