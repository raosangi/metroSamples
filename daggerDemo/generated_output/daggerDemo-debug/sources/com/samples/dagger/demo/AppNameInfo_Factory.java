package com.samples.dagger.demo;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes7.dex */
public final class AppNameInfo_Factory implements Factory<AppNameInfo> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public AppNameInfo get() {
        return newInstance();
    }

    public static AppNameInfo_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AppNameInfo newInstance() {
        return new AppNameInfo();
    }

    private static final class InstanceHolder {
        static final AppNameInfo_Factory INSTANCE = new AppNameInfo_Factory();

        private InstanceHolder() {
        }
    }
}
