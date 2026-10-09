package com.samples.dagger.demo.network

import android.util.Log
import javax.inject.Inject

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

