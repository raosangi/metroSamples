package com.samples.dagger.demo.di;

import com.samples.dagger.demo.tracking.TrackingAdapter;
import com.samples.dagger.demo.tracking.TrackingHandler;
import com.samples.dagger.demo.tracking.TrackingIdentifier;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackingModule_Companion_ProvidesTrackingHandlerFactory implements Factory<TrackingHandler> {
    private final Provider<Set<TrackingAdapter>> newTrackingAdapterProvider;
    private final Provider<Set<TrackingAdapter>> oldTrackingAdapterProvider;
    private final Provider<Map<Class<?>, javax.inject.Provider<TrackingIdentifier>>> trackingTagsProvider;

    private TrackingModule_Companion_ProvidesTrackingHandlerFactory(Provider<Set<TrackingAdapter>> oldTrackingAdapterProvider, Provider<Set<TrackingAdapter>> newTrackingAdapterProvider, Provider<Map<Class<?>, javax.inject.Provider<TrackingIdentifier>>> trackingTagsProvider) {
        this.oldTrackingAdapterProvider = oldTrackingAdapterProvider;
        this.newTrackingAdapterProvider = newTrackingAdapterProvider;
        this.trackingTagsProvider = trackingTagsProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public TrackingHandler get() {
        return providesTrackingHandler(this.oldTrackingAdapterProvider, this.newTrackingAdapterProvider, this.trackingTagsProvider.get());
    }

    public static TrackingModule_Companion_ProvidesTrackingHandlerFactory create(Provider<Set<TrackingAdapter>> oldTrackingAdapterProvider, Provider<Set<TrackingAdapter>> newTrackingAdapterProvider, Provider<Map<Class<?>, javax.inject.Provider<TrackingIdentifier>>> trackingTagsProvider) {
        return new TrackingModule_Companion_ProvidesTrackingHandlerFactory(oldTrackingAdapterProvider, newTrackingAdapterProvider, trackingTagsProvider);
    }

    public static TrackingHandler providesTrackingHandler(javax.inject.Provider<Set<TrackingAdapter>> oldTrackingAdapter, javax.inject.Provider<Set<TrackingAdapter>> newTrackingAdapter, Map<Class<?>, javax.inject.Provider<TrackingIdentifier>> trackingTags) {
        return (TrackingHandler) Preconditions.checkNotNullFromProvides(TrackingModule.INSTANCE.providesTrackingHandler(oldTrackingAdapter, newTrackingAdapter, trackingTags));
    }
}
