package com.samples.dagger.demo

import javax.inject.Inject


class AppNameInfo @Inject constructor() {

    val appName = "com.samples.metro.demo"
}


class AppVersionInfo @Inject constructor() {
    val appVersion = "1.0"
}