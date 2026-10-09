package com.samples.dagger.demo.network;

import java.util.Map;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DataSource.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B,\b\u0007\u0012\u001d\u0010\u0002\u001a\u0019\u0012\u0004\u0012\u00020\u0004\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00070\u0003\u001a\u0002\b\n¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0016R(\u0010\u0002\u001a\u0019\u0012\u0004\u0012\u00020\u0004\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00070\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u000f"}, d2 = {"Lcom/samples/dagger/demo/network/DefaultDataSource;", "Lcom/samples/dagger/demo/network/DataSource;", "screenContextProviderMap", "", "", "Ljavax/inject/Provider;", "Lcom/samples/dagger/demo/network/ScreenDetailHandler;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "(Ljava/util/Map;)V", "Ljavax/inject/Inject;", "getScreenContextProviderMap", "()Ljava/util/Map;", "getData", "key", "daggerDemo", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class DefaultDataSource implements DataSource {
    public static final int $stable = 8;
    private final Map<String, Provider<ScreenDetailHandler>> screenContextProviderMap;

    @Inject
    public DefaultDataSource(Map<String, Provider<ScreenDetailHandler>> screenContextProviderMap) {
        Intrinsics.checkNotNullParameter(screenContextProviderMap, "screenContextProviderMap");
        this.screenContextProviderMap = screenContextProviderMap;
    }

    public final Map<String, Provider<ScreenDetailHandler>> getScreenContextProviderMap() {
        return this.screenContextProviderMap;
    }

    @Override // com.samples.dagger.demo.network.DataSource
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
