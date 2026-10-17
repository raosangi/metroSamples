package com.samples.dagger.demo.tracking;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes5.dex */
public final class TrackingAdapter8_Factory implements Factory<TrackingAdapter8> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public TrackingAdapter8 get() {
        return newInstance();
    }

    public static TrackingAdapter8_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static TrackingAdapter8 newInstance() {
        return new TrackingAdapter8();
    }

    private static final class InstanceHolder {
        static final TrackingAdapter8_Factory INSTANCE = new TrackingAdapter8_Factory();

        private InstanceHolder() {
        }
    }
}
