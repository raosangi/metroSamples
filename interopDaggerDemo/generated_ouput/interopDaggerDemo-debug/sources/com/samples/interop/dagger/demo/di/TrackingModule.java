package com.samples.interop.dagger.demo.di;

import com.samples.interop.dagger.demo.tracking.DefaultTrackingHandler;
import com.samples.interop.dagger.demo.tracking.NewTrackingQualifier;
import com.samples.interop.dagger.demo.tracking.OldTrackingIdentifier;
import com.samples.interop.dagger.demo.tracking.OldTrackingQualifier;
import com.samples.interop.dagger.demo.tracking.TrackingAdapter;
import com.samples.interop.dagger.demo.tracking.TrackingAdapter2;
import com.samples.interop.dagger.demo.tracking.TrackingAdapter3;
import com.samples.interop.dagger.demo.tracking.TrackingAdapter4;
import com.samples.interop.dagger.demo.tracking.TrackingAdapter5;
import com.samples.interop.dagger.demo.tracking.TrackingAdapter6;
import com.samples.interop.dagger.demo.tracking.TrackingAdapter7;
import com.samples.interop.dagger.demo.tracking.TrackingAdapter8;
import com.samples.interop.dagger.demo.tracking.TrackingAdapter9;
import com.samples.interop.dagger.demo.tracking.TrackingExporter;
import com.samples.interop.dagger.demo.tracking.TrackingHandler;
import com.samples.interop.dagger.demo.tracking.TrackingIdentifier;
import dagger.Binds;
import dagger.BindsOptionalOf;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.CallableMetadata;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.interop.javax.JavaxInteropKt;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: TrackingModule.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bg\u0018\u0000 !2\u00020\u0001:\u0001!J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'b\u0002\b\u0006b\u0002\b\u0007b\u0002\b\bJ\u001c\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\nH'b\u0002\b\u0006b\u0002\b\u0007b\u0002\b\u000bJ\u001c\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\rH'b\u0002\b\u0006b\u0002\b\u0007b\u0002\b\u000bJ\u001c\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000fH'b\u0002\b\u0006b\u0002\b\u0007b\u0002\b\u000bJ\u001c\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0011H'b\u0002\b\u0006b\u0002\b\u0007b\u0002\b\u000bJ\u001c\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0013H'b\u0002\b\u0006b\u0002\b\u0007b\u0002\b\u000bJ\u001c\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0015H'b\u0002\b\u0006b\u0002\b\u0007b\u0002\b\u000bJ\u001c\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0017H'b\u0002\b\u0006b\u0002\b\u0007b\u0002\b\u000bJ\f\u0010\u0018\u001a\u00020\u0019H'b\u0002\b\u001aJ&\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u001dH'b\u0002\b\u0007b\u0002\b\u001eb\f\b\u001f\u0012\b\b \u0012\u0004\b\t0\u001dÊ\u0001\u0002\b#\u008a\u0002 \u0001\b$\u0012\u009b\u0001\b\u0001\u0012\u0096\u0001\u0012\u0093\u0001\n_com/samples/interop/dagger/demo/di/TrackingModule.Companion.ProvidesTrackingHandlerMetroFactory\"\u0017providesTrackingHandler2\u0017providesTrackingHandler¨\u0006\"À\u0006\u0003"}, d2 = {"Lcom/samples/interop/dagger/demo/di/TrackingModule;", "", "bindsTrackingAdapter2", "Lcom/samples/interop/dagger/demo/tracking/TrackingAdapter;", "instance", "Lcom/samples/interop/dagger/demo/tracking/TrackingAdapter2;", "Ldagger/multibindings/IntoSet;", "Ldagger/Binds;", "Lcom/samples/interop/dagger/demo/tracking/OldTrackingQualifier;", "bindsTrackingAdapter3", "Lcom/samples/interop/dagger/demo/tracking/TrackingAdapter3;", "Lcom/samples/interop/dagger/demo/tracking/NewTrackingQualifier;", "bindsTrackingAdapter4", "Lcom/samples/interop/dagger/demo/tracking/TrackingAdapter4;", "bindsTrackingAdapter5", "Lcom/samples/interop/dagger/demo/tracking/TrackingAdapter5;", "bindsTrackingAdapter6", "Lcom/samples/interop/dagger/demo/tracking/TrackingAdapter6;", "bindsTrackingAdapter7", "Lcom/samples/interop/dagger/demo/tracking/TrackingAdapter7;", "bindsTrackingAdapter8", "Lcom/samples/interop/dagger/demo/tracking/TrackingAdapter8;", "bindsTrackingAdapter9", "Lcom/samples/interop/dagger/demo/tracking/TrackingAdapter9;", "bindsOptionalOf", "Lcom/samples/interop/dagger/demo/tracking/TrackingExporter;", "Ldagger/BindsOptionalOf;", "providesStringTag", "Lcom/samples/interop/dagger/demo/tracking/TrackingIdentifier;", "Lcom/samples/interop/dagger/demo/tracking/OldTrackingIdentifier;", "Ldagger/multibindings/IntoMap;", "Ldagger/multibindings/ClassKey;", "value", "Companion", "interopDaggerDemo", "Ldagger/Module;", "dev.zacsweers.metro.compiler"}, k = 1, mv = {2, 4, 0}, xi = 48)
@Module
public interface TrackingModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: TrackingModule.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class DefaultImpls {
        @OldTrackingQualifier
        @Binds
        @IntoSet
        @Deprecated
        public static TrackingAdapter bindsTrackingAdapter2(TrackingModule $this, TrackingAdapter2 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            return TrackingModule.super.bindsTrackingAdapter2(instance);
        }

