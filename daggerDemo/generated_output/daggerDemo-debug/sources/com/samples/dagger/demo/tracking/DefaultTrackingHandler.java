package com.samples.dagger.demo.tracking;

import android.util.Log;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TrackingHandler.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B \b\u0007\u0012\u0011\u0010\u0002\u001a\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u0003\u001a\u0002\b\b¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u001c\u0010\u0002\u001a\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u000f"}, d2 = {"Lcom/samples/dagger/demo/tracking/DefaultTrackingHandler;", "Lcom/samples/dagger/demo/tracking/TrackingHandler;", "trackingAdapter", "", "Lcom/samples/dagger/demo/tracking/TrackingAdapter;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "(Ljava/util/Set;)V", "Ljavax/inject/Inject;", "getTrackingAdapter", "()Ljava/util/Set;", "handleTracking", "", "trackId", "", "daggerDemo", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class DefaultTrackingHandler implements TrackingHandler {
    public static final int $stable = 8;
    private final Set<TrackingAdapter> trackingAdapter;

    @Inject
    public DefaultTrackingHandler(Set<TrackingAdapter> trackingAdapter) {
        Intrinsics.checkNotNullParameter(trackingAdapter, "trackingAdapter");
        this.trackingAdapter = trackingAdapter;
    }

    public final Set<TrackingAdapter> getTrackingAdapter() {
        return this.trackingAdapter;
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
    }
}
