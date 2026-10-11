package com.samples.interop.dagger.demo.viewmodel;

import com.samples.interop.dagger.demo.network.MainScreenDetailHandler;
import com.samples.interop.dagger.demo.network.ScreenDetailHandler;
import com.samples.interop.dagger.demo.tracking.MainActivityTrackingAdapter;
import com.samples.interop.dagger.demo.tracking.TrackingAdapter;
import dagger.Module;
import dagger.multibindings.StringKey;
import dev.zacsweers.metro.Binds;
import dev.zacsweers.metro.IntoMap;
import dev.zacsweers.metro.IntoSet;
import dev.zacsweers.metro.internal.CallableMetadata;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MainViewModelSubcomponent.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001:\u0001\u000fJ\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'b\u0002\b\u0006b\u0002\b\u0007J&\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\nH'b\u0002\b\u000bb\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000eb\u0002\b\u0007Ê\u0001\u0002\b\u0011\u008a\u0002\b\b\u0012\u0012\u0004\b\u0001\u0012\u0000¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/samples/interop/dagger/demo/viewmodel/MainViewModelTrackingModule;", "", "bindsTrackingAdapter3", "Lcom/samples/interop/dagger/demo/tracking/TrackingAdapter;", "instance", "Lcom/samples/interop/dagger/demo/tracking/MainActivityTrackingAdapter;", "Ldagger/multibindings/IntoSet;", "Ldagger/Binds;", "bindsMainScreenDetailHandler", "Lcom/samples/interop/dagger/demo/network/ScreenDetailHandler;", "Lcom/samples/interop/dagger/demo/network/MainScreenDetailHandler;", "Ldagger/multibindings/IntoMap;", "Ldagger/multibindings/StringKey;", "value", "Main", "BindsMirror", "interopDaggerDemo", "Ldagger/Module;", "dev.zacsweers.metro.compiler"}, k = 1, mv = {2, 4, 0}, xi = 48)
@Module
public interface MainViewModelTrackingModule {

    /* JADX INFO: compiled from: MainViewModelSubcomponent.kt */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007b\u0002\b\bb\u0002\b\tb\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\fb,\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\t\b\u0012\u0012\u0005\b\u0003\u0010\u0088\u0011\u0012\t\b\u0013\u0012\u0005\b\u0003\u0010º\u0012JF\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0016H\u0007b\u0002\b\bb\u0002\b\u0017b,\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0018\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\t\b\u0012\u0012\u0005\b\u0003\u0010ú\u000e\u0012\t\b\u0013\u0012\u0005\b\u0003\u0010\u009e\u0010Ê\u0001\u0018\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\n\b\u001d\u0012\u0006\b\n0\u001e8\u001fÊ\u0001\f\b \u0012\b\b!\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0019"}, d2 = {"Lcom/samples/interop/dagger/demo/viewmodel/MainViewModelTrackingModule$BindsMirror;", "", "<init>", "()V", "bindsMainScreenDetailHandler174261340_intomap", "Lcom/samples/interop/dagger/demo/network/ScreenDetailHandler;", "instance", "Lcom/samples/interop/dagger/demo/network/MainScreenDetailHandler;", "Ldev/zacsweers/metro/Binds;", "Ldev/zacsweers/metro/IntoMap;", "Ldagger/multibindings/StringKey;", "value", "Main", "Ldev/zacsweers/metro/internal/CallableMetadata;", "callableName", "bindsMainScreenDetailHandler", "propertyName", "", "startOffset", "endOffset", "bindsTrackingAdapter3_intoset", "Lcom/samples/interop/dagger/demo/tracking/TrackingAdapter;", "Lcom/samples/interop/dagger/demo/tracking/MainActivityTrackingAdapter;", "Ldev/zacsweers/metro/IntoSet;", "bindsTrackingAdapter3", "interopDaggerDemo", "Lkotlin/Deprecated;", "message", "This synthesized declaration should not be used directly", "level", "Lkotlin/DeprecationLevel;", "HIDDEN", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static abstract class BindsMirror {
        public static final int $stable = 8;

        private BindsMirror() {
        }

        @Binds
        @IntoSet
        @CallableMetadata(callableName = "bindsTrackingAdapter3", endOffset = 1039, propertyName = "", startOffset = 957)
        public final TrackingAdapter bindsTrackingAdapter3_intoset(MainActivityTrackingAdapter instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            throw new IllegalStateException("Never called".toString());
        }

        @StringKey("Main")
        @Binds
        @IntoMap
        @CallableMetadata(callableName = "bindsMainScreenDetailHandler", endOffset = 1181, propertyName = "", startOffset = 1092)
        public final ScreenDetailHandler bindsMainScreenDetailHandler174261340_intomap(MainScreenDetailHandler instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            throw new IllegalStateException("Never called".toString());
        }
    }

    /* JADX INFO: compiled from: MainViewModelSubcomponent.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class DefaultImpls {
        @dagger.Binds
        @dagger.multibindings.IntoSet
        @Deprecated
        public static TrackingAdapter bindsTrackingAdapter3(MainViewModelTrackingModule $this, MainActivityTrackingAdapter instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            return MainViewModelTrackingModule.super.bindsTrackingAdapter3(instance);
        }

        @dagger.Binds
        @StringKey("Main")
        @Deprecated
        @dagger.multibindings.IntoMap
        public static ScreenDetailHandler bindsMainScreenDetailHandler(MainViewModelTrackingModule $this, MainScreenDetailHandler instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            return MainViewModelTrackingModule.super.bindsMainScreenDetailHandler(instance);
        }
    }

    @dagger.Binds
    @dagger.multibindings.IntoSet
    default TrackingAdapter bindsTrackingAdapter3(MainActivityTrackingAdapter instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        throw new IllegalStateException("Never called".toString());
    }

    @dagger.Binds
    @dagger.multibindings.IntoMap
    @StringKey("Main")
    default ScreenDetailHandler bindsMainScreenDetailHandler(MainScreenDetailHandler instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        throw new IllegalStateException("Never called".toString());
    }
}
