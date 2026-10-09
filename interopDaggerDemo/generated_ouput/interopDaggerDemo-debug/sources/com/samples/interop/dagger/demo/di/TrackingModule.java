package com.samples.interop.dagger.demo.di;

import com.samples.interop.dagger.demo.tracking.DefaultTrackingHandler;
import com.samples.interop.dagger.demo.tracking.TrackingAdapter;
import com.samples.interop.dagger.demo.tracking.TrackingAdapter2;
import com.samples.interop.dagger.demo.tracking.TrackingAdapter3;
import com.samples.interop.dagger.demo.tracking.TrackingHandler;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TrackingModule.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'b\u0002\b\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\tH'b\u0002\b\nb\u0002\b\u0006J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\fH'b\u0002\b\nb\u0002\b\u0006Ê\u0001\u0002\b\u000e\u008a\u0002\b\b\u000f\u0012\u0004\b\u0001\u0012\u0000¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/samples/interop/dagger/demo/di/TrackingModule;", "", "bindsTrackingHandler", "Lcom/samples/interop/dagger/demo/tracking/TrackingHandler;", "instance", "Lcom/samples/interop/dagger/demo/tracking/DefaultTrackingHandler;", "Ldagger/Binds;", "bindsTrackingAdapter2", "Lcom/samples/interop/dagger/demo/tracking/TrackingAdapter;", "Lcom/samples/interop/dagger/demo/tracking/TrackingAdapter2;", "Ldagger/multibindings/IntoSet;", "bindsTrackingAdapter3", "Lcom/samples/interop/dagger/demo/tracking/TrackingAdapter3;", "interopDaggerDemo", "Ldagger/Module;", "dev.zacsweers.metro.compiler"}, k = 1, mv = {2, 4, 0}, xi = 48)
@Module
public interface TrackingModule {

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
