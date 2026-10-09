package com.samples.dagger.demo.network

import javax.inject.Inject
import javax.inject.Provider


interface DataSource {
    fun getData(key: String): String
}

class DefaultDataSource @Inject constructor(
    val screenContextProviderMap: Map<String,@JvmSuppressWildcards Provider<ScreenDetailHandler>>
) : DataSource {
    override fun getData(key: String): String {
        val context = screenContextProviderMap[key]?.get()?.getScreenContext() ?: "UNKNOWN"
        return "hello $context"
    }
}