package com.samples.interop.dagger.demo.di

import com.samples.interop.dagger.demo.errors.DefaultErrorHandler
import com.samples.interop.dagger.demo.errors.ErrorHandler
import dagger.Binds
import dagger.Module

@Module
interface ErrorModule {

    @Binds
    fun bindsErrorHandler(instance: DefaultErrorHandler): ErrorHandler
}