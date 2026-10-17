package com.samples.dagger.demo.tracking;

import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TrackingHandler.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001BM\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u001c\u0010\u0007\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR'\u0010\u0007\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011Ê\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0016"}, d2 = {"Lcom/samples/dagger/demo/tracking/DefaultTrackingHandler;", "Lcom/samples/dagger/demo/tracking/TrackingHandler;", "oldTrackingAdapter", "Ljavax/inject/Provider;", "", "Lcom/samples/dagger/demo/tracking/TrackingAdapter;", "newTrackingAdapter", "trackingTags", "", "Ljava/lang/Class;", "Lcom/samples/dagger/demo/tracking/TrackingIdentifier;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljava/util/Map;)V", "getOldTrackingAdapter", "()Ljavax/inject/Provider;", "getNewTrackingAdapter", "getTrackingTags", "()Ljava/util/Map;", "handleTracking", "", "trackId", "", "daggerDemo", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class DefaultTrackingHandler implements TrackingHandler {
    public static final int $stable = 8;
    private final Provider<Set<TrackingAdapter>> newTrackingAdapter;
    private final Provider<Set<TrackingAdapter>> oldTrackingAdapter;
    private final Map<Class<?>, Provider<TrackingIdentifier>> trackingTags;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultTrackingHandler(Provider<Set<TrackingAdapter>> oldTrackingAdapter, Provider<Set<TrackingAdapter>> newTrackingAdapter, Map<Class<?>, ? extends Provider<TrackingIdentifier>> trackingTags) {
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

    public final Map<Class<?>, Provider<TrackingIdentifier>> getTrackingTags() {
        return this.trackingTags;
    }

    @Override // com.samples.dagger.demo.tracking.TrackingHandler
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
