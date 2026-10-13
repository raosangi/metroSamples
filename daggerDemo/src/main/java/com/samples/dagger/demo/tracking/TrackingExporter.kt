package com.samples.dagger.demo.tracking

interface TrackingExporter  {
    fun export(trackId: String): String
}