        @NewTrackingQualifier
        @Binds
        @IntoSet
        @Deprecated
        public static TrackingAdapter bindsTrackingAdapter3(TrackingModule $this, TrackingAdapter3 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            return TrackingModule.super.bindsTrackingAdapter3(instance);
        }

        @NewTrackingQualifier
        @Binds
        @IntoSet
        @Deprecated
        public static TrackingAdapter bindsTrackingAdapter4(TrackingModule $this, TrackingAdapter4 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            return TrackingModule.super.bindsTrackingAdapter4(instance);
        }

        @NewTrackingQualifier
        @Binds
        @IntoSet
        @Deprecated
        public static TrackingAdapter bindsTrackingAdapter5(TrackingModule $this, TrackingAdapter5 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            return TrackingModule.super.bindsTrackingAdapter5(instance);
        }

        @NewTrackingQualifier
        @Binds
        @IntoSet
        @Deprecated
        public static TrackingAdapter bindsTrackingAdapter6(TrackingModule $this, TrackingAdapter6 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            return TrackingModule.super.bindsTrackingAdapter6(instance);
        }

        @NewTrackingQualifier
        @Binds
        @IntoSet
        @Deprecated
        public static TrackingAdapter bindsTrackingAdapter7(TrackingModule $this, TrackingAdapter7 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            return TrackingModule.super.bindsTrackingAdapter7(instance);
        }

        @NewTrackingQualifier
        @Binds
        @IntoSet
        @Deprecated
        public static TrackingAdapter bindsTrackingAdapter8(TrackingModule $this, TrackingAdapter8 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            return TrackingModule.super.bindsTrackingAdapter8(instance);
        }

        @NewTrackingQualifier
        @Binds
        @IntoSet
        @Deprecated
        public static TrackingAdapter bindsTrackingAdapter9(TrackingModule $this, TrackingAdapter9 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            return TrackingModule.super.bindsTrackingAdapter9(instance);
        }

        @BindsOptionalOf
        @Deprecated
        public static TrackingExporter bindsOptionalOf(TrackingModule $this) {
            return TrackingModule.super.bindsOptionalOf();
        }

