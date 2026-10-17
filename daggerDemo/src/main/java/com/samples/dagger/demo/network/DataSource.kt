package com.samples.dagger.demo.network

import com.samples.dagger.demo.AppNameInfo
import com.samples.dagger.demo.AppVersionInfo
import com.samples.dagger.demo.tracking.TrackingHandler
import javax.inject.Inject
import javax.inject.Provider


interface DataSource {
    fun getData(key: String): String
}


class DefaultDataSource @Inject constructor(
    val screenContextProvider: ScreenContextProvider,
    val trackingHandler: TrackingHandler,
) : DataSource {
    override fun getData(key: String): String {
        trackingHandler.handleTracking("network")
        return "hello ${screenContextProvider.getApplicableContext()}"
    }
}


class ScreenContextProvider @Inject constructor(
    val appNameInfo: AppNameInfo,
    val appVersionInfo: AppVersionInfo,
) {
    fun getApplicableContext(): String = "${appVersionInfo.appVersion} + ${appNameInfo.appName}"
}



