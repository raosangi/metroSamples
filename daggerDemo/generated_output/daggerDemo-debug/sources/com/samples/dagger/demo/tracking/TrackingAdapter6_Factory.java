package com.samples.dagger.demo.tracking;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes5.dex */
public final class TrackingAdapter6_Factory implements Factory<TrackingAdapter6> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public TrackingAdapter6 get() {
        return newInstance();
    }

    public static TrackingAdapter6_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static TrackingAdapter6 newInstance() {
        return new TrackingAdapter6();
    }

    private static final class InstanceHolder {
        static final TrackingAdapter6_Factory INSTANCE = new TrackingAdapter6_Factory();

        private InstanceHolder() {
        }
    }
}