        @Binds
        @Deprecated
        @ClassKey(OldTrackingIdentifier.class)
        @IntoMap
        public static TrackingIdentifier providesStringTag(TrackingModule $this, OldTrackingIdentifier instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            return TrackingModule.super.providesStringTag(instance);
        }
    }

    @OldTrackingQualifier
    @Binds
    @IntoSet
    default TrackingAdapter bindsTrackingAdapter2(TrackingAdapter2 instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        throw new IllegalStateException("Never called".toString());
    }

    @NewTrackingQualifier
    @Binds
    @IntoSet
    default TrackingAdapter bindsTrackingAdapter3(TrackingAdapter3 instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        throw new IllegalStateException("Never called".toString());
    }

    @NewTrackingQualifier
    @Binds
    @IntoSet
    default TrackingAdapter bindsTrackingAdapter4(TrackingAdapter4 instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        throw new IllegalStateException("Never called".toString());
    }

    @NewTrackingQualifier
    @Binds
    @IntoSet
    default TrackingAdapter bindsTrackingAdapter5(TrackingAdapter5 instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        throw new IllegalStateException("Never called".toString());
    }

    @NewTrackingQualifier
    @Binds
    @IntoSet
    default TrackingAdapter bindsTrackingAdapter6(TrackingAdapter6 instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        throw new IllegalStateException("Never called".toString());
    }

    @NewTrackingQualifier
    @Binds
    @IntoSet
    default TrackingAdapter bindsTrackingAdapter7(TrackingAdapter7 instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        throw new IllegalStateException("Never called".toString());
    }

    @NewTrackingQualifier
    @Binds
    @IntoSet
    default TrackingAdapter bindsTrackingAdapter8(TrackingAdapter8 instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        throw new IllegalStateException("Never called".toString());
    }

    @NewTrackingQualifier
    @Binds
    @IntoSet
    default TrackingAdapter bindsTrackingAdapter9(TrackingAdapter9 instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        throw new IllegalStateException("Never called".toString());
    }

    @BindsOptionalOf
    default TrackingExporter bindsOptionalOf() {
        throw new IllegalStateException("Never called".toString());
    }

    /* JADX INFO: compiled from: TrackingModule.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jh\u0010\u0004\u001a\u00020\u00052\u001d\b\u0001\u0010\u0006\u001a\u0013\u0012\u000f\u0012\r\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n0\b0\u0007:\u0002\b\u000b2\u001d\b\u0001\u0010\f\u001a\u0013\u0012\u000f\u0012\r\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n0\b0\u0007:\u0002\b\r2\u001c\u0010\u000e\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000fH\u0007b\u0002\b\u0013\u008a\u0002 \u0001\b\u0016\u0012\u009b\u0001\b\u0001\u0012\u0096\u0001\u0012\u0093\u0001\n_com/samples/interop/dagger/demo/di/TrackingModule.Companion.ProvidesTrackingHandlerMetroFactory\"\u0017providesTrackingHandler2\u0017providesTrackingHandler¨\u0006\u0015"}, d2 = {"Lcom/samples/interop/dagger/demo/di/TrackingModule$Companion;", "", "<init>", "()V", "providesTrackingHandler", "Lcom/samples/interop/dagger/demo/tracking/TrackingHandler;", "oldTrackingAdapter", "Ljavax/inject/Provider;", "", "Lcom/samples/interop/dagger/demo/tracking/TrackingAdapter;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/samples/interop/dagger/demo/tracking/OldTrackingQualifier;", "newTrackingAdapter", "Lcom/samples/interop/dagger/demo/tracking/NewTrackingQualifier;", "trackingTags", "", "Lkotlin/reflect/KClass;", "Lkotlin/Function0;", "Lcom/samples/interop/dagger/demo/tracking/TrackingIdentifier;", "Ldagger/Provides;", "ProvidesTrackingHandlerMetroFactory", "interopDaggerDemo", "dev.zacsweers.metro.compiler"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX INFO: compiled from: TrackingModule.kt */
        @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012J^\u0010\u0002\u001a\u00020\u00032\u0018\b\u0001\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005:\u0002\b\b2\u0018\b\u0001\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005:\u0002\b\n2\u001c\u0010\u000b\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\fH\u0007b\u0002\b\u0010J\b\u0010\u0011\u001a\u00020\u0003H\u0007Ê\u0001\u0018\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\n\b\u0017\u0012\u0006\b\n0\u00188\u0019Ê\u00016\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\t\b\u001f\u0012\u0005\b\u0003\u0010Þ(\u0012\t\b \u0012\u0005\b\u0003\u0010Æ/\u0012\b\b!\u0012\u0004\b\b(\u001cÊ\u0001\f\b\"\u0012\b\b#\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0013"}, d2 = {"Lcom/samples/interop/dagger/demo/di/TrackingModule$Companion$ProvidesTrackingHandlerMetroFactory;", "", "declarationMirror", "Lcom/samples/interop/dagger/demo/tracking/TrackingHandler;", "oldTrackingAdapter", "Ljavax/inject/Provider;", "", "Lcom/samples/interop/dagger/demo/tracking/TrackingAdapter;", "Lcom/samples/interop/dagger/demo/tracking/OldTrackingQualifier;", "newTrackingAdapter", "Lcom/samples/interop/dagger/demo/tracking/NewTrackingQualifier;", "trackingTags", "", "Lkotlin/reflect/KClass;", "Lkotlin/Function0;", "Lcom/samples/interop/dagger/demo/tracking/TrackingIdentifier;", "Ldev/zacsweers/metro/internal/ComptimeOnly;", "invoke", "Companion", "interopDaggerDemo", "Lkotlin/Deprecated;", "message", "This synthesized declaration should not be used directly", "level", "Lkotlin/DeprecationLevel;", "HIDDEN", "Ldev/zacsweers/metro/internal/CallableMetadata;", "callableName", "providesTrackingHandler", "propertyName", "", "startOffset", "endOffset", "newInstanceName", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        @CallableMetadata(callableName = "providesTrackingHandler", endOffset = 3043, newInstanceName = "providesTrackingHandler", propertyName = "", startOffset = 2607)
        public static final class ProvidesTrackingHandlerMetroFactory implements Factory<TrackingHandler> {
            public static final int $stable = 0;
            public static final C0131Companion Companion = new C0131Companion(null);
            private final Provider<Set<TrackingAdapter>> newTrackingAdapter;
            private final Provider<Set<TrackingAdapter>> oldTrackingAdapter;
            private final Provider<Map<KClass<?>, Function0<TrackingIdentifier>>> trackingTags;

            private ProvidesTrackingHandlerMetroFactory(Provider<Set<TrackingAdapter>> provider, Provider<Set<TrackingAdapter>> provider2, Provider<Map<KClass<?>, Function0<TrackingIdentifier>>> provider3) {
                this.oldTrackingAdapter = provider;
                this.newTrackingAdapter = provider2;
                this.trackingTags = provider3;
            }

            public /* synthetic */ ProvidesTrackingHandlerMetroFactory(Provider provider, Provider provider2, Provider provider3, DefaultConstructorMarker defaultConstructorMarker) {
                this(provider, provider2, provider3);
            }

            @JvmStatic
            public static final ProvidesTrackingHandlerMetroFactory create(@OldTrackingQualifier Provider<Set<TrackingAdapter>> provider, @NewTrackingQualifier Provider<Set<TrackingAdapter>> provider2, Provider<Map<KClass<?>, Function0<TrackingIdentifier>>> provider3) {
                return Companion.create(provider, provider2, provider3);
            }

            @JvmStatic
            public static final TrackingHandler providesTrackingHandler(@OldTrackingQualifier javax.inject.Provider<Set<TrackingAdapter>> provider, @NewTrackingQualifier javax.inject.Provider<Set<TrackingAdapter>> provider2, Map<KClass<?>, ? extends Function0<? extends TrackingIdentifier>> map) {
                return Companion.providesTrackingHandler(provider, provider2, map);
            }

            public final TrackingHandler declarationMirror(@OldTrackingQualifier javax.inject.Provider<Set<TrackingAdapter>> oldTrackingAdapter, @NewTrackingQualifier javax.inject.Provider<Set<TrackingAdapter>> newTrackingAdapter, Map<KClass<?>, ? extends Function0<? extends TrackingIdentifier>> trackingTags) {
                Intrinsics.checkNotNullParameter(oldTrackingAdapter, "oldTrackingAdapter");
                Intrinsics.checkNotNullParameter(newTrackingAdapter, "newTrackingAdapter");
                Intrinsics.checkNotNullParameter(trackingTags, "trackingTags");
                throw new IllegalStateException("Never called".toString());
            }

            @Override // dev.zacsweers.metro.Provider, kotlin.jvm.functions.Function0
            public final TrackingHandler invoke() {
                return Companion.providesTrackingHandler(JavaxInteropKt.asJavaxProvider(this.oldTrackingAdapter), JavaxInteropKt.asJavaxProvider(this.newTrackingAdapter), this.trackingTags.invoke());
            }

            /* JADX INFO: renamed from: com.samples.interop.dagger.demo.di.TrackingModule$Companion$ProvidesTrackingHandlerMetroFactory$Companion, reason: collision with other inner class name */
            /* JADX INFO: compiled from: TrackingModule.kt */
            @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jd\u0010\u0004\u001a\u00020\u00052\u0018\b\u0001\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007:\u0002\b\n2\u0018\b\u0001\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007:\u0002\b\f2\"\u0010\r\u001a\u001e\u0012\u001a\u0012\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000e0\u0007H\u0007b\u0002\b\u0012J^\u0010\u0013\u001a\u00020\u00142\u0018\b\u0001\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0015:\u0002\b\n2\u0018\b\u0001\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0015:\u0002\b\f2\u001c\u0010\r\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000eH\u0007b\u0002\b\u0012¨\u0006\u0016"}, d2 = {"Lcom/samples/interop/dagger/demo/di/TrackingModule$Companion$ProvidesTrackingHandlerMetroFactory$Companion;", "", "<init>", "()V", "create", "Lcom/samples/interop/dagger/demo/di/TrackingModule$Companion$ProvidesTrackingHandlerMetroFactory;", "oldTrackingAdapter", "Ldev/zacsweers/metro/Provider;", "", "Lcom/samples/interop/dagger/demo/tracking/TrackingAdapter;", "Lcom/samples/interop/dagger/demo/tracking/OldTrackingQualifier;", "newTrackingAdapter", "Lcom/samples/interop/dagger/demo/tracking/NewTrackingQualifier;", "trackingTags", "", "Lkotlin/reflect/KClass;", "Lkotlin/Function0;", "Lcom/samples/interop/dagger/demo/tracking/TrackingIdentifier;", "Lkotlin/jvm/JvmStatic;", "providesTrackingHandler", "Lcom/samples/interop/dagger/demo/tracking/TrackingHandler;", "Ljavax/inject/Provider;", "interopDaggerDemo"}, k = 1, mv = {2, 4, 0}, xi = 48)
            public static final class C0131Companion {
                public /* synthetic */ C0131Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @JvmStatic
                public final ProvidesTrackingHandlerMetroFactory create(@OldTrackingQualifier Provider<Set<TrackingAdapter>> oldTrackingAdapter, @NewTrackingQualifier Provider<Set<TrackingAdapter>> newTrackingAdapter, Provider<Map<KClass<?>, Function0<TrackingIdentifier>>> trackingTags) {
                    Intrinsics.checkNotNullParameter(oldTrackingAdapter, "oldTrackingAdapter");
                    Intrinsics.checkNotNullParameter(newTrackingAdapter, "newTrackingAdapter");
                    Intrinsics.checkNotNullParameter(trackingTags, "trackingTags");
                    return new ProvidesTrackingHandlerMetroFactory(oldTrackingAdapter, newTrackingAdapter, trackingTags, null);
                }

                @JvmStatic
                public final TrackingHandler providesTrackingHandler(@OldTrackingQualifier javax.inject.Provider<Set<TrackingAdapter>> oldTrackingAdapter, @NewTrackingQualifier javax.inject.Provider<Set<TrackingAdapter>> newTrackingAdapter, Map<KClass<?>, ? extends Function0<? extends TrackingIdentifier>> trackingTags) {
                    Intrinsics.checkNotNullParameter(oldTrackingAdapter, "oldTrackingAdapter");
                    Intrinsics.checkNotNullParameter(newTrackingAdapter, "newTrackingAdapter");
                    Intrinsics.checkNotNullParameter(trackingTags, "trackingTags");
                    return Companion.$$INSTANCE.providesTrackingHandler(oldTrackingAdapter, newTrackingAdapter, trackingTags);
                }

                private C0131Companion() {
                }
            }
        }

        private Companion() {
        }

        @Provides
        public final TrackingHandler providesTrackingHandler(@OldTrackingQualifier javax.inject.Provider<Set<TrackingAdapter>> oldTrackingAdapter, @NewTrackingQualifier javax.inject.Provider<Set<TrackingAdapter>> newTrackingAdapter, Map<KClass<?>, ? extends Function0<? extends TrackingIdentifier>> trackingTags) {
            Intrinsics.checkNotNullParameter(oldTrackingAdapter, "oldTrackingAdapter");
            Intrinsics.checkNotNullParameter(newTrackingAdapter, "newTrackingAdapter");
            Intrinsics.checkNotNullParameter(trackingTags, "trackingTags");
            return new DefaultTrackingHandler(oldTrackingAdapter, newTrackingAdapter, trackingTags);
        }
    }

    @ClassKey(OldTrackingIdentifier.class)
    @Binds
    @IntoMap
    default TrackingIdentifier providesStringTag(OldTrackingIdentifier instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        throw new IllegalStateException("Never called".toString());
    }
}
