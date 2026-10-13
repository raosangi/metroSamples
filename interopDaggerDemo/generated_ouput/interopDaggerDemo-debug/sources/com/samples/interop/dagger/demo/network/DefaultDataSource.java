package com.samples.interop.dagger.demo.network;

import dev.zacsweers.metro.internal.Factory;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DataSource.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB'\b\u0007\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003\u001a\u0002\b\t¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0016R#\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0000\u008a\u0002\u0016\b\u0012\u0012\u0012\b\u0001\u001a\u000e\n\fMetroFactory¨\u0006\u000f"}, d2 = {"Lcom/samples/interop/dagger/demo/network/DefaultDataSource;", "Lcom/samples/interop/dagger/demo/network/DataSource;", "screenContextProviderMap", "", "", "Ljavax/inject/Provider;", "Lcom/samples/interop/dagger/demo/network/ScreenDetailHandler;", "<init>", "(Ljava/util/Map;)V", "Ljavax/inject/Inject;", "getScreenContextProviderMap", "()Ljava/util/Map;", "getData", "key", "MetroFactory", "interopDaggerDemo", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters", "dev.zacsweers.metro.compiler"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class DefaultDataSource implements DataSource {
    public static final int $stable = 8;
    private final Map<String, Provider<ScreenDetailHandler>> screenContextProviderMap;

    /* JADX INFO: compiled from: DataSource.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bJ&\u0010\u0002\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005H\u0007b\u0002\b\tJ\b\u0010\n\u001a\u00020\u0003H\u0007Ê\u0001\u0018\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\n\b\u0010\u0012\u0006\b\n0\u00118\u0012Ê\u0001\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0000¨\u0006\f"}, d2 = {"Lcom/samples/interop/dagger/demo/network/DefaultDataSource$MetroFactory;", "", "declarationMirror", "Lcom/samples/interop/dagger/demo/network/DefaultDataSource;", "screenContextProviderMap", "", "", "Ljavax/inject/Provider;", "Lcom/samples/interop/dagger/demo/network/ScreenDetailHandler;", "Ldev/zacsweers/metro/internal/ComptimeOnly;", "invoke", "Companion", "interopDaggerDemo", "Lkotlin/Deprecated;", "message", "This synthesized declaration should not be used directly", "level", "Lkotlin/DeprecationLevel;", "HIDDEN", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final class MetroFactory implements Factory<DefaultDataSource> {
        private final dev.zacsweers.metro.Provider<Map<String, Provider<ScreenDetailHandler>>> screenContextProviderMap;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        private MetroFactory(dev.zacsweers.metro.Provider<Map<String, Provider<ScreenDetailHandler>>> provider) {
            this.screenContextProviderMap = provider;
        }

        public /* synthetic */ MetroFactory(dev.zacsweers.metro.Provider provider, DefaultConstructorMarker defaultConstructorMarker) {
            this(provider);
        }

        @JvmStatic
        public static final MetroFactory create(dev.zacsweers.metro.Provider<Map<String, Provider<ScreenDetailHandler>>> provider) {
            return Companion.create(provider);
        }

        @JvmStatic
        public static final DefaultDataSource newInstance(Map<String, ? extends Provider<ScreenDetailHandler>> map) {
            return Companion.newInstance(map);
        }

        public final DefaultDataSource declarationMirror(Map<String, ? extends Provider<ScreenDetailHandler>> screenContextProviderMap) {
            Intrinsics.checkNotNullParameter(screenContextProviderMap, "screenContextProviderMap");
            throw new IllegalStateException("Never called".toString());
        }

        @Override // dev.zacsweers.metro.Provider, kotlin.jvm.functions.Function0
        public final DefaultDataSource invoke() {
            return Companion.newInstance(this.screenContextProviderMap.invoke());
        }

        /* JADX INFO: compiled from: DataSource.kt */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u00052\u001e\u0010\u0006\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b0\u0007H\u0007b\u0002\b\fJ&\u0010\r\u001a\u00020\u000e2\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bH\u0007b\u0002\b\f¨\u0006\u000f"}, d2 = {"Lcom/samples/interop/dagger/demo/network/DefaultDataSource$MetroFactory$Companion;", "", "<init>", "()V", "create", "Lcom/samples/interop/dagger/demo/network/DefaultDataSource$MetroFactory;", "screenContextProviderMap", "Ldev/zacsweers/metro/Provider;", "", "", "Ljavax/inject/Provider;", "Lcom/samples/interop/dagger/demo/network/ScreenDetailHandler;", "Lkotlin/jvm/JvmStatic;", "newInstance", "Lcom/samples/interop/dagger/demo/network/DefaultDataSource;", "interopDaggerDemo"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final MetroFactory create(dev.zacsweers.metro.Provider<Map<String, Provider<ScreenDetailHandler>>> screenContextProviderMap) {
                Intrinsics.checkNotNullParameter(screenContextProviderMap, "screenContextProviderMap");
                return new MetroFactory(screenContextProviderMap, null);
            }

            @JvmStatic
            public final DefaultDataSource newInstance(Map<String, ? extends Provider<ScreenDetailHandler>> screenContextProviderMap) {
                Intrinsics.checkNotNullParameter(screenContextProviderMap, "screenContextProviderMap");
                return new DefaultDataSource(screenContextProviderMap);
            }

            private Companion() {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public DefaultDataSource(Map<String, ? extends Provider<ScreenDetailHandler>> screenContextProviderMap) {
        Intrinsics.checkNotNullParameter(screenContextProviderMap, "screenContextProviderMap");
        this.screenContextProviderMap = screenContextProviderMap;
    }

    public final Map<String, Provider<ScreenDetailHandler>> getScreenContextProviderMap() {
        return this.screenContextProviderMap;
    }

    @Override // com.samples.interop.dagger.demo.network.DataSource
    public String getData(String key) {
        String context;
        ScreenDetailHandler screenDetailHandler;
        Intrinsics.checkNotNullParameter(key, "key");
        Provider<ScreenDetailHandler> provider = this.screenContextProviderMap.get(key);
        if (provider == null || (screenDetailHandler = provider.get()) == null || (context = screenDetailHandler.getScreenContext()) == null) {
            context = "UNKNOWN";
        }
        return "hello " + context;
    }
}
