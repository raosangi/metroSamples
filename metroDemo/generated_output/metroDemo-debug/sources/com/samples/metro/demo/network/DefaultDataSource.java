package com.samples.metro.demo.network;

import dev.zacsweers.metro.Inject;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.Factory;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DataSource.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB'\b\u0007\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003\u001a\u0002\b\t¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0016R#\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0000\u008a\u0002\u0016\b\u0012\u0012\u0012\b\u0001\u001a\u000e\n\fMetroFactory¨\u0006\u000f"}, d2 = {"Lcom/samples/metro/demo/network/DefaultDataSource;", "Lcom/samples/metro/demo/network/DataSource;", "screenContextProviderMap", "", "", "Lkotlin/Function0;", "Lcom/samples/metro/demo/network/ScreenDetailHandler;", "<init>", "(Ljava/util/Map;)V", "Ldev/zacsweers/metro/Inject;", "getScreenContextProviderMap", "()Ljava/util/Map;", "getData", "key", "MetroFactory", "metroDemo", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters", "dev.zacsweers.metro.compiler"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class DefaultDataSource implements DataSource {
    public static final int $stable = 8;
    private final Map<String, Function0<ScreenDetailHandler>> screenContextProviderMap;

    /* JADX INFO: compiled from: DataSource.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bJ&\u0010\u0002\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005H\u0007b\u0002\b\tJ\b\u0010\n\u001a\u00020\u0003H\u0007Ê\u0001\u0018\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\n\b\u0010\u0012\u0006\b\n0\u00118\u0012Ê\u0001\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0000¨\u0006\f"}, d2 = {"Lcom/samples/metro/demo/network/DefaultDataSource$MetroFactory;", "", "declarationMirror", "Lcom/samples/metro/demo/network/DefaultDataSource;", "screenContextProviderMap", "", "", "Lkotlin/Function0;", "Lcom/samples/metro/demo/network/ScreenDetailHandler;", "Ldev/zacsweers/metro/internal/ComptimeOnly;", "invoke", "Companion", "metroDemo", "Lkotlin/Deprecated;", "message", "This synthesized declaration should not be used directly", "level", "Lkotlin/DeprecationLevel;", "HIDDEN", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final class MetroFactory implements Factory<DefaultDataSource> {
        private final Provider<Map<String, Function0<ScreenDetailHandler>>> screenContextProviderMap;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        private MetroFactory(Provider<Map<String, Function0<ScreenDetailHandler>>> provider) {
            this.screenContextProviderMap = provider;
        }

        public /* synthetic */ MetroFactory(Provider provider, DefaultConstructorMarker defaultConstructorMarker) {
            this(provider);
        }

        @JvmStatic
        public static final MetroFactory create(Provider<Map<String, Function0<ScreenDetailHandler>>> provider) {
            return Companion.create(provider);
        }

        @JvmStatic
        public static final DefaultDataSource newInstance(Map<String, ? extends Function0<? extends ScreenDetailHandler>> map) {
            return Companion.newInstance(map);
        }

        public final DefaultDataSource declarationMirror(Map<String, ? extends Function0<? extends ScreenDetailHandler>> screenContextProviderMap) {
            Intrinsics.checkNotNullParameter(screenContextProviderMap, "screenContextProviderMap");
            throw new IllegalStateException("Never called".toString());
        }

        @Override // dev.zacsweers.metro.Provider, kotlin.jvm.functions.Function0
        public final DefaultDataSource invoke() {
            return Companion.newInstance(this.screenContextProviderMap.invoke());
        }

        /* JADX INFO: compiled from: DataSource.kt */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u00052\u001e\u0010\u0006\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b0\u0007H\u0007b\u0002\b\fJ&\u0010\r\u001a\u00020\u000e2\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bH\u0007b\u0002\b\f¨\u0006\u000f"}, d2 = {"Lcom/samples/metro/demo/network/DefaultDataSource$MetroFactory$Companion;", "", "<init>", "()V", "create", "Lcom/samples/metro/demo/network/DefaultDataSource$MetroFactory;", "screenContextProviderMap", "Ldev/zacsweers/metro/Provider;", "", "", "Lkotlin/Function0;", "Lcom/samples/metro/demo/network/ScreenDetailHandler;", "Lkotlin/jvm/JvmStatic;", "newInstance", "Lcom/samples/metro/demo/network/DefaultDataSource;", "metroDemo"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final MetroFactory create(Provider<Map<String, Function0<ScreenDetailHandler>>> screenContextProviderMap) {
                Intrinsics.checkNotNullParameter(screenContextProviderMap, "screenContextProviderMap");
                return new MetroFactory(screenContextProviderMap, null);
            }

            @JvmStatic
            public final DefaultDataSource newInstance(Map<String, ? extends Function0<? extends ScreenDetailHandler>> screenContextProviderMap) {
                Intrinsics.checkNotNullParameter(screenContextProviderMap, "screenContextProviderMap");
                return new DefaultDataSource(screenContextProviderMap);
            }

            private Companion() {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public DefaultDataSource(Map<String, ? extends Function0<? extends ScreenDetailHandler>> screenContextProviderMap) {
        Intrinsics.checkNotNullParameter(screenContextProviderMap, "screenContextProviderMap");
        this.screenContextProviderMap = screenContextProviderMap;
    }

    public final Map<String, Function0<ScreenDetailHandler>> getScreenContextProviderMap() {
        return this.screenContextProviderMap;
    }

    @Override // com.samples.metro.demo.network.DataSource
    public String getData(String key) {
        String context;
        ScreenDetailHandler screenDetailHandlerInvoke;
        Intrinsics.checkNotNullParameter(key, "key");
        Function0<ScreenDetailHandler> function0 = this.screenContextProviderMap.get(key);
        if (function0 == null || (screenDetailHandlerInvoke = function0.invoke()) == null || (context = screenDetailHandlerInvoke.getScreenContext()) == null) {
            context = "UNKNOWN";
        }
        return "hello " + context;
    }
}
