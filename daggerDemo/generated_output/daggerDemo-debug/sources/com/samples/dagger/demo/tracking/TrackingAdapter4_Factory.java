package com.samples.dagger.demo.tracking;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes5.dex */
public final class TrackingAdapter4_Factory implements Factory<TrackingAdapter4> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public TrackingAdapter4 get() {
        return newInstance();
    }

    public static TrackingAdapter4_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static TrackingAdapter4 newInstance() {
        return new TrackingAdapter4();
    }

    private static final class InstanceHolder {
        static final TrackingAdapter4_Factory INSTANCE = new TrackingAdapter4_Factory();

        private InstanceHolder() {
        }
    }
}
