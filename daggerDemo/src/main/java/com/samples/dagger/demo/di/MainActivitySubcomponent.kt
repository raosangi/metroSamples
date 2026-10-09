package com.samples.dagger.demo.di

import com.samples.dagger.demo.MainActivity
import com.samples.dagger.demo.viewmodel.MainViewModelSubcomponent
import dagger.Subcomponent

@Subcomponent
interface MainActivitySubComponent {

    val mainActivitySubComponentFactory: MainViewModelSubcomponent.Factory

    fun inject(activity: MainActivity)

    @Subcomponent.Factory
    interface Factory {
        fun create(): MainActivitySubComponent
    }
}
