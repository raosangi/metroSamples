package com.samples.metro.demo.tracking;

import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: TrackingHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001BM\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u001c\u0010\u0007\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR'\u0010\u0007\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011Ê\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0016"}, d2 = {"Lcom/samples/metro/demo/tracking/DefaultTrackingHandler;", "Lcom/samples/metro/demo/tracking/TrackingHandler;", "oldTrackingAdapter", "Lkotlin/Function0;", "", "Lcom/samples/metro/demo/tracking/TrackingAdapter;", "newTrackingAdapter", "trackingTags", "", "Lkotlin/reflect/KClass;", "Lcom/samples/metro/demo/tracking/TrackingIdentifier;", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/util/Map;)V", "getOldTrackingAdapter", "()Lkotlin/jvm/functions/Function0;", "getNewTrackingAdapter", "getTrackingTags", "()Ljava/util/Map;", "handleTracking", "", "trackId", "", "metroDemo", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class DefaultTrackingHandler implements TrackingHandler {
    public static final int $stable = 8;
    private final Function0<Set<TrackingAdapter>> newTrackingAdapter;
    private final Function0<Set<TrackingAdapter>> oldTrackingAdapter;
    private final Map<KClass<?>, Function0<TrackingIdentifier>> trackingTags;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultTrackingHandler(Function0<? extends Set<? extends TrackingAdapter>> oldTrackingAdapter, Function0<? extends Set<? extends TrackingAdapter>> newTrackingAdapter, Map<KClass<?>, ? extends Function0<? extends TrackingIdentifier>> trackingTags) {
        Intrinsics.checkNotNullParameter(oldTrackingAdapter, "oldTrackingAdapter");
        Intrinsics.checkNotNullParameter(newTrackingAdapter, "newTrackingAdapter");
        Intrinsics.checkNotNullParameter(trackingTags, "trackingTags");
        this.oldTrackingAdapter = oldTrackingAdapter;
        this.newTrackingAdapter = newTrackingAdapter;
        this.trackingTags = trackingTags;
    }

    public final Function0<Set<TrackingAdapter>> getOldTrackingAdapter() {
        return this.oldTrackingAdapter;
    }

    public final Function0<Set<TrackingAdapter>> getNewTrackingAdapter() {
        return this.newTrackingAdapter;
    }

    public final Map<KClass<?>, Function0<TrackingIdentifier>> getTrackingTags() {
        return this.trackingTags;
    }

    @Override // com.samples.metro.demo.tracking.TrackingHandler
    public void handleTracking(String trackId) {
        Intrinsics.checkNotNullParameter(trackId, "trackId");
        String trackingOld = trackId;
        Iterator it = this.oldTrackingAdapter.invoke().iterator();
        while (it.hasNext()) {
            trackingOld = trackingOld + ((TrackingAdapter) it.next()).adapt(trackId);
        }
        Log.d("TrackingHandler", "Tracking Old: " + trackingOld);
        String str = trackId;
        Iterator it2 = this.newTrackingAdapter.invoke().iterator();
        while (it2.hasNext()) {
            str = str + ((TrackingAdapter) it2.next()).adapt(trackId);
        }
        Log.d("TrackingHandler", "Tracking Old: " + trackingOld);
        Log.d("TrackingHandler", "Tags " + this.trackingTags.size());
    }
}
