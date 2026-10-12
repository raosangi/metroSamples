package com.samples.metro.demo.di;

import com.samples.metro.demo.tracking.DefaultTrackingHandler;
import com.samples.metro.demo.tracking.TrackingAdapter;
import com.samples.metro.demo.tracking.TrackingAdapter2;
import com.samples.metro.demo.tracking.TrackingAdapter3;
import com.samples.metro.demo.tracking.TrackingHandler;
import dev.zacsweers.metro.BindingContainer;
import dev.zacsweers.metro.Binds;
import dev.zacsweers.metro.ClassKey;
import dev.zacsweers.metro.IntoMap;
import dev.zacsweers.metro.IntoSet;
import dev.zacsweers.metro.Provides;
import dev.zacsweers.metro.internal.CallableMetadata;
import dev.zacsweers.metro.internal.Factory;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TrackingModule.kt */
/* JADX INFO: loaded from: classes8.dex */
@BindingContainer
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u0000 \r2\u00020\u0001:\u0001\rJ\u0014\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'b\u0002\b\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\tH'b\u0002\b\nb\u0002\b\u0006J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\fH'b\u0002\b\nb\u0002\b\u0006Ê\u0001\u0002\b\u000f\u008a\u0002\u0098\u0001\b\u0010\u0012\u0093\u0001\b\u0001\u0012\u008e\u0001\u0012\u008b\u0001\nPcom/samples/metro/demo/di/TrackingModule.Companion.ProvidesStringTagMetroFactory\u0018\u0001\"\u0011providesStringTag2\u0011providesStringTag:\u000f\n\r2\u000bTrackingTag¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/samples/metro/demo/di/TrackingModule;", "", "bindsTrackingHandler", "Lcom/samples/metro/demo/tracking/TrackingHandler;", "instance", "Lcom/samples/metro/demo/tracking/DefaultTrackingHandler;", "Ldev/zacsweers/metro/Binds;", "bindsTrackingAdapter2", "Lcom/samples/metro/demo/tracking/TrackingAdapter;", "Lcom/samples/metro/demo/tracking/TrackingAdapter2;", "Ldev/zacsweers/metro/IntoSet;", "bindsTrackingAdapter3", "Lcom/samples/metro/demo/tracking/TrackingAdapter3;", "Companion", "metroDemo", "Ldev/zacsweers/metro/BindingContainer;", "dev.zacsweers.metro.compiler"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface TrackingModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: TrackingModule.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class DefaultImpls {
        @Binds
        @Deprecated
        public static TrackingHandler bindsTrackingHandler(TrackingModule $this, DefaultTrackingHandler instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            return TrackingModule.super.bindsTrackingHandler(instance);
        }

        @Binds
        @IntoSet
        @Deprecated
        public static TrackingAdapter bindsTrackingAdapter2(TrackingModule $this, TrackingAdapter2 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            return TrackingModule.super.bindsTrackingAdapter2(instance);
        }

        @Binds
        @IntoSet
        @Deprecated
        public static TrackingAdapter bindsTrackingAdapter3(TrackingModule $this, TrackingAdapter3 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            return TrackingModule.super.bindsTrackingAdapter3(instance);
        }
    }

    @Binds
    default TrackingHandler bindsTrackingHandler(DefaultTrackingHandler instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        throw new IllegalStateException("Never called".toString());
    }

    @Binds
    @IntoSet
    default TrackingAdapter bindsTrackingAdapter2(TrackingAdapter2 instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        throw new IllegalStateException("Never called".toString());
    }

    /* JADX INFO: compiled from: TrackingModule.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u0001H\u0007b\u0002\b\u0005b\u0002\b\u0006b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u008a\u0002\u0098\u0001\b\f\u0012\u0093\u0001\b\u0001\u0012\u008e\u0001\u0012\u008b\u0001\nPcom/samples/metro/demo/di/TrackingModule.Companion.ProvidesStringTagMetroFactory\u0018\u0001\"\u0011providesStringTag2\u0011providesStringTag:\u000f\n\r2\u000bTrackingTag¨\u0006\u000b"}, d2 = {"Lcom/samples/metro/demo/di/TrackingModule$Companion;", "", "<init>", "()V", "providesStringTag", "Ldev/zacsweers/metro/Provides;", "Ldev/zacsweers/metro/IntoMap;", "Ldev/zacsweers/metro/ClassKey;", "value", "", "ProvidesStringTagMetroFactory", "metroDemo", "dev.zacsweers.metro.compiler"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX INFO: compiled from: TrackingModule.kt */
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\u00020\u0000H\u0007b\u0002\b\u0005J\u001e\u0010\u0006\u001a\u00020\u0001H\u0007b\u0002\b\u0007b\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nb\u0002\b\u000bJ\b\u0010\f\u001a\u00020\u0001H\u0007J\f\u0010\r\u001a\u00020\u0001H\u0007b\u0002\b\u0005Ê\u0001\u0018\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\n\b\u0012\u0012\u0006\b\n0\u00138\u0014Ê\u00016\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\r\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\t\b\u0019\u0012\u0005\b\u0003\u0010\u009e\u000e\u0012\t\b\u001a\u0012\u0005\b\u0003\u0010þ\u000f\u0012\b\b\u001b\u0012\u0004\b\b(\rÊ\u0001\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/samples/metro/demo/di/TrackingModule$Companion$ProvidesStringTagMetroFactory;", "", "<init>", "()V", "create", "Lkotlin/jvm/JvmStatic;", "declarationMirror", "Ldev/zacsweers/metro/IntoMap;", "Ldev/zacsweers/metro/ClassKey;", "value", "", "Ldev/zacsweers/metro/internal/ComptimeOnly;", "invoke", "providesStringTag", "metroDemo", "Lkotlin/Deprecated;", "message", "This synthesized declaration should not be used directly", "level", "Lkotlin/DeprecationLevel;", "HIDDEN", "Ldev/zacsweers/metro/internal/CallableMetadata;", "callableName", "propertyName", "", "startOffset", "endOffset", "newInstanceName", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        @CallableMetadata(callableName = "providesStringTag", endOffset = 1023, newInstanceName = "providesStringTag", propertyName = "", startOffset = 911)
        public static final class ProvidesStringTagMetroFactory implements Factory<Object> {
            public static final int $stable = 0;
            public static final ProvidesStringTagMetroFactory INSTANCE = new ProvidesStringTagMetroFactory();

            @JvmStatic
            public static final ProvidesStringTagMetroFactory create() {
                return INSTANCE;
            }

            @JvmStatic
            public static final Object providesStringTag() {
                return Companion.$$INSTANCE.providesStringTag();
            }

            @ClassKey(String.class)
            @IntoMap
            public final Object declarationMirror() {
                throw new IllegalStateException("Never called".toString());
            }

            @Override // dev.zacsweers.metro.Provider, kotlin.jvm.functions.Function0
            public final Object invoke() {
                return providesStringTag();
            }

            private ProvidesStringTagMetroFactory() {
            }
        }

        private Companion() {
        }

        @Provides
        @ClassKey(String.class)
        @IntoMap
        public final Object providesStringTag() {
            return "TrackingTag";
        }
    }

    @Binds
    @IntoSet
    default TrackingAdapter bindsTrackingAdapter3(TrackingAdapter3 instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        throw new IllegalStateException("Never called".toString());
    }
}
