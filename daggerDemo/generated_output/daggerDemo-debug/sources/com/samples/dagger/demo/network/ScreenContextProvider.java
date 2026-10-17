package com.samples.dagger.demo.network;

import com.samples.dagger.demo.AppNameInfo;
import com.samples.dagger.demo.AppVersionInfo;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DataSource.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0002\b\b¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u000f"}, d2 = {"Lcom/samples/dagger/demo/network/ScreenContextProvider;", "", "appNameInfo", "Lcom/samples/dagger/demo/AppNameInfo;", "appVersionInfo", "Lcom/samples/dagger/demo/AppVersionInfo;", "<init>", "(Lcom/samples/dagger/demo/AppNameInfo;Lcom/samples/dagger/demo/AppVersionInfo;)V", "Ljavax/inject/Inject;", "getAppNameInfo", "()Lcom/samples/dagger/demo/AppNameInfo;", "getAppVersionInfo", "()Lcom/samples/dagger/demo/AppVersionInfo;", "getApplicableContext", "", "daggerDemo", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ScreenContextProvider {
    public static final int $stable = AppVersionInfo.$stable | AppNameInfo.$stable;
    private final AppNameInfo appNameInfo;
    private final AppVersionInfo appVersionInfo;

    @Inject
    public ScreenContextProvider(AppNameInfo appNameInfo, AppVersionInfo appVersionInfo) {
        Intrinsics.checkNotNullParameter(appNameInfo, "appNameInfo");
        Intrinsics.checkNotNullParameter(appVersionInfo, "appVersionInfo");
        this.appNameInfo = appNameInfo;
        this.appVersionInfo = appVersionInfo;
    }

    public final AppNameInfo getAppNameInfo() {
        return this.appNameInfo;
    }

    public final AppVersionInfo getAppVersionInfo() {
        return this.appVersionInfo;
    }

    public final String getApplicableContext() {
        return this.appVersionInfo.getAppVersion() + " + " + this.appNameInfo.getAppName();
    }
}
