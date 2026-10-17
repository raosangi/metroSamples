package com.samples.dagger.demo.network;

import com.samples.dagger.demo.AppNameInfo;
import com.samples.dagger.demo.AppVersionInfo;
import com.samples.dagger.demo.tracking.TrackingHandler;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DataSource.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0002\b\b¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fÊ\u0001\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0010"}, d2 = {"Lcom/samples/dagger/demo/network/DefaultDataSource;", "Lcom/samples/dagger/demo/network/DataSource;", "screenContextProvider", "Lcom/samples/dagger/demo/network/ScreenContextProvider;", "trackingHandler", "Lcom/samples/dagger/demo/tracking/TrackingHandler;", "<init>", "(Lcom/samples/dagger/demo/network/ScreenContextProvider;Lcom/samples/dagger/demo/tracking/TrackingHandler;)V", "Ljavax/inject/Inject;", "getScreenContextProvider", "()Lcom/samples/dagger/demo/network/ScreenContextProvider;", "getTrackingHandler", "()Lcom/samples/dagger/demo/tracking/TrackingHandler;", "getData", "", "key", "daggerDemo", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class DefaultDataSource implements DataSource {
    public static final int $stable = AppVersionInfo.$stable | AppNameInfo.$stable;
    private final ScreenContextProvider screenContextProvider;
    private final TrackingHandler trackingHandler;

    @Inject
    public DefaultDataSource(ScreenContextProvider screenContextProvider, TrackingHandler trackingHandler) {
        Intrinsics.checkNotNullParameter(screenContextProvider, "screenContextProvider");
        Intrinsics.checkNotNullParameter(trackingHandler, "trackingHandler");
        this.screenContextProvider = screenContextProvider;
        this.trackingHandler = trackingHandler;
    }

    public final ScreenContextProvider getScreenContextProvider() {
        return this.screenContextProvider;
    }

    public final TrackingHandler getTrackingHandler() {
        return this.trackingHandler;
    }

    @Override // com.samples.dagger.demo.network.DataSource
    public String getData(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.trackingHandler.handleTracking("network");
        return "hello " + this.screenContextProvider.getApplicableContext();
    }
}
