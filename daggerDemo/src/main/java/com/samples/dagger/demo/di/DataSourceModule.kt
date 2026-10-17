package com.samples.dagger.demo.di

import com.samples.dagger.demo.network.AppScreenDetailHandler
import com.samples.dagger.demo.network.DataSource
import com.samples.dagger.demo.network.DefaultDataSource
import com.samples.dagger.demo.network.DefaultDummyUnused
import com.samples.dagger.demo.network.DummyUnused
import com.samples.dagger.demo.network.ScreenDetailHandler
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