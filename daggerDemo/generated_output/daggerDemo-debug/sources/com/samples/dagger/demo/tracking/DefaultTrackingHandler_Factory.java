package com.samples.dagger.demo.tracking;

import dagger.internal.Factory;
import dagger.internal.Provider;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class DefaultTrackingHandler_Factory implements Factory<DefaultTrackingHandler> {
    private final Provider<Set<TrackingAdapter>> trackingAdapterProvider;
    private final Provider<Map<Class<?>, Object>> trackingTagsProvider;

    private DefaultTrackingHandler_Factory(Provider<Set<TrackingAdapter>> trackingAdapterProvider, Provider<Map<Class<?>, Object>> trackingTagsProvider) {
        this.trackingAdapterProvider = trackingAdapterProvider;
        this.trackingTagsProvider = trackingTagsProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public DefaultTrackingHandler get() {
        return newInstance(this.trackingAdapterProvider.get(), this.trackingTagsProvider.get());
    }

    public static DefaultTrackingHandler_Factory create(Provider<Set<TrackingAdapter>> trackingAdapterProvider, Provider<Map<Class<?>, Object>> trackingTagsProvider) {
        return new DefaultTrackingHandler_Factory(trackingAdapterProvider, trackingTagsProvider);
    }

    public static DefaultTrackingHandler newInstance(Set<TrackingAdapter> trackingAdapter, Map<Class<?>, Object> trackingTags) {
        return new DefaultTrackingHandler(trackingAdapter, trackingTags);
    }
}
