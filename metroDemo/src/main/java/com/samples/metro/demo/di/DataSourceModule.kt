package com.samples.metro.demo.di

import com.samples.metro.demo.network.AppScreenDetailHandler
import com.samples.metro.demo.network.DataSource
import com.samples.metro.demo.network.DefaultDataSource
import com.samples.metro.demo.network.ScreenDetailHandler
import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.StringKey


@BindingContainer
interface DataSourceModule {

    @Binds
    fun bindsDefaultDataSource(instance: DefaultDataSource): DataSource

    @IntoMap
    @StringKey("App")
    @Binds
    fun bindsAppScreenDetailHandler(instance: AppScreenDetailHandler) : ScreenDetailHandler
}