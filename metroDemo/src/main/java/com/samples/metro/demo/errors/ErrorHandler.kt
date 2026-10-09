package com.samples.metro.demo.errors

import android.util.Log
import dev.zacsweers.metro.Inject

interface ErrorHandler {

    fun handleError(message: String)
}

class DefaultErrorHandler @Inject constructor(): ErrorHandler {
    override fun handleError(message: String) {
        Log.d("ErrorHandler", message)
    }
}