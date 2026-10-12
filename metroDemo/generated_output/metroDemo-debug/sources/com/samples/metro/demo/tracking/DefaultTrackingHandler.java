package com.samples.metro.demo.tracking;

import android.util.Log;
import dev.zacsweers.metro.Inject;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.Factory;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: TrackingHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B=\b\u0007\u0012\u0011\u0010\u0002\u001a\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u0003\u0012\u001b\u0010\u0006\u001a\u0017\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\t\u0012\u00070\t¢\u0006\u0002\b\u00050\u0007\u001a\u0002\b\f¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u001c\u0010\u0002\u001a\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR&\u0010\u0006\u001a\u0017\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\t\u0012\u00070\t¢\u0006\u0002\b\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010Ê\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0002\u008a\u0002\u0016\b\u0019\u0012\u0012\b\u0001\u001a\u000e\n\fMetroFactory¨\u0006\u0016"}, d2 = {"Lcom/samples/metro/demo/tracking/DefaultTrackingHandler;", "Lcom/samples/metro/demo/tracking/TrackingHandler;", "trackingAdapter", "", "Lcom/samples/metro/demo/tracking/TrackingAdapter;", "Lkotlin/jvm/JvmSuppressWildcards;", "trackingTags", "", "Lkotlin/reflect/KClass;", "", "<init>", "(Ljava/util/Set;Ljava/util/Map;)V", "Ldev/zacsweers/metro/Inject;", "getTrackingAdapter", "()Ljava/util/Set;", "getTrackingTags", "()Ljava/util/Map;", "handleTracking", "", "trackId", "", "MetroFactory", "metroDemo", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters", "dev.zacsweers.metro.compiler"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class DefaultTrackingHandler implements TrackingHandler {
    public static final int $stable = 0;
    private final Set<TrackingAdapter> trackingAdapter;
    private final Map<KClass<?>, Object> trackingTags;

    /* JADX INFO: compiled from: TrackingHandler.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001:\u0001\fJ2\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0016\u0010\u0007\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00010\bH\u0007b\u0002\b\nJ\b\u0010\u000b\u001a\u00020\u0003H\u0007Ê\u0001\u0018\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\n\b\u0011\u0012\u0006\b\n0\u00128\u0013Ê\u0001\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\u0003\u0010\u0002¨\u0006\r"}, d2 = {"Lcom/samples/metro/demo/tracking/DefaultTrackingHandler$MetroFactory;", "", "declarationMirror", "Lcom/samples/metro/demo/tracking/DefaultTrackingHandler;", "trackingAdapter", "", "Lcom/samples/metro/demo/tracking/TrackingAdapter;", "trackingTags", "", "Lkotlin/reflect/KClass;", "Ldev/zacsweers/metro/internal/ComptimeOnly;", "invoke", "Companion", "metroDemo", "Lkotlin/Deprecated;", "message", "This synthesized declaration should not be used directly", "level", "Lkotlin/DeprecationLevel;", "HIDDEN", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final class MetroFactory implements Factory<DefaultTrackingHandler> {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final Provider<Set<TrackingAdapter>> trackingAdapter;
        private final Provider<Map<KClass<?>, Object>> trackingTags;

        private MetroFactory(Provider<Set<TrackingAdapter>> provider, Provider<Map<KClass<?>, Object>> provider2) {
            this.trackingAdapter = provider;
            this.trackingTags = provider2;
        }

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, DefaultConstructorMarker defaultConstructorMarker) {
            this(provider, provider2);
        }

        @JvmStatic
        public static final MetroFactory create(Provider<Set<TrackingAdapter>> provider, Provider<Map<KClass<?>, Object>> provider2) {
            return Companion.create(provider, provider2);
        }

        @JvmStatic
        public static final DefaultTrackingHandler newInstance(Set<TrackingAdapter> set, Map<KClass<?>, Object> map) {
            return Companion.newInstance(set, map);
        }

        public final DefaultTrackingHandler declarationMirror(Set<TrackingAdapter> trackingAdapter, Map<KClass<?>, Object> trackingTags) {
            Intrinsics.checkNotNullParameter(trackingAdapter, "trackingAdapter");
            Intrinsics.checkNotNullParameter(trackingTags, "trackingTags");
            throw new IllegalStateException("Never called".toString());
        }

        @Override // dev.zacsweers.metro.Provider, kotlin.jvm.functions.Function0
        public final DefaultTrackingHandler invoke() {
            return Companion.newInstance(this.trackingAdapter.invoke(), this.trackingTags.invoke());
        }

        /* JADX INFO: compiled from: TrackingHandler.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u001c\u0010\n\u001a\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\u0004\u0012\u00020\u00010\u000b0\u0007H\u0007b\u0002\b\rJ2\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0016\u0010\n\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\u0004\u0012\u00020\u00010\u000bH\u0007b\u0002\b\r¨\u0006\u0010"}, d2 = {"Lcom/samples/metro/demo/tracking/DefaultTrackingHandler$MetroFactory$Companion;", "", "<init>", "()V", "create", "Lcom/samples/metro/demo/tracking/DefaultTrackingHandler$MetroFactory;", "trackingAdapter", "Ldev/zacsweers/metro/Provider;", "", "Lcom/samples/metro/demo/tracking/TrackingAdapter;", "trackingTags", "", "Lkotlin/reflect/KClass;", "Lkotlin/jvm/JvmStatic;", "newInstance", "Lcom/samples/metro/demo/tracking/DefaultTrackingHandler;", "metroDemo"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final MetroFactory create(Provider<Set<TrackingAdapter>> trackingAdapter, Provider<Map<KClass<?>, Object>> trackingTags) {
                Intrinsics.checkNotNullParameter(trackingAdapter, "trackingAdapter");
                Intrinsics.checkNotNullParameter(trackingTags, "trackingTags");
                return new MetroFactory(trackingAdapter, trackingTags, null);
            }

            @JvmStatic
            public final DefaultTrackingHandler newInstance(Set<TrackingAdapter> trackingAdapter, Map<KClass<?>, Object> trackingTags) {
                Intrinsics.checkNotNullParameter(trackingAdapter, "trackingAdapter");
                Intrinsics.checkNotNullParameter(trackingTags, "trackingTags");
                return new DefaultTrackingHandler(trackingAdapter, trackingTags);
            }

            private Companion() {
            }
        }
    }

    @Inject
    public DefaultTrackingHandler(Set<TrackingAdapter> trackingAdapter, Map<KClass<?>, Object> trackingTags) {
        Intrinsics.checkNotNullParameter(trackingAdapter, "trackingAdapter");
        Intrinsics.checkNotNullParameter(trackingTags, "trackingTags");
        this.trackingAdapter = trackingAdapter;
        this.trackingTags = trackingTags;
    }

    public final Set<TrackingAdapter> getTrackingAdapter() {
        return this.trackingAdapter;
    }

    public final Map<KClass<?>, Object> getTrackingTags() {
        return this.trackingTags;
    }

    @Override // com.samples.metro.demo.tracking.TrackingHandler
    public void handleTracking(String trackId) {
        Intrinsics.checkNotNullParameter(trackId, "trackId");
        String tracking = trackId;
        Iterator it = this.trackingAdapter.iterator();
        while (it.hasNext()) {
            tracking = tracking + ((TrackingAdapter) it.next()).adapt(trackId);
        }
        Log.d("TrackingHandler", tracking);
        Log.d("TrackingHandler", "Tags " + this.trackingTags.get(Reflection.getOrCreateKotlinClass(String.class)));
    }
}
