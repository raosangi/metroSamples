package com.samples.interop.dagger.demo.tracking;

import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.Factory;
import java.util.Optional;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.optionals.OptionalsKt;

/* JADX INFO: compiled from: TrackingAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u001b\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u001a\u0002\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tÊ\u0001\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\u0003\u0010\u0000\u008a\u0002\u0016\b\u0011\u0012\u0012\b\u0001\u001a\u000e\n\fMetroFactory¨\u0006\u000e"}, d2 = {"Lcom/samples/interop/dagger/demo/tracking/TrackingAdapter9;", "Lcom/samples/interop/dagger/demo/tracking/TrackingAdapter;", "optionalExporter", "Ljava/util/Optional;", "Lcom/samples/interop/dagger/demo/tracking/TrackingExporter;", "<init>", "(Ljava/util/Optional;)V", "Ljavax/inject/Inject;", "getOptionalExporter", "()Ljava/util/Optional;", "adapt", "", "trackId", "MetroFactory", "interopDaggerDemo", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters", "dev.zacsweers.metro.compiler"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class TrackingAdapter9 implements TrackingAdapter {
    public static final int $stable = 8;
    private final Optional<TrackingExporter> optionalExporter;

    /* JADX INFO: compiled from: TrackingAdapter.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001:\u0001\tJ\u001a\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007b\u0002\b\u0007J\b\u0010\b\u001a\u00020\u0003H\u0007Ê\u0001\u0018\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\n\b\u000e\u0012\u0006\b\n0\u000f8\u0010Ê\u0001\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\u0003\u0010\u0000¨\u0006\n"}, d2 = {"Lcom/samples/interop/dagger/demo/tracking/TrackingAdapter9$MetroFactory;", "", "declarationMirror", "Lcom/samples/interop/dagger/demo/tracking/TrackingAdapter9;", "optionalExporter", "Ljava/util/Optional;", "Lcom/samples/interop/dagger/demo/tracking/TrackingExporter;", "Ldev/zacsweers/metro/internal/ComptimeOnly;", "invoke", "Companion", "interopDaggerDemo", "Lkotlin/Deprecated;", "message", "This synthesized declaration should not be used directly", "level", "Lkotlin/DeprecationLevel;", "HIDDEN", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final class MetroFactory implements Factory<TrackingAdapter9> {
        private final Provider<Optional<TrackingExporter>> optionalExporter;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        private MetroFactory(Provider<Optional<TrackingExporter>> provider) {
            this.optionalExporter = provider;
        }

        public /* synthetic */ MetroFactory(Provider provider, DefaultConstructorMarker defaultConstructorMarker) {
            this(provider);
        }

        @JvmStatic
        public static final MetroFactory create(Provider<Optional<TrackingExporter>> provider) {
            return Companion.create(provider);
        }

        @JvmStatic
        public static final TrackingAdapter9 newInstance(Optional<TrackingExporter> optional) {
            return Companion.newInstance(optional);
        }

        public final TrackingAdapter9 declarationMirror(Optional<TrackingExporter> optionalExporter) {
            Intrinsics.checkNotNullParameter(optionalExporter, "optionalExporter");
            throw new IllegalStateException("Never called".toString());
        }

        @Override // dev.zacsweers.metro.Provider, kotlin.jvm.functions.Function0
        public final TrackingAdapter9 invoke() {
            return Companion.newInstance(this.optionalExporter.invoke());
        }

        /* JADX INFO: compiled from: TrackingAdapter.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\u0007b\u0002\b\nJ\u001a\u0010\u000b\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007b\u0002\b\n¨\u0006\r"}, d2 = {"Lcom/samples/interop/dagger/demo/tracking/TrackingAdapter9$MetroFactory$Companion;", "", "<init>", "()V", "create", "Lcom/samples/interop/dagger/demo/tracking/TrackingAdapter9$MetroFactory;", "optionalExporter", "Ldev/zacsweers/metro/Provider;", "Ljava/util/Optional;", "Lcom/samples/interop/dagger/demo/tracking/TrackingExporter;", "Lkotlin/jvm/JvmStatic;", "newInstance", "Lcom/samples/interop/dagger/demo/tracking/TrackingAdapter9;", "interopDaggerDemo"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final MetroFactory create(Provider<Optional<TrackingExporter>> optionalExporter) {
                Intrinsics.checkNotNullParameter(optionalExporter, "optionalExporter");
                return new MetroFactory(optionalExporter, null);
            }

            @JvmStatic
            public final TrackingAdapter9 newInstance(Optional<TrackingExporter> optionalExporter) {
                Intrinsics.checkNotNullParameter(optionalExporter, "optionalExporter");
                return new TrackingAdapter9(optionalExporter);
            }

            private Companion() {
            }
        }
    }

    @Inject
    public TrackingAdapter9(Optional<TrackingExporter> optionalExporter) {
        Intrinsics.checkNotNullParameter(optionalExporter, "optionalExporter");
        this.optionalExporter = optionalExporter;
    }

    public final Optional<TrackingExporter> getOptionalExporter() {
        return this.optionalExporter;
    }

    @Override // com.samples.interop.dagger.demo.tracking.TrackingAdapter
    public String adapt(String trackId) {
        Intrinsics.checkNotNullParameter(trackId, "trackId");
        TrackingExporter trackingExporter = (TrackingExporter) OptionalsKt.getOrNull(this.optionalExporter);
        return trackId + "Adapt9" + (trackingExporter != null ? trackingExporter.export(trackId) : null);
    }
}
