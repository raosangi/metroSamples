package com.samples.interop.dagger.demo.tracking;

import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: TrackingHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001BM\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u001c\u0010\u0007\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR'\u0010\u0007\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012Ê\u0001\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0017"}, d2 = {"Lcom/samples/interop/dagger/demo/tracking/DefaultTrackingHandler;", "Lcom/samples/interop/dagger/demo/tracking/TrackingHandler;", "oldTrackingAdapter", "Ljavax/inject/Provider;", "", "Lcom/samples/interop/dagger/demo/tracking/TrackingAdapter;", "newTrackingAdapter", "trackingTags", "", "Lkotlin/reflect/KClass;", "Lkotlin/Function0;", "Lcom/samples/interop/dagger/demo/tracking/TrackingIdentifier;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljava/util/Map;)V", "getOldTrackingAdapter", "()Ljavax/inject/Provider;", "getNewTrackingAdapter", "getTrackingTags", "()Ljava/util/Map;", "handleTracking", "", "trackId", "", "interopDaggerDemo", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class DefaultTrackingHandler implements TrackingHandler {
    public static final int $stable = 8;
    private final Provider<Set<TrackingAdapter>> newTrackingAdapter;
    private final Provider<Set<TrackingAdapter>> oldTrackingAdapter;
    private final Map<KClass<?>, Function0<TrackingIdentifier>> trackingTags;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultTrackingHandler(Provider<Set<TrackingAdapter>> oldTrackingAdapter, Provider<Set<TrackingAdapter>> newTrackingAdapter, Map<KClass<?>, ? extends Function0<? extends TrackingIdentifier>> trackingTags) {
        Intrinsics.checkNotNullParameter(oldTrackingAdapter, "oldTrackingAdapter");
        Intrinsics.checkNotNullParameter(newTrackingAdapter, "newTrackingAdapter");
        Intrinsics.checkNotNullParameter(trackingTags, "trackingTags");
        this.oldTrackingAdapter = oldTrackingAdapter;
        this.newTrackingAdapter = newTrackingAdapter;
        this.trackingTags = trackingTags;
    }

    public final Provider<Set<TrackingAdapter>> getOldTrackingAdapter() {
        return this.oldTrackingAdapter;
    }

    public final Provider<Set<TrackingAdapter>> getNewTrackingAdapter() {
        return this.newTrackingAdapter;
    }

    public final Map<KClass<?>, Function0<TrackingIdentifier>> getTrackingTags() {
        return this.trackingTags;
    }

    @Override // com.samples.interop.dagger.demo.tracking.TrackingHandler
    public void handleTracking(String trackId) {
        Intrinsics.checkNotNullParameter(trackId, "trackId");
        Iterable iterable = this.oldTrackingAdapter.get();
        Intrinsics.checkNotNullExpressionValue(iterable, "get(...)");
        String trackingOld = trackId;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            trackingOld = trackingOld + ((TrackingAdapter) it.next()).adapt(trackId);
        }
        Log.d("TrackingHandler", "Tracking Old: " + trackingOld);
        Iterable iterable2 = this.newTrackingAdapter.get();
        Intrinsics.checkNotNullExpressionValue(iterable2, "get(...)");
        String str = trackId;
        Iterator it2 = iterable2.iterator();
        while (it2.hasNext()) {
            str = str + ((TrackingAdapter) it2.next()).adapt(trackId);
        }
        Log.d("TrackingHandler", "Tracking Old: " + trackingOld);
        Log.d("TrackingHandler", "Tags " + this.trackingTags.size());
    }
}
