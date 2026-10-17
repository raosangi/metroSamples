package com.samples.dagger.demo.tracking;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TrackingAdapter.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\b\u0007\u001a\u0002\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016Ê\u0001\f\b\t\u0012\b\b\n\u0012\u0004\b\u0003\u0010\u0002¨\u0006\b"}, d2 = {"Lcom/samples/dagger/demo/tracking/TrackingAdapter7;", "Lcom/samples/dagger/demo/tracking/TrackingAdapter;", "<init>", "()V", "Ljavax/inject/Inject;", "adapt", "", "trackId", "daggerDemo", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class TrackingAdapter7 implements TrackingAdapter {
    public static final int $stable = 0;

    @Inject
    public TrackingAdapter7() {
    }

    @Override // com.samples.dagger.demo.tracking.TrackingAdapter
    public String adapt(String trackId) {
        Intrinsics.checkNotNullParameter(trackId, "trackId");
        return trackId + "Adapt7";
    }
}
