package com.samples.interop.dagger.demo.di;

import com.samples.interop.dagger.demo.network.AppScreenDetailHandler;
import com.samples.interop.dagger.demo.network.DataSource;
import com.samples.interop.dagger.demo.network.DefaultDataSource;
import com.samples.interop.dagger.demo.network.DefaultDummyUnused;
import com.samples.interop.dagger.demo.network.DummyUnused;
import com.samples.interop.dagger.demo.network.ScreenDetailHandler;
import dagger.Module;
import dagger.multibindings.StringKey;
import dev.zacsweers.metro.Binds;
import dev.zacsweers.metro.IntoMap;
import dev.zacsweers.metro.internal.CallableMetadata;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DataSourceModule.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001:\u0001\u0011J\u0014\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'b\u0002\b\u0006J\u0014\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\tH'b\u0002\b\u0006J&\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\fH'b\u0002\b\rb\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010b\u0002\b\u0006Ê\u0001\u0002\b\u0013\u008a\u0002\b\b\u0014\u0012\u0004\b\u0001\u0012\u0000¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/samples/interop/dagger/demo/di/DataSourceModule;", "", "bindsDefaultDataSource", "Lcom/samples/interop/dagger/demo/network/DataSource;", "instance", "Lcom/samples/interop/dagger/demo/network/DefaultDataSource;", "Ldagger/Binds;", "bindsDummyUnused", "Lcom/samples/interop/dagger/demo/network/DummyUnused;", "Lcom/samples/interop/dagger/demo/network/DefaultDummyUnused;", "bindsAppScreenDetailHandler", "Lcom/samples/interop/dagger/demo/network/ScreenDetailHandler;", "Lcom/samples/interop/dagger/demo/network/AppScreenDetailHandler;", "Ldagger/multibindings/IntoMap;", "Ldagger/multibindings/StringKey;", "value", "App", "BindsMirror", "interopDaggerDemo", "Ldagger/Module;", "dev.zacsweers.metro.compiler"}, k = 1, mv = {2, 4, 0}, xi = 48)
@Module
public interface DataSourceModule {

    /* JADX INFO: compiled from: DataSourceModule.kt */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007b\u0002\b\bb\u0002\b\tb\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\fb,\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\t\b\u0012\u0012\u0005\b\u0003\u0010¼\f\u0012\t\b\u0013\u0012\u0005\b\u0003\u0010ê\rJB\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0016H\u0007b\u0002\b\bb,\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0014\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\t\b\u0012\u0012\u0005\b\u0003\u0010®\t\u0012\t\b\u0013\u0012\u0005\b\u0003\u0010´\nJB\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u0019H\u0007b\u0002\b\bb,\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0017\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\t\b\u0012\u0012\u0005\b\u0003\u0010Ö\n\u0012\t\b\u0013\u0012\u0005\b\u0003\u0010Ô\u000bÊ\u0001\u0018\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\n\b\u001e\u0012\u0006\b\n0\u001f8 Ê\u0001\f\b!\u0012\b\b\"\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001a"}, d2 = {"Lcom/samples/interop/dagger/demo/di/DataSourceModule$BindsMirror;", "", "<init>", "()V", "bindsAppScreenDetailHandler102203700_intomap", "Lcom/samples/interop/dagger/demo/network/ScreenDetailHandler;", "instance", "Lcom/samples/interop/dagger/demo/network/AppScreenDetailHandler;", "Ldev/zacsweers/metro/Binds;", "Ldev/zacsweers/metro/IntoMap;", "Ldagger/multibindings/StringKey;", "value", "App", "Ldev/zacsweers/metro/internal/CallableMetadata;", "callableName", "bindsAppScreenDetailHandler", "propertyName", "", "startOffset", "endOffset", "bindsDefaultDataSource", "Lcom/samples/interop/dagger/demo/network/DataSource;", "Lcom/samples/interop/dagger/demo/network/DefaultDataSource;", "bindsDummyUnused", "Lcom/samples/interop/dagger/demo/network/DummyUnused;", "Lcom/samples/interop/dagger/demo/network/DefaultDummyUnused;", "interopDaggerDemo", "Lkotlin/Deprecated;", "message", "This synthesized declaration should not be used directly", "level", "Lkotlin/DeprecationLevel;", "HIDDEN", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static abstract class BindsMirror {
        public static final int $stable = 8;

        private BindsMirror() {
        }

        @Binds
        @CallableMetadata(callableName = "bindsDefaultDataSource", endOffset = 666, propertyName = "", startOffset = 599)
        public final DataSource bindsDefaultDataSource(DefaultDataSource instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            throw new IllegalStateException("Never called".toString());
        }

        @Binds
        @CallableMetadata(callableName = "bindsDummyUnused", endOffset = 746, propertyName = "", startOffset = 683)
        public final DummyUnused bindsDummyUnused(DefaultDummyUnused instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            throw new IllegalStateException("Never called".toString());
        }

        @StringKey("App")
        @Binds
        @IntoMap
        @CallableMetadata(callableName = "bindsAppScreenDetailHandler", endOffset = 885, propertyName = "", startOffset = 798)
        public final ScreenDetailHandler bindsAppScreenDetailHandler102203700_intomap(AppScreenDetailHandler instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            throw new IllegalStateException("Never called".toString());
        }
    }

    /* JADX INFO: compiled from: DataSourceModule.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class DefaultImpls {
        @dagger.Binds
        @Deprecated
        public static DataSource bindsDefaultDataSource(DataSourceModule $this, DefaultDataSource instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            return DataSourceModule.super.bindsDefaultDataSource(instance);
        }

        @dagger.Binds
        @Deprecated
        public static DummyUnused bindsDummyUnused(DataSourceModule $this, DefaultDummyUnused instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            return DataSourceModule.super.bindsDummyUnused(instance);
        }

        @dagger.Binds
        @StringKey("App")
        @Deprecated
        @dagger.multibindings.IntoMap
        public static ScreenDetailHandler bindsAppScreenDetailHandler(DataSourceModule $this, AppScreenDetailHandler instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            return DataSourceModule.super.bindsAppScreenDetailHandler(instance);
        }
    }

    @dagger.Binds
    default DataSource bindsDefaultDataSource(DefaultDataSource instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        throw new IllegalStateException("Never called".toString());
    }

    @dagger.Binds
    default DummyUnused bindsDummyUnused(DefaultDummyUnused instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        throw new IllegalStateException("Never called".toString());
    }

    @dagger.Binds
    @dagger.multibindings.IntoMap
    @StringKey("App")
    default ScreenDetailHandler bindsAppScreenDetailHandler(AppScreenDetailHandler instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        throw new IllegalStateException("Never called".toString());
    }
}
