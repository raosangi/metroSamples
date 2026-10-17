package com.samples.dagger.demo.errors;

import dagger.internal.Factory;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultErrorHandler_Factory implements Factory<DefaultErrorHandler> {
    private final Provider<DefaultLogging> defaultLoggingProvider;

    private DefaultErrorHandler_Factory(Provider<DefaultLogging> defaultLoggingProvider) {
        this.defaultLoggingProvider = defaultLoggingProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public DefaultErrorHandler get() {
        return newInstance(this.defaultLoggingProvider.get());
    }

    public static DefaultErrorHandler_Factory create(Provider<DefaultLogging> defaultLoggingProvider) {
        return new DefaultErrorHandler_Factory(defaultLoggingProvider);
    }

    public static DefaultErrorHandler newInstance(DefaultLogging defaultLogging) {
        return new DefaultErrorHandler(defaultLogging);
    }
}
