package com.samples.metro.demo.errors

import android.util.Log
import dev.zacsweers.metro.Inject

interface ErrorHandler {

    fun handleError(message: String)
}

class DefaultErrorHandler @Inject constructor(logging: DefaultLogging): ErrorHandler {
    override fun handleError(message: String) {
        Log.d("ErrorHandler", message)
    }
}

class DefaultLogging @Inject constructor()