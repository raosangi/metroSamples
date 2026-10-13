package com.samples.interop.dagger.demo.tracking

interface TrackingExporter  {
    fun export(trackId: String): String
}