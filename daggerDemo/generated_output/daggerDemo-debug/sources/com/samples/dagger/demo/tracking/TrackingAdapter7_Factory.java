package com.samples.dagger.demo.tracking;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes5.dex */
public final class TrackingAdapter7_Factory implements Factory<TrackingAdapter7> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public TrackingAdapter7 get() {
        return newInstance();
    }

    public static TrackingAdapter7_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static TrackingAdapter7 newInstance() {
        return new TrackingAdapter7();
    }

    private static final class InstanceHolder {
        static final TrackingAdapter7_Factory INSTANCE = new TrackingAdapter7_Factory();

        private InstanceHolder() {
        }
    }
}
