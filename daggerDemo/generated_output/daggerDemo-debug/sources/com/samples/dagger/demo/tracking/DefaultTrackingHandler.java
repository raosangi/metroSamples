package com.samples.dagger.demo.tracking;

import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TrackingHandler.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B=\b\u0007\u0012\u0011\u0010\u0002\u001a\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u0003\u0012\u001b\u0010\u0006\u001a\u0017\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\t\u0012\u00070\t¢\u0006\u0002\b\u00050\u0007\u001a\u0002\b\f¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u001c\u0010\u0002\u001a\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR&\u0010\u0006\u001a\u0017\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\t\u0012\u00070\t¢\u0006\u0002\b\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010Ê\u0001\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0015"}, d2 = {"Lcom/samples/dagger/demo/tracking/DefaultTrackingHandler;", "Lcom/samples/dagger/demo/tracking/TrackingHandler;", "trackingAdapter", "", "Lcom/samples/dagger/demo/tracking/TrackingAdapter;", "Lkotlin/jvm/JvmSuppressWildcards;", "trackingTags", "", "Ljava/lang/Class;", "", "<init>", "(Ljava/util/Set;Ljava/util/Map;)V", "Ljavax/inject/Inject;", "getTrackingAdapter", "()Ljava/util/Set;", "getTrackingTags", "()Ljava/util/Map;", "handleTracking", "", "trackId", "", "daggerDemo", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class DefaultTrackingHandler implements TrackingHandler {
    public static final int $stable = 0;
    private final Set<TrackingAdapter> trackingAdapter;
    private final Map<Class<?>, Object> trackingTags;

    @Inject
    public DefaultTrackingHandler(Set<TrackingAdapter> trackingAdapter, Map<Class<?>, Object> trackingTags) {
        Intrinsics.checkNotNullParameter(trackingAdapter, "trackingAdapter");
        Intrinsics.checkNotNullParameter(trackingTags, "trackingTags");
        this.trackingAdapter = trackingAdapter;
        this.trackingTags = trackingTags;
    }

    public final Set<TrackingAdapter> getTrackingAdapter() {
        return this.trackingAdapter;
    }

    public final Map<Class<?>, Object> getTrackingTags() {
        return this.trackingTags;
    }

    @Override // com.samples.dagger.demo.tracking.TrackingHandler
    public void handleTracking(String trackId) {
        Intrinsics.checkNotNullParameter(trackId, "trackId");
        String tracking = trackId;
        Iterator it = this.trackingAdapter.iterator();
        while (it.hasNext()) {
            tracking = tracking + ((TrackingAdapter) it.next()).adapt(trackId);
        }
        Log.d("TrackingHandler", tracking);
        Log.d("TrackingHandler", "Tags " + this.trackingTags.get(String.class));
    }
}
