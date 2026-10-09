package com.samples.metro.demo.network

import android.util.Log
import dev.zacsweers.metro.Inject

interface ScreenDetailHandler {

    fun getScreenContext(): String
}

class AppScreenDetailHandler @Inject constructor(): ScreenDetailHandler {
    override fun getScreenContext() : String {
        Log.d("ScreenDetailHandler", "invoke with app context")
        return "app"
    }
}

class MainScreenDetailHandler @Inject constructor(): ScreenDetailHandler {
    override fun getScreenContext() : String {
        Log.d("ScreenDetailHandler", "invoke with main context")
        return "main"
    }
}

