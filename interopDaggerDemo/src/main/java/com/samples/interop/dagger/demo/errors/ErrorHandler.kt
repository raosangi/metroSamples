package com.samples.interop.dagger.demo.errors

import android.util.Log
import javax.inject.Inject

interface ErrorHandler {

    fun handleError(message: String)
}

class DefaultErrorHandler @Inject constructor(): ErrorHandler {
    override fun handleError(message: String) {
        Log.d("ErrorHandler", message)
    }
}