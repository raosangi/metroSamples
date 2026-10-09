package com.samples.dagger.demo.tracking;

import dagger.internal.Factory;
import dagger.internal.Provider;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class DefaultTrackingHandler_Factory implements Factory<DefaultTrackingHandler> {
    private final Provider<Set<TrackingAdapter>> trackingAdapterProvider;

    private DefaultTrackingHandler_Factory(Provider<Set<TrackingAdapter>> trackingAdapterProvider) {
        this.trackingAdapterProvider = trackingAdapterProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public DefaultTrackingHandler get() {
        return newInstance(this.trackingAdapterProvider.get());
    }

    public static DefaultTrackingHandler_Factory create(Provider<Set<TrackingAdapter>> trackingAdapterProvider) {
        return new DefaultTrackingHandler_Factory(trackingAdapterProvider);
    }

    public static DefaultTrackingHandler newInstance(Set<TrackingAdapter> trackingAdapter) {
        return new DefaultTrackingHandler(trackingAdapter);
    }
}
