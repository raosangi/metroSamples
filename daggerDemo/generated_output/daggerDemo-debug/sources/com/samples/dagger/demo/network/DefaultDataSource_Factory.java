package com.samples.dagger.demo.network;

import com.samples.dagger.demo.tracking.TrackingHandler;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes9.dex */
public final class DefaultDataSource_Factory implements Factory<DefaultDataSource> {
    private final Provider<ScreenContextProvider> screenContextProvider;
    private final Provider<TrackingHandler> trackingHandlerProvider;

    private DefaultDataSource_Factory(Provider<ScreenContextProvider> screenContextProvider, Provider<TrackingHandler> trackingHandlerProvider) {
        this.screenContextProvider = screenContextProvider;
        this.trackingHandlerProvider = trackingHandlerProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public DefaultDataSource get() {
        return newInstance(this.screenContextProvider.get(), this.trackingHandlerProvider.get());
    }

    public static DefaultDataSource_Factory create(Provider<ScreenContextProvider> screenContextProvider, Provider<TrackingHandler> trackingHandlerProvider) {
        return new DefaultDataSource_Factory(screenContextProvider, trackingHandlerProvider);
    }

    public static DefaultDataSource newInstance(ScreenContextProvider screenContextProvider, TrackingHandler trackingHandler) {
        return new DefaultDataSource(screenContextProvider, trackingHandler);
    }
}
