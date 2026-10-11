package com.samples.interop.dagger.demo.di;

import com.samples.interop.dagger.demo.network.AppScreenDetailHandler;
import com.samples.interop.dagger.demo.network.DataSource;
import com.samples.interop.dagger.demo.network.DefaultDataSource;
import com.samples.interop.dagger.demo.network.ScreenDetailHandler;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DataSourceModule.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'b\u0002\b\u0006J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\tH'b\u0002\b\nb\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\rb\u0002\b\u0006Ê\u0001\u0002\b\u000f\u008a\u0002\b\b\u0010\u0012\u0004\b\u0001\u0012\u0000¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/samples/interop/dagger/demo/di/DataSourceModule;", "", "bindsDefaultDataSource", "Lcom/samples/interop/dagger/demo/network/DataSource;", "instance", "Lcom/samples/interop/dagger/demo/network/DefaultDataSource;", "Ldagger/Binds;", "bindsAppScreenDetailHandler", "Lcom/samples/interop/dagger/demo/network/ScreenDetailHandler;", "Lcom/samples/interop/dagger/demo/network/AppScreenDetailHandler;", "Ldagger/multibindings/IntoMap;", "Ldagger/multibindings/StringKey;", "value", "App", "interopDaggerDemo", "Ldagger/Module;", "dev.zacsweers.metro.compiler"}, k = 1, mv = {2, 4, 0}, xi = 48)
@Module
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

        @Binds
        @StringKey("App")
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

    @Binds
    @IntoMap
    @StringKey("App")
    default ScreenDetailHandler bindsAppScreenDetailHandler(AppScreenDetailHandler instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        throw new IllegalStateException("Never called".toString());
    }
}
