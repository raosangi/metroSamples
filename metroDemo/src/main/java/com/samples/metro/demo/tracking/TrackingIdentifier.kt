package com.samples.metro.demo.tracking

import dev.zacsweers.metro.Inject


interface TrackingIdentifier {

}

class OldTrackingIdentifier @Inject constructor(): TrackingIdentifier