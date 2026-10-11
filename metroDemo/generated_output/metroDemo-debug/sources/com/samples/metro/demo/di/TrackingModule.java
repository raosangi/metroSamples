package com.samples.metro.demo.di;

import com.samples.metro.demo.tracking.DefaultTrackingHandler;
import com.samples.metro.demo.tracking.TrackingAdapter;
import com.samples.metro.demo.tracking.TrackingAdapter2;
import com.samples.metro.demo.tracking.TrackingAdapter3;
import com.samples.metro.demo.tracking.TrackingHandler;
import dev.zacsweers.metro.BindingContainer;
import dev.zacsweers.metro.Binds;
import dev.zacsweers.metro.IntoSet;
import dev.zacsweers.metro.internal.CallableMetadata;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TrackingModule.kt */
/* JADX INFO: loaded from: classes8.dex */
@BindingContainer
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001:\u0001\rJ\u0014\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'b\u0002\b\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\tH'b\u0002\b\nb\u0002\b\u0006J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\fH'b\u0002\b\nb\u0002\b\u0006Ê\u0001\u0002\b\u000f\u008a\u0002\b\b\u0010\u0012\u0004\b\u0001\u0012\u0000¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/samples/metro/demo/di/TrackingModule;", "", "bindsTrackingHandler", "Lcom/samples/metro/demo/tracking/TrackingHandler;", "instance", "Lcom/samples/metro/demo/tracking/DefaultTrackingHandler;", "Ldev/zacsweers/metro/Binds;", "bindsTrackingAdapter2", "Lcom/samples/metro/demo/tracking/TrackingAdapter;", "Lcom/samples/metro/demo/tracking/TrackingAdapter2;", "Ldev/zacsweers/metro/IntoSet;", "bindsTrackingAdapter3", "Lcom/samples/metro/demo/tracking/TrackingAdapter3;", "BindsMirror", "metroDemo", "Ldev/zacsweers/metro/BindingContainer;", "dev.zacsweers.metro.compiler"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface TrackingModule {

    /* JADX INFO: compiled from: TrackingModule.kt */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007b\u0002\b\bb\u0002\b\tb,\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\t\b\u000f\u0012\u0005\b\u0003\u0010®\t\u0012\t\b\u0010\u0012\u0005\b\u0003\u0010¼\nJF\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0012H\u0007b\u0002\b\bb\u0002\b\tb,\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0013\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\t\b\u000f\u0012\u0005\b\u0003\u0010ø\n\u0012\t\b\u0010\u0012\u0005\b\u0003\u0010\u0086\fJB\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0016H\u0007b\u0002\b\bb,\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0014\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\t\b\u000f\u0012\u0005\b\u0003\u0010Ü\u0007\u0012\t\b\u0010\u0012\u0005\b\u0003\u0010ò\bÊ\u0001\u0018\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\n\b\u001b\u0012\u0006\b\n0\u001c8\u001dÊ\u0001\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0017"}, d2 = {"Lcom/samples/metro/demo/di/TrackingModule$BindsMirror;", "", "<init>", "()V", "bindsTrackingAdapter2_intoset", "Lcom/samples/metro/demo/tracking/TrackingAdapter;", "instance", "Lcom/samples/metro/demo/tracking/TrackingAdapter2;", "Ldev/zacsweers/metro/Binds;", "Ldev/zacsweers/metro/IntoSet;", "Ldev/zacsweers/metro/internal/CallableMetadata;", "callableName", "bindsTrackingAdapter2", "propertyName", "", "startOffset", "endOffset", "bindsTrackingAdapter3_intoset", "Lcom/samples/metro/demo/tracking/TrackingAdapter3;", "bindsTrackingAdapter3", "bindsTrackingHandler", "Lcom/samples/metro/demo/tracking/TrackingHandler;", "Lcom/samples/metro/demo/tracking/DefaultTrackingHandler;", "metroDemo", "Lkotlin/Deprecated;", "message", "This synthesized declaration should not be used directly", "level", "Lkotlin/DeprecationLevel;", "HIDDEN", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static abstract class BindsMirror {
        public static final int $stable = 8;

        private BindsMirror() {
        }

        @Binds
        @CallableMetadata(callableName = "bindsTrackingHandler", endOffset = 569, propertyName = "", startOffset = 494)
        public final TrackingHandler bindsTrackingHandler(DefaultTrackingHandler instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            throw new IllegalStateException("Never called".toString());
        }

        @Binds
        @IntoSet
        @CallableMetadata(callableName = "bindsTrackingAdapter2", endOffset = 670, propertyName = "", startOffset = 599)
        public final TrackingAdapter bindsTrackingAdapter2_intoset(TrackingAdapter2 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            throw new IllegalStateException("Never called".toString());
        }

        @Binds
        @IntoSet
        @CallableMetadata(callableName = "bindsTrackingAdapter3", endOffset = 771, propertyName = "", startOffset = 700)
        public final TrackingAdapter bindsTrackingAdapter3_intoset(TrackingAdapter3 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            throw new IllegalStateException("Never called".toString());
        }
    }

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

    @Binds
    @IntoSet
    default TrackingAdapter bindsTrackingAdapter3(TrackingAdapter3 instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        throw new IllegalStateException("Never called".toString());
    }
}
