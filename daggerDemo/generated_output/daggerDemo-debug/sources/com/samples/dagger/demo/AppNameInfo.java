package com.samples.dagger.demo;

import javax.inject.Inject;
import kotlin.Metadata;

/* JADX INFO: compiled from: AppInfo.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\b\u0007\u001a\u0002\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bÊ\u0001\f\b\n\u0012\b\b\u000b\u0012\u0004\b\u0003\u0010\u0002¨\u0006\t"}, d2 = {"Lcom/samples/dagger/demo/AppNameInfo;", "", "<init>", "()V", "Ljavax/inject/Inject;", "appName", "", "getAppName", "()Ljava/lang/String;", "daggerDemo", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class AppNameInfo {
    public static final int $stable = 0;
    private final String appName = "com.samples.metro.demo";

    @Inject
    public AppNameInfo() {
    }

    public final String getAppName() {
        return this.appName;
    }
}
