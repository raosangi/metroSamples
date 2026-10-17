package com.samples.metro.demo.network

import android.util.Log
import com.samples.metro.demo.AppNameInfo
import com.samples.metro.demo.AppVersionInfo
import com.samples.metro.demo.tracking.TrackingHandler
import dev.zacsweers.metro.Inject


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


