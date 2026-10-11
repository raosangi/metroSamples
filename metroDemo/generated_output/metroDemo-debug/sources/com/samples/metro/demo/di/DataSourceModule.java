package com.samples.metro.demo.di;

import com.samples.metro.demo.network.AppScreenDetailHandler;
import com.samples.metro.demo.network.DataSource;
import com.samples.metro.demo.network.DefaultDataSource;
import com.samples.metro.demo.network.ScreenDetailHandler;
import dev.zacsweers.metro.BindingContainer;
import dev.zacsweers.metro.Binds;
import dev.zacsweers.metro.IntoMap;
import dev.zacsweers.metro.StringKey;
import dev.zacsweers.metro.internal.CallableMetadata;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DataSourceModule.kt */
/* JADX INFO: loaded from: classes8.dex */
@BindingContainer
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001:\u0001\u000eJ\u0014\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'b\u0002\b\u0006J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\tH'b\u0002\b\nb\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\rb\u0002\b\u0006Ê\u0001\u0002\b\u0010\u008a\u0002\b\b\u0011\u0012\u0004\b\u0001\u0012\u0000¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/samples/metro/demo/di/DataSourceModule;", "", "bindsDefaultDataSource", "Lcom/samples/metro/demo/network/DataSource;", "instance", "Lcom/samples/metro/demo/network/DefaultDataSource;", "Ldev/zacsweers/metro/Binds;", "bindsAppScreenDetailHandler", "Lcom/samples/metro/demo/network/ScreenDetailHandler;", "Lcom/samples/metro/demo/network/AppScreenDetailHandler;", "Ldev/zacsweers/metro/IntoMap;", "Ldev/zacsweers/metro/StringKey;", "value", "App", "BindsMirror", "metroDemo", "Ldev/zacsweers/metro/BindingContainer;", "dev.zacsweers.metro.compiler"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface DataSourceModule {

    /* JADX INFO: compiled from: DataSourceModule.kt */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007b\u0002\b\bb\u0002\b\tb\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\fb,\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\t\b\u0012\u0012\u0005\b\u0003\u0010 \t\u0012\t\b\u0013\u0012\u0005\b\u0003\u0010Î\nJB\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0016H\u0007b\u0002\b\bb,\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0014\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\t\b\u0012\u0012\u0005\b\u0003\u0010²\u0007\u0012\t\b\u0013\u0012\u0005\b\u0003\u0010¸\bÊ\u0001\u0018\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\n\b\u001b\u0012\u0006\b\n0\u001c8\u001dÊ\u0001\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0017"}, d2 = {"Lcom/samples/metro/demo/di/DataSourceModule$BindsMirror;", "", "<init>", "()V", "bindsAppScreenDetailHandler285829861_intomap", "Lcom/samples/metro/demo/network/ScreenDetailHandler;", "instance", "Lcom/samples/metro/demo/network/AppScreenDetailHandler;", "Ldev/zacsweers/metro/Binds;", "Ldev/zacsweers/metro/IntoMap;", "Ldev/zacsweers/metro/StringKey;", "value", "App", "Ldev/zacsweers/metro/internal/CallableMetadata;", "callableName", "bindsAppScreenDetailHandler", "propertyName", "", "startOffset", "endOffset", "bindsDefaultDataSource", "Lcom/samples/metro/demo/network/DataSource;", "Lcom/samples/metro/demo/network/DefaultDataSource;", "metroDemo", "Lkotlin/Deprecated;", "message", "This synthesized declaration should not be used directly", "level", "Lkotlin/DeprecationLevel;", "HIDDEN", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static abstract class BindsMirror {
        public static final int $stable = 8;

        private BindsMirror() {
        }

        @Binds
        @CallableMetadata(callableName = "bindsDefaultDataSource", endOffset = 540, propertyName = "", startOffset = 473)
        public final DataSource bindsDefaultDataSource(DefaultDataSource instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            throw new IllegalStateException("Never called".toString());
        }

        @StringKey("App")
        @Binds
        @IntoMap
        @CallableMetadata(callableName = "bindsAppScreenDetailHandler", endOffset = 679, propertyName = "", startOffset = 592)
        public final ScreenDetailHandler bindsAppScreenDetailHandler285829861_intomap(AppScreenDetailHandler instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            throw new IllegalStateException("Never called".toString());
        }
    }

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
