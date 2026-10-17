package com.samples.dagger.demo.tracking;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes5.dex */
public final class TrackingAdapter2_Factory implements Factory<TrackingAdapter2> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public TrackingAdapter2 get() {
        return newInstance();
    }

    public static TrackingAdapter2_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static TrackingAdapter2 newInstance() {
        return new TrackingAdapter2();
    }

    private static final class InstanceHolder {
        static final TrackingAdapter2_Factory INSTANCE = new TrackingAdapter2_Factory();

        private InstanceHolder() {
        }
    }
}
