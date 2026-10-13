package com.samples.metro.demo.tracking

interface TrackingExporter  {
    fun export(trackId: String): String
}