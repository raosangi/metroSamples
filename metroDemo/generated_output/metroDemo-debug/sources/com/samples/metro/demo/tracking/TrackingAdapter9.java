package com.samples.metro.demo.tracking;

import dev.zacsweers.metro.Inject;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.Factory;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TrackingAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB\u0019\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001a\u0002\b\u0006¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bÊ\u0001\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\u0003\u0010\u0000\u008a\u0002\u0016\b\u0010\u0012\u0012\b\u0001\u001a\u000e\n\fMetroFactory¨\u0006\r"}, d2 = {"Lcom/samples/metro/demo/tracking/TrackingAdapter9;", "Lcom/samples/metro/demo/tracking/TrackingAdapter;", "optionalExporter", "Lcom/samples/metro/demo/tracking/TrackingExporter;", "<init>", "(Lcom/samples/metro/demo/tracking/TrackingExporter;)V", "Ldev/zacsweers/metro/Inject;", "getOptionalExporter", "()Lcom/samples/metro/demo/tracking/TrackingExporter;", "adapt", "", "trackId", "MetroFactory", "metroDemo", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters", "dev.zacsweers.metro.compiler"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class TrackingAdapter9 implements TrackingAdapter {
    public static final int $stable = 8;
    private final TrackingExporter optionalExporter;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public TrackingAdapter9() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: compiled from: TrackingAdapter.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001:\u0001\bJ\u0018\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007b\u0002\b\u0006J\b\u0010\u0007\u001a\u00020\u0003H\u0007Ê\u0001\u0018\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\n\b\r\u0012\u0006\b\n0\u000e8\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0000¨\u0006\t"}, d2 = {"Lcom/samples/metro/demo/tracking/TrackingAdapter9$MetroFactory;", "", "declarationMirror", "Lcom/samples/metro/demo/tracking/TrackingAdapter9;", "optionalExporter", "Lcom/samples/metro/demo/tracking/TrackingExporter;", "Ldev/zacsweers/metro/internal/ComptimeOnly;", "invoke", "Companion", "metroDemo", "Lkotlin/Deprecated;", "message", "This synthesized declaration should not be used directly", "level", "Lkotlin/DeprecationLevel;", "HIDDEN", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final class MetroFactory implements Factory<TrackingAdapter9> {
        private final Provider<TrackingExporter> optionalExporter;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        private MetroFactory(Provider<TrackingExporter> provider) {
            this.optionalExporter = provider;
        }

        public /* synthetic */ MetroFactory(Provider provider, DefaultConstructorMarker defaultConstructorMarker) {
            this(provider);
        }

        @JvmStatic
        public static final MetroFactory create(Provider<TrackingExporter> provider) {
            return Companion.create(provider);
        }

        public static /* synthetic */ TrackingAdapter9 declarationMirror$default(MetroFactory metroFactory, TrackingExporter trackingExporter, int i, Object obj) {
            if ((i & 1) == 0) {
                return metroFactory.declarationMirror(trackingExporter);
            }
            throw new IllegalStateException("Never called".toString());
        }

        @JvmStatic
        public static final TrackingAdapter9 newInstance(TrackingExporter trackingExporter) {
            return Companion.newInstance(trackingExporter);
        }

        public final TrackingAdapter9 declarationMirror(TrackingExporter optionalExporter) {
            throw new IllegalStateException("Never called".toString());
        }

        @Override // dev.zacsweers.metro.Provider, kotlin.jvm.functions.Function0
        public final TrackingAdapter9 invoke() {
            return Companion.newInstance(this.optionalExporter.invoke());
        }

        /* JADX INFO: compiled from: TrackingAdapter.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0007b\u0002\b\tJ\u0018\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\bH\u0007b\u0002\b\t¨\u0006\f"}, d2 = {"Lcom/samples/metro/demo/tracking/TrackingAdapter9$MetroFactory$Companion;", "", "<init>", "()V", "create", "Lcom/samples/metro/demo/tracking/TrackingAdapter9$MetroFactory;", "optionalExporter", "Ldev/zacsweers/metro/Provider;", "Lcom/samples/metro/demo/tracking/TrackingExporter;", "Lkotlin/jvm/JvmStatic;", "newInstance", "Lcom/samples/metro/demo/tracking/TrackingAdapter9;", "metroDemo"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final MetroFactory create(Provider<TrackingExporter> optionalExporter) {
                Intrinsics.checkNotNullParameter(optionalExporter, "optionalExporter");
                return new MetroFactory(optionalExporter, null);
            }

            @JvmStatic
            public final TrackingAdapter9 newInstance(TrackingExporter optionalExporter) {
                return new TrackingAdapter9(optionalExporter);
            }

            private Companion() {
            }

            static final TrackingExporter create$lambda$0() {
                return null;
            }

            public static /* synthetic */ TrackingAdapter9 newInstance$default(Companion companion, TrackingExporter trackingExporter, int i, Object obj) {
                if ((i & 1) != 0) {
                    trackingExporter = null;
                }
                return companion.newInstance(trackingExporter);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ MetroFactory create$default(Companion companion, Provider provider, int i, Object obj) {
                LambdaProvider lambdaProviderM7597boximpl;
                if ((i & 1) != 0) {
                    Function0 function0 = new Function0() { // from class: com.samples.metro.demo.tracking.TrackingAdapter9$MetroFactory$Companion$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TrackingAdapter9.MetroFactory.Companion.create$lambda$0();
                        }
                    };
                    if (function0 instanceof Provider) {
                        lambdaProviderM7597boximpl = (Provider) function0;
                    } else {
                        lambdaProviderM7597boximpl = LambdaProvider.m7597boximpl(LambdaProvider.m7598constructorimpl(function0));
                    }
                    provider = lambdaProviderM7597boximpl;
                }
                return companion.create(provider);
            }
        }
    }

    @Inject
    public TrackingAdapter9(TrackingExporter optionalExporter) {
        this.optionalExporter = optionalExporter;
    }

    public /* synthetic */ TrackingAdapter9(TrackingExporter trackingExporter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : trackingExporter);
    }

    public final TrackingExporter getOptionalExporter() {
        return this.optionalExporter;
    }

    @Override // com.samples.metro.demo.tracking.TrackingAdapter
    public String adapt(String trackId) {
        Intrinsics.checkNotNullParameter(trackId, "trackId");
        TrackingExporter trackingExporter = this.optionalExporter;
        return trackId + "Adapt9" + (trackingExporter != null ? trackingExporter.export(trackId) : null);
    }
}
