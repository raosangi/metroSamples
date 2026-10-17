package com.samples.metro.demo.network;

import com.samples.metro.demo.AppNameInfo;
import com.samples.metro.demo.AppVersionInfo;
import com.samples.metro.demo.tracking.TrackingHandler;
import dev.zacsweers.metro.Inject;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.Factory;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DataSource.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0002\b\b¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fÊ\u0001\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\u0003\u0010\u0000\u008a\u0002\u0016\b\u0014\u0012\u0012\b\u0001\u001a\u000e\n\fMetroFactory¨\u0006\u0011"}, d2 = {"Lcom/samples/metro/demo/network/DefaultDataSource;", "Lcom/samples/metro/demo/network/DataSource;", "screenContextProvider", "Lcom/samples/metro/demo/network/ScreenContextProvider;", "trackingHandler", "Lcom/samples/metro/demo/tracking/TrackingHandler;", "<init>", "(Lcom/samples/metro/demo/network/ScreenContextProvider;Lcom/samples/metro/demo/tracking/TrackingHandler;)V", "Ldev/zacsweers/metro/Inject;", "getScreenContextProvider", "()Lcom/samples/metro/demo/network/ScreenContextProvider;", "getTrackingHandler", "()Lcom/samples/metro/demo/tracking/TrackingHandler;", "getData", "", "key", "MetroFactory", "metroDemo", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters", "dev.zacsweers.metro.compiler"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class DefaultDataSource implements DataSource {
    public static final int $stable = AppVersionInfo.$stable | AppNameInfo.$stable;
    private final ScreenContextProvider screenContextProvider;
    private final TrackingHandler trackingHandler;

    /* JADX INFO: compiled from: DataSource.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001:\u0001\nJ\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007b\u0002\b\bJ\b\u0010\t\u001a\u00020\u0003H\u0007Ê\u0001\u0018\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\n\b\u000f\u0012\u0006\b\n0\u00108\u0011Ê\u0001\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000b"}, d2 = {"Lcom/samples/metro/demo/network/DefaultDataSource$MetroFactory;", "", "declarationMirror", "Lcom/samples/metro/demo/network/DefaultDataSource;", "screenContextProvider", "Lcom/samples/metro/demo/network/ScreenContextProvider;", "trackingHandler", "Lcom/samples/metro/demo/tracking/TrackingHandler;", "Ldev/zacsweers/metro/internal/ComptimeOnly;", "invoke", "Companion", "metroDemo", "Lkotlin/Deprecated;", "message", "This synthesized declaration should not be used directly", "level", "Lkotlin/DeprecationLevel;", "HIDDEN", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final class MetroFactory implements Factory<DefaultDataSource> {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final Provider<ScreenContextProvider> screenContextProvider;
        private final Provider<TrackingHandler> trackingHandler;

        private MetroFactory(Provider<ScreenContextProvider> provider, Provider<TrackingHandler> provider2) {
            this.screenContextProvider = provider;
            this.trackingHandler = provider2;
        }

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, DefaultConstructorMarker defaultConstructorMarker) {
            this(provider, provider2);
        }

        @JvmStatic
        public static final MetroFactory create(Provider<ScreenContextProvider> provider, Provider<TrackingHandler> provider2) {
            return Companion.create(provider, provider2);
        }

        @JvmStatic
        public static final DefaultDataSource newInstance(ScreenContextProvider screenContextProvider, TrackingHandler trackingHandler) {
            return Companion.newInstance(screenContextProvider, trackingHandler);
        }

        public final DefaultDataSource declarationMirror(ScreenContextProvider screenContextProvider, TrackingHandler trackingHandler) {
            Intrinsics.checkNotNullParameter(screenContextProvider, "screenContextProvider");
            Intrinsics.checkNotNullParameter(trackingHandler, "trackingHandler");
            throw new IllegalStateException("Never called".toString());
        }

        @Override // dev.zacsweers.metro.Provider, kotlin.jvm.functions.Function0
        public final DefaultDataSource invoke() {
            return Companion.newInstance(this.screenContextProvider.invoke(), this.trackingHandler.invoke());
        }

        /* JADX INFO: compiled from: DataSource.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007b\u0002\b\u000bJ\u001c\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007b\u0002\b\u000b¨\u0006\u000e"}, d2 = {"Lcom/samples/metro/demo/network/DefaultDataSource$MetroFactory$Companion;", "", "<init>", "()V", "create", "Lcom/samples/metro/demo/network/DefaultDataSource$MetroFactory;", "screenContextProvider", "Ldev/zacsweers/metro/Provider;", "Lcom/samples/metro/demo/network/ScreenContextProvider;", "trackingHandler", "Lcom/samples/metro/demo/tracking/TrackingHandler;", "Lkotlin/jvm/JvmStatic;", "newInstance", "Lcom/samples/metro/demo/network/DefaultDataSource;", "metroDemo"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final MetroFactory create(Provider<ScreenContextProvider> screenContextProvider, Provider<TrackingHandler> trackingHandler) {
                Intrinsics.checkNotNullParameter(screenContextProvider, "screenContextProvider");
                Intrinsics.checkNotNullParameter(trackingHandler, "trackingHandler");
                return new MetroFactory(screenContextProvider, trackingHandler, null);
            }

            @JvmStatic
            public final DefaultDataSource newInstance(ScreenContextProvider screenContextProvider, TrackingHandler trackingHandler) {
                Intrinsics.checkNotNullParameter(screenContextProvider, "screenContextProvider");
                Intrinsics.checkNotNullParameter(trackingHandler, "trackingHandler");
                return new DefaultDataSource(screenContextProvider, trackingHandler);
            }

            private Companion() {
            }
        }
    }

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

    @Override // com.samples.metro.demo.network.DataSource
    public String getData(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.trackingHandler.handleTracking("network");
        return "hello " + this.screenContextProvider.getApplicableContext();
    }
}
