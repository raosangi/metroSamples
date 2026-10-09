package com.samples.dagger.demo.network;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes9.dex */
public final class AppScreenDetailHandler_Factory implements Factory<AppScreenDetailHandler> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public AppScreenDetailHandler get() {
        return newInstance();
    }

    public static AppScreenDetailHandler_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AppScreenDetailHandler newInstance() {
        return new AppScreenDetailHandler();
    }

    private static final class InstanceHolder {
        static final AppScreenDetailHandler_Factory INSTANCE = new AppScreenDetailHandler_Factory();

        private InstanceHolder() {
        }
    }
}
