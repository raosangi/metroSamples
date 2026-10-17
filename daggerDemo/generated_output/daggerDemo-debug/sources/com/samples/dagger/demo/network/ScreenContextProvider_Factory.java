package com.samples.dagger.demo.network;

import com.samples.dagger.demo.AppNameInfo;
import com.samples.dagger.demo.AppVersionInfo;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes9.dex */
public final class ScreenContextProvider_Factory implements Factory<ScreenContextProvider> {
    private final Provider<AppNameInfo> appNameInfoProvider;
    private final Provider<AppVersionInfo> appVersionInfoProvider;

    private ScreenContextProvider_Factory(Provider<AppNameInfo> appNameInfoProvider, Provider<AppVersionInfo> appVersionInfoProvider) {
        this.appNameInfoProvider = appNameInfoProvider;
        this.appVersionInfoProvider = appVersionInfoProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public ScreenContextProvider get() {
        return newInstance(this.appNameInfoProvider.get(), this.appVersionInfoProvider.get());
    }

    public static ScreenContextProvider_Factory create(Provider<AppNameInfo> appNameInfoProvider, Provider<AppVersionInfo> appVersionInfoProvider) {
        return new ScreenContextProvider_Factory(appNameInfoProvider, appVersionInfoProvider);
    }

    public static ScreenContextProvider newInstance(AppNameInfo appNameInfo, AppVersionInfo appVersionInfo) {
        return new ScreenContextProvider(appNameInfo, appVersionInfo);
    }
}
