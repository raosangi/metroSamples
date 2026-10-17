package com.samples.metro.demo

import dev.zacsweers.metro.Inject

class AppNameInfo @Inject constructor() {

    val appName = "com.samples.metro.demo"
}


class AppVersionInfo @Inject constructor() {
    val appVersion = "1.0"
}