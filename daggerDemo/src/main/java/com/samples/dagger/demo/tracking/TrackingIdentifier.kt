package com.samples.dagger.demo.tracking

import javax.inject.Inject

interface TrackingIdentifier {

}

class OldTrackingIdentifier @Inject constructor(): TrackingIdentifier