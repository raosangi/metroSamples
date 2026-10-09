package com.samples.metro.demo.di

import com.samples.metro.demo.errors.DefaultErrorHandler
import com.samples.metro.demo.errors.ErrorHandler
import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds

@BindingContainer
interface ErrorModule {

    @Binds
    fun bindsErrorHandler(instance: DefaultErrorHandler): ErrorHandler
}