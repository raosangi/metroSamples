package com.samples.metro.demo.di;

import com.samples.metro.demo.network.AppScreenDetailHandler;
import com.samples.metro.demo.network.DataSource;
import com.samples.metro.demo.network.DefaultDataSource;
import com.samples.metro.demo.network.ScreenDetailHandler;
import dev.zacsweers.metro.BindingContainer;
import dev.zacsweers.metro.Binds;
import dev.zacsweers.metro.IntoMap;
import dev.zacsweers.metro.StringKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DataSourceModule.kt */
/* JADX INFO: loaded from: classes8.dex */
@BindingContainer
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'b\u0002\b\u0006J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\tH'b\u0002\b\nb\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\rb\u0002\b\u0006Ê\u0001\u0002\b\u000f\u008a\u0002\b\b\u0010\u0012\u0004\b\u0001\u0012\u0000¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/samples/metro/demo/di/DataSourceModule;", "", "bindsDefaultDataSource", "Lcom/samples/metro/demo/network/DataSource;", "instance", "Lcom/samples/metro/demo/network/DefaultDataSource;", "Ldev/zacsweers/metro/Binds;", "bindsAppScreenDetailHandler", "Lcom/samples/metro/demo/network/ScreenDetailHandler;", "Lcom/samples/metro/demo/network/AppScreenDetailHandler;", "Ldev/zacsweers/metro/IntoMap;", "Ldev/zacsweers/metro/StringKey;", "value", "App", "metroDemo", "Ldev/zacsweers/metro/BindingContainer;", "dev.zacsweers.metro.compiler"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface DataSourceModule {

    /* JADX INFO: compiled from: DataSourceModule.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class DefaultImpls {
        @Binds
        @Deprecated
        public static DataSource bindsDefaultDataSource(DataSourceModule $this, DefaultDataSource instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            return DataSourceModule.super.bindsDefaultDataSource(instance);
        }

        @StringKey("App")
        @Binds
        @Deprecated
        @IntoMap
        public static ScreenDetailHandler bindsAppScreenDetailHandler(DataSourceModule $this, AppScreenDetailHandler instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            return DataSourceModule.super.bindsAppScreenDetailHandler(instance);
        }
    }

    @Binds
    default DataSource bindsDefaultDataSource(DefaultDataSource instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        throw new IllegalStateException("Never called".toString());
    }

    @StringKey("App")
    @Binds
    @IntoMap
    default ScreenDetailHandler bindsAppScreenDetailHandler(AppScreenDetailHandler instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        throw new IllegalStateException("Never called".toString());
    }
}
