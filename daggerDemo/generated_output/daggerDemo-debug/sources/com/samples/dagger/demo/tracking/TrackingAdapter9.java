package com.samples.dagger.demo.tracking;

import java.util.Optional;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.optionals.OptionalsKt;

/* JADX INFO: compiled from: TrackingAdapter.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u001a\u0002\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tÊ\u0001\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\u0003\u0010\u0000¨\u0006\r"}, d2 = {"Lcom/samples/dagger/demo/tracking/TrackingAdapter9;", "Lcom/samples/dagger/demo/tracking/TrackingAdapter;", "optionalExporter", "Ljava/util/Optional;", "Lcom/samples/dagger/demo/tracking/TrackingExporter;", "<init>", "(Ljava/util/Optional;)V", "Ljavax/inject/Inject;", "getOptionalExporter", "()Ljava/util/Optional;", "adapt", "", "trackId", "daggerDemo", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class TrackingAdapter9 implements TrackingAdapter {
    public static final int $stable = 8;
    private final Optional<TrackingExporter> optionalExporter;

    @Inject
    public TrackingAdapter9(Optional<TrackingExporter> optionalExporter) {
        Intrinsics.checkNotNullParameter(optionalExporter, "optionalExporter");
        this.optionalExporter = optionalExporter;
    }

    public final Optional<TrackingExporter> getOptionalExporter() {
        return this.optionalExporter;
    }

    @Override // com.samples.dagger.demo.tracking.TrackingAdapter
    public String adapt(String trackId) {
        Intrinsics.checkNotNullParameter(trackId, "trackId");
        TrackingExporter trackingExporter = (TrackingExporter) OptionalsKt.getOrNull(this.optionalExporter);
        return trackId + "Adapt9" + (trackingExporter != null ? trackingExporter.export(trackId) : null);
    }
}
