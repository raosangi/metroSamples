package com.samples.dagger.demo.tracking;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes5.dex */
public final class TrackingAdapter5_Factory implements Factory<TrackingAdapter5> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public TrackingAdapter5 get() {
        return newInstance();
    }

    public static TrackingAdapter5_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static TrackingAdapter5 newInstance() {
        return new TrackingAdapter5();
    }

    private static final class InstanceHolder {
        static final TrackingAdapter5_Factory INSTANCE = new TrackingAdapter5_Factory();

        private InstanceHolder() {
        }
    }
}
