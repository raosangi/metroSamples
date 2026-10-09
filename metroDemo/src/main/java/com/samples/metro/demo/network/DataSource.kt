package com.samples.metro.demo.network

import dev.zacsweers.metro.Inject


interface DataSource {
    fun getData(key: String): String
}

class DefaultDataSource @Inject constructor(
    val screenContextProviderMap: Map<String,@JvmSuppressWildcards () -> ScreenDetailHandler>
) : DataSource {
    override fun getData(key: String): String {
        val context = screenContextProviderMap[key]?.invoke()?.getScreenContext() ?: "UNKNOWN"
        return "hello $context"
    }
}