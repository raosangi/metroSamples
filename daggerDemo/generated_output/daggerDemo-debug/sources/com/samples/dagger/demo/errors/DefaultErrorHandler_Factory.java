package com.samples.dagger.demo.errors;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultErrorHandler_Factory implements Factory<DefaultErrorHandler> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public DefaultErrorHandler get() {
        return newInstance();
    }

    public static DefaultErrorHandler_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DefaultErrorHandler newInstance() {
        return new DefaultErrorHandler();
    }

    private static final class InstanceHolder {
        static final DefaultErrorHandler_Factory INSTANCE = new DefaultErrorHandler_Factory();

        private InstanceHolder() {
        }
    }
}
