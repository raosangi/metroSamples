package com.samples.dagger.demo.tracking;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes5.dex */
public final class TrackingAdapter3_Factory implements Factory<TrackingAdapter3> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public TrackingAdapter3 get() {
        return newInstance();
    }

    public static TrackingAdapter3_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static TrackingAdapter3 newInstance() {
        return new TrackingAdapter3();
    }

    private static final class InstanceHolder {
        static final TrackingAdapter3_Factory INSTANCE = new TrackingAdapter3_Factory();

        private InstanceHolder() {
        }
    }
}
