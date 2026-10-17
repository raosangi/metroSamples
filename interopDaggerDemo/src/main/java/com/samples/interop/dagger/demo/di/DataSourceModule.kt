package com.samples.interop.dagger.demo.di

import com.samples.interop.dagger.demo.network.AppScreenDetailHandler
import com.samples.interop.dagger.demo.network.DataSource
import com.samples.interop.dagger.demo.network.DefaultDataSource
import com.samples.interop.dagger.demo.network.DefaultDummyUnused
import com.samples.interop.dagger.demo.network.DummyUnused
import com.samples.interop.dagger.demo.network.ScreenDetailHandler
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey


@Module
interface DataSourceModule {

    @Binds
    fun bindsDefaultDataSource(instance: DefaultDataSource): DataSource

    @Binds
    fun bindsDummyUnused(instance: DefaultDummyUnused): DummyUnused

    @IntoMap
    @StringKey("App")
    @Binds
    fun bindsAppScreenDetailHandler(instance: AppScreenDetailHandler) : ScreenDetailHandler
}