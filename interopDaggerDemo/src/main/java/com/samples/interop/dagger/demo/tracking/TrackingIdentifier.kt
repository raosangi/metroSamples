package com.samples.interop.dagger.demo.tracking

import javax.inject.Inject

interface TrackingIdentifier {

}

class OldTrackingIdentifier @Inject constructor(): TrackingIdentifier