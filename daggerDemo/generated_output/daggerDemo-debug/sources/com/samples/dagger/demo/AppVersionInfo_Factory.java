package com.samples.dagger.demo;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes7.dex */
public final class AppVersionInfo_Factory implements Factory<AppVersionInfo> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public AppVersionInfo get() {
        return newInstance();
    }

    public static AppVersionInfo_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AppVersionInfo newInstance() {
        return new AppVersionInfo();
    }

    private static final class InstanceHolder {
        static final AppVersionInfo_Factory INSTANCE = new AppVersionInfo_Factory();

        private InstanceHolder() {
        }
    }
}
