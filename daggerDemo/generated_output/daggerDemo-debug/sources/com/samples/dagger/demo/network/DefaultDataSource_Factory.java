package com.samples.dagger.demo.network;

import dagger.internal.Factory;
import dagger.internal.Provider;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class DefaultDataSource_Factory implements Factory<DefaultDataSource> {
    private final Provider<Map<String, javax.inject.Provider<ScreenDetailHandler>>> screenContextProviderMapProvider;

    private DefaultDataSource_Factory(Provider<Map<String, javax.inject.Provider<ScreenDetailHandler>>> screenContextProviderMapProvider) {
        this.screenContextProviderMapProvider = screenContextProviderMapProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public DefaultDataSource get() {
        return newInstance(this.screenContextProviderMapProvider.get());
    }

    public static DefaultDataSource_Factory create(Provider<Map<String, javax.inject.Provider<ScreenDetailHandler>>> screenContextProviderMapProvider) {
        return new DefaultDataSource_Factory(screenContextProviderMapProvider);
    }

    public static DefaultDataSource newInstance(Map<String, javax.inject.Provider<ScreenDetailHandler>> screenContextProviderMap) {
        return new DefaultDataSource(screenContextProviderMap);
    }
}
