package com.samples.dagger.demo.network;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes9.dex */
public final class MainScreenDetailHandler_Factory implements Factory<MainScreenDetailHandler> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public MainScreenDetailHandler get() {
        return newInstance();
    }

    public static MainScreenDetailHandler_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MainScreenDetailHandler newInstance() {
        return new MainScreenDetailHandler();
    }

    private static final class InstanceHolder {
        static final MainScreenDetailHandler_Factory INSTANCE = new MainScreenDetailHandler_Factory();

        private InstanceHolder() {
        }
    }
}
