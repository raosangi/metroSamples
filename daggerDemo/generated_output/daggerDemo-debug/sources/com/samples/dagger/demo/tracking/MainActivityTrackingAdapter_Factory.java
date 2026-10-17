package com.samples.dagger.demo.tracking;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes5.dex */
public final class MainActivityTrackingAdapter_Factory implements Factory<MainActivityTrackingAdapter> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public MainActivityTrackingAdapter get() {
        return newInstance();
    }

    public static MainActivityTrackingAdapter_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MainActivityTrackingAdapter newInstance() {
        return new MainActivityTrackingAdapter();
    }

    private static final class InstanceHolder {
        static final MainActivityTrackingAdapter_Factory INSTANCE = new MainActivityTrackingAdapter_Factory();

        private InstanceHolder() {
        }
    }
}
