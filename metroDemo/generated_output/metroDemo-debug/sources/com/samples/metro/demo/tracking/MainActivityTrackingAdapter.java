package com.samples.metro.demo.tracking;

import dev.zacsweers.metro.Inject;
import dev.zacsweers.metro.internal.Factory;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TrackingAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\r\b\u0007\u001a\u0002\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016Ê\u0001\f\b\n\u0012\b\b\u000b\u0012\u0004\b\u0003\u0010\u0002\u008a\u0002\u0016\b\f\u0012\u0012\b\u0001\u001a\u000e\n\fMetroFactory¨\u0006\t"}, d2 = {"Lcom/samples/metro/demo/tracking/MainActivityTrackingAdapter;", "Lcom/samples/metro/demo/tracking/TrackingAdapter;", "<init>", "()V", "Ldev/zacsweers/metro/Inject;", "adapt", "", "trackId", "MetroFactory", "metroDemo", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters", "dev.zacsweers.metro.compiler"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class MainActivityTrackingAdapter implements TrackingAdapter {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: TrackingAdapter.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\u00020\u0000H\u0007b\u0002\b\u0005J\f\u0010\u0006\u001a\u00020\u0007H\u0007b\u0002\b\bJ\b\u0010\t\u001a\u00020\u0007H\u0007J\f\u0010\n\u001a\u00020\u0007H\u0007b\u0002\b\u0005Ê\u0001\u0018\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\n\b\u000f\u0012\u0006\b\n0\u00108\u0011Ê\u0001\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000b"}, d2 = {"Lcom/samples/metro/demo/tracking/MainActivityTrackingAdapter$MetroFactory;", "", "<init>", "()V", "create", "Lkotlin/jvm/JvmStatic;", "declarationMirror", "Lcom/samples/metro/demo/tracking/MainActivityTrackingAdapter;", "Ldev/zacsweers/metro/internal/ComptimeOnly;", "invoke", "newInstance", "metroDemo", "Lkotlin/Deprecated;", "message", "This synthesized declaration should not be used directly", "level", "Lkotlin/DeprecationLevel;", "HIDDEN", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final class MetroFactory implements Factory<MainActivityTrackingAdapter> {
        public static final int $stable = 0;
        public static final MetroFactory INSTANCE = new MetroFactory();

        @JvmStatic
        public static final MetroFactory create() {
            return INSTANCE;
        }

        @JvmStatic
        public static final MainActivityTrackingAdapter newInstance() {
            return new MainActivityTrackingAdapter();
        }

        public final MainActivityTrackingAdapter declarationMirror() {
            throw new IllegalStateException("Never called".toString());
        }

        @Override // dev.zacsweers.metro.Provider, kotlin.jvm.functions.Function0
        public final MainActivityTrackingAdapter invoke() {
            return newInstance();
        }

        private MetroFactory() {
        }
    }

    @Inject
    public MainActivityTrackingAdapter() {
    }

    @Override // com.samples.metro.demo.tracking.TrackingAdapter
    public String adapt(String trackId) {
        Intrinsics.checkNotNullParameter(trackId, "trackId");
        return trackId + "MainActivityAdapt4";
    }
}
