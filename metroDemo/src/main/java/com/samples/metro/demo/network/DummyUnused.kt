package com.samples.metro.demo.network

interface DummyUnused {

    fun doNothing()
}


class DefaultDummyUnused: DummyUnused {
    override fun doNothing() {
        //no-op
    }
}

