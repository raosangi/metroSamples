package com.samples.metro.demo.di;

import com.samples.metro.demo.tracking.DefaultTrackingHandler;
import com.samples.metro.demo.tracking.NewTrackingQualifier;
import com.samples.metro.demo.tracking.OldTrackingIdentifier;
import com.samples.metro.demo.tracking.OldTrackingQualifier;
import com.samples.metro.demo.tracking.TrackingAdapter;
import com.samples.metro.demo.tracking.TrackingAdapter2;
import com.samples.metro.demo.tracking.TrackingAdapter3;
import com.samples.metro.demo.tracking.TrackingAdapter4;
import com.samples.metro.demo.tracking.TrackingAdapter5;
import com.samples.metro.demo.tracking.TrackingAdapter6;
import com.samples.metro.demo.tracking.TrackingAdapter7;
import com.samples.metro.demo.tracking.TrackingAdapter8;
import com.samples.metro.demo.tracking.TrackingAdapter9;
import com.samples.metro.demo.tracking.TrackingHandler;
import com.samples.metro.demo.tracking.TrackingIdentifier;
import dev.zacsweers.metro.BindingContainer;
import dev.zacsweers.metro.Binds;
import dev.zacsweers.metro.ClassKey;
import dev.zacsweers.metro.IntoMap;
import dev.zacsweers.metro.IntoSet;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.Provides;
import dev.zacsweers.metro.internal.CallableMetadata;
import dev.zacsweers.metro.internal.Factory;
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
/* JADX INFO: loaded from: classes8.dex */
@BindingContainer
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bg\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eJ\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'b\u0002\b\u0006b\u0002\b\u0007b\u0002\b\bJ\u001c\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\nH'b\u0002\b\u0006b\u0002\b\u0007b\u0002\b\u000bJ\u001c\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\rH'b\u0002\b\u0006b\u0002\b\u0007b\u0002\b\u000bJ\u001c\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000fH'b\u0002\b\u0006b\u0002\b\u0007b\u0002\b\u000bJ\u001c\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0011H'b\u0002\b\u0006b\u0002\b\u0007b\u0002\b\u000bJ\u001c\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0013H'b\u0002\b\u0006b\u0002\b\u0007b\u0002\b\u000bJ\u001c\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0015H'b\u0002\b\u0006b\u0002\b\u0007b\u0002\b\u000bJ\u001c\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0017H'b\u0002\b\u0006b\u0002\b\u0007b\u0002\b\u000bJ\u001c\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u001aH'b\u0002\b\u0007b\u0002\b\u001bb\u0002\b\u001cÊ\u0001\u0002\b \u008a\u0002\u0097\u0001\b!\u0012\u0092\u0001\b\u0001\u0012\u008d\u0001\u0012\u008a\u0001\nVcom/samples/metro/demo/di/TrackingModule.Companion.ProvidesTrackingHandlerMetroFactory\"\u0017providesTrackingHandler2\u0017providesTrackingHandler¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lcom/samples/metro/demo/di/TrackingModule;", "", "bindsTrackingAdapter2", "Lcom/samples/metro/demo/tracking/TrackingAdapter;", "instance", "Lcom/samples/metro/demo/tracking/TrackingAdapter2;", "Ldev/zacsweers/metro/IntoSet;", "Ldev/zacsweers/metro/Binds;", "Lcom/samples/metro/demo/tracking/OldTrackingQualifier;", "bindsTrackingAdapter3", "Lcom/samples/metro/demo/tracking/TrackingAdapter3;", "Lcom/samples/metro/demo/tracking/NewTrackingQualifier;", "bindsTrackingAdapter4", "Lcom/samples/metro/demo/tracking/TrackingAdapter4;", "bindsTrackingAdapter5", "Lcom/samples/metro/demo/tracking/TrackingAdapter5;", "bindsTrackingAdapter6", "Lcom/samples/metro/demo/tracking/TrackingAdapter6;", "bindsTrackingAdapter7", "Lcom/samples/metro/demo/tracking/TrackingAdapter7;", "bindsTrackingAdapter8", "Lcom/samples/metro/demo/tracking/TrackingAdapter8;", "bindsTrackingAdapter9", "Lcom/samples/metro/demo/tracking/TrackingAdapter9;", "providesStringTag", "Lcom/samples/metro/demo/tracking/TrackingIdentifier;", "Lcom/samples/metro/demo/tracking/OldTrackingIdentifier;", "Ldev/zacsweers/metro/IntoMap;", "Ldev/zacsweers/metro/ClassKey;", "Companion", "BindsMirror", "metroDemo", "Ldev/zacsweers/metro/BindingContainer;", "dev.zacsweers.metro.compiler"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface TrackingModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: TrackingModule.kt */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JJ\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007b\u0002\b\bb\u0002\b\tb\u0002\b\nb,\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\t\b\u0010\u0012\u0005\b\u0003\u0010¸\u0013\u0012\t\b\u0011\u0012\u0005\b\u0003\u0010Æ\u0014JJ\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0013H\u0007b\u0002\b\bb\u0002\b\tb\u0002\b\u0014b,\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0015\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\t\b\u0010\u0012\u0005\b\u0003\u0010¦\u0015\u0012\t\b\u0011\u0012\u0005\b\u0003\u0010´\u0016JJ\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0017H\u0007b\u0002\b\bb\u0002\b\tb\u0002\b\u0014b,\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0018\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\t\b\u0010\u0012\u0005\b\u0003\u0010\u0094\u0017\u0012\t\b\u0011\u0012\u0005\b\u0003\u0010¢\u0018JJ\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u001aH\u0007b\u0002\b\bb\u0002\b\tb\u0002\b\u0014b,\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u001b\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\t\b\u0010\u0012\u0005\b\u0003\u0010\u0082\u0019\u0012\t\b\u0011\u0012\u0005\b\u0003\u0010\u0090\u001aJJ\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u001dH\u0007b\u0002\b\bb\u0002\b\tb\u0002\b\u0014b,\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u001e\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\t\b\u0010\u0012\u0005\b\u0003\u0010ð\u001a\u0012\t\b\u0011\u0012\u0005\b\u0003\u0010þ\u001bJJ\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020 H\u0007b\u0002\b\bb\u0002\b\tb\u0002\b\u0014b,\b\u000b\u0012\b\b\f\u0012\u0004\b\b(!\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\t\b\u0010\u0012\u0005\b\u0003\u0010Þ\u001c\u0012\t\b\u0011\u0012\u0005\b\u0003\u0010ì\u001dJJ\u0010\"\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020#H\u0007b\u0002\b\bb\u0002\b\tb\u0002\b\u0014b,\b\u000b\u0012\b\b\f\u0012\u0004\b\b($\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\t\b\u0010\u0012\u0005\b\u0003\u0010Ì\u001e\u0012\t\b\u0011\u0012\u0005\b\u0003\u0010Ú\u001fJJ\u0010%\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020&H\u0007b\u0002\b\bb\u0002\b\tb\u0002\b\u0014b,\b\u000b\u0012\b\b\f\u0012\u0004\b\b('\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\t\b\u0010\u0012\u0005\b\u0003\u0010º \u0012\t\b\u0011\u0012\u0005\b\u0003\u0010È!JT\u0010(\u001a\u00020)2\u0006\u0010\u0006\u001a\u00020*H\u0007b\u0002\b\bb\u0002\b+b\f\b,\u0012\b\b-\u0012\u0004\b\t0*b,\b\u000b\u0012\b\b\f\u0012\u0004\b\b(.\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\t\b\u0010\u0012\u0005\b\u0003\u0010¢\"\u0012\t\b\u0011\u0012\u0005\b\u0003\u0010¶#Ê\u0001\u0018\b0\u0012\b\b1\u0012\u0004\b\b(2\u0012\n\b3\u0012\u0006\b\n0485Ê\u0001\f\b6\u0012\b\b7\u0012\u0004\b\u0003\u0010\u0000¨\u0006/"}, d2 = {"Lcom/samples/metro/demo/di/TrackingModule$BindsMirror;", "", "<init>", "()V", "bindsTrackingAdapter23118754638_intoset", "Lcom/samples/metro/demo/tracking/TrackingAdapter;", "instance", "Lcom/samples/metro/demo/tracking/TrackingAdapter2;", "Ldev/zacsweers/metro/Binds;", "Ldev/zacsweers/metro/IntoSet;", "Lcom/samples/metro/demo/tracking/OldTrackingQualifier;", "Ldev/zacsweers/metro/internal/CallableMetadata;", "callableName", "bindsTrackingAdapter2", "propertyName", "", "startOffset", "endOffset", "bindsTrackingAdapter32609109639_intoset", "Lcom/samples/metro/demo/tracking/TrackingAdapter3;", "Lcom/samples/metro/demo/tracking/NewTrackingQualifier;", "bindsTrackingAdapter3", "bindsTrackingAdapter42609109639_intoset", "Lcom/samples/metro/demo/tracking/TrackingAdapter4;", "bindsTrackingAdapter4", "bindsTrackingAdapter52609109639_intoset", "Lcom/samples/metro/demo/tracking/TrackingAdapter5;", "bindsTrackingAdapter5", "bindsTrackingAdapter62609109639_intoset", "Lcom/samples/metro/demo/tracking/TrackingAdapter6;", "bindsTrackingAdapter6", "bindsTrackingAdapter72609109639_intoset", "Lcom/samples/metro/demo/tracking/TrackingAdapter7;", "bindsTrackingAdapter7", "bindsTrackingAdapter82609109639_intoset", "Lcom/samples/metro/demo/tracking/TrackingAdapter8;", "bindsTrackingAdapter8", "bindsTrackingAdapter92609109639_intoset", "Lcom/samples/metro/demo/tracking/TrackingAdapter9;", "bindsTrackingAdapter9", "providesStringTag1374225297_intomap", "Lcom/samples/metro/demo/tracking/TrackingIdentifier;", "Lcom/samples/metro/demo/tracking/OldTrackingIdentifier;", "Ldev/zacsweers/metro/IntoMap;", "Ldev/zacsweers/metro/ClassKey;", "value", "providesStringTag", "metroDemo", "Lkotlin/Deprecated;", "message", "This synthesized declaration should not be used directly", "level", "Lkotlin/DeprecationLevel;", "HIDDEN", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static abstract class BindsMirror {
        public static final int $stable = 8;

        private BindsMirror() {
        }

        @OldTrackingQualifier
        @Binds
        @IntoSet
        @CallableMetadata(callableName = "bindsTrackingAdapter2", endOffset = 1315, propertyName = "", startOffset = 1244)
        public final TrackingAdapter bindsTrackingAdapter23118754638_intoset(TrackingAdapter2 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            throw new IllegalStateException("Never called".toString());
        }

        @Binds
        @IntoSet
        @NewTrackingQualifier
        @CallableMetadata(callableName = "bindsTrackingAdapter3", endOffset = 1434, propertyName = "", startOffset = 1363)
        public final TrackingAdapter bindsTrackingAdapter32609109639_intoset(TrackingAdapter3 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            throw new IllegalStateException("Never called".toString());
        }

        @Binds
        @IntoSet
        @NewTrackingQualifier
        @CallableMetadata(callableName = "bindsTrackingAdapter4", endOffset = 1553, propertyName = "", startOffset = 1482)
        public final TrackingAdapter bindsTrackingAdapter42609109639_intoset(TrackingAdapter4 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            throw new IllegalStateException("Never called".toString());
        }

        @Binds
        @IntoSet
        @NewTrackingQualifier
        @CallableMetadata(callableName = "bindsTrackingAdapter5", endOffset = 1672, propertyName = "", startOffset = 1601)
        public final TrackingAdapter bindsTrackingAdapter52609109639_intoset(TrackingAdapter5 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            throw new IllegalStateException("Never called".toString());
        }

        @Binds
        @IntoSet
        @NewTrackingQualifier
        @CallableMetadata(callableName = "bindsTrackingAdapter6", endOffset = 1791, propertyName = "", startOffset = 1720)
        public final TrackingAdapter bindsTrackingAdapter62609109639_intoset(TrackingAdapter6 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            throw new IllegalStateException("Never called".toString());
        }

        @Binds
        @IntoSet
        @NewTrackingQualifier
        @CallableMetadata(callableName = "bindsTrackingAdapter7", endOffset = 1910, propertyName = "", startOffset = 1839)
        public final TrackingAdapter bindsTrackingAdapter72609109639_intoset(TrackingAdapter7 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            throw new IllegalStateException("Never called".toString());
        }

        @Binds
        @IntoSet
        @NewTrackingQualifier
        @CallableMetadata(callableName = "bindsTrackingAdapter8", endOffset = 2029, propertyName = "", startOffset = 1958)
        public final TrackingAdapter bindsTrackingAdapter82609109639_intoset(TrackingAdapter8 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            throw new IllegalStateException("Never called".toString());
        }

        @Binds
        @IntoSet
        @NewTrackingQualifier
        @CallableMetadata(callableName = "bindsTrackingAdapter9", endOffset = 2148, propertyName = "", startOffset = 2077)
        public final TrackingAdapter bindsTrackingAdapter92609109639_intoset(TrackingAdapter9 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            throw new IllegalStateException("Never called".toString());
        }

        @Binds
        @ClassKey(OldTrackingIdentifier.class)
        @IntoMap
        @CallableMetadata(callableName = "providesStringTag", endOffset = 2267, propertyName = "", startOffset = 2193)
        public final TrackingIdentifier providesStringTag1374225297_intomap(OldTrackingIdentifier instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            throw new IllegalStateException("Never called".toString());
        }
    }

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

        @Binds
        @IntoSet
        @Deprecated
        @NewTrackingQualifier
        public static TrackingAdapter bindsTrackingAdapter3(TrackingModule $this, TrackingAdapter3 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            return TrackingModule.super.bindsTrackingAdapter3(instance);
        }

        @Binds
        @IntoSet
        @Deprecated
        @NewTrackingQualifier
        public static TrackingAdapter bindsTrackingAdapter4(TrackingModule $this, TrackingAdapter4 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            return TrackingModule.super.bindsTrackingAdapter4(instance);
        }

        @Binds
        @IntoSet
        @Deprecated
        @NewTrackingQualifier
        public static TrackingAdapter bindsTrackingAdapter5(TrackingModule $this, TrackingAdapter5 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            return TrackingModule.super.bindsTrackingAdapter5(instance);
        }

        @Binds
        @IntoSet
        @Deprecated
        @NewTrackingQualifier
        public static TrackingAdapter bindsTrackingAdapter6(TrackingModule $this, TrackingAdapter6 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            return TrackingModule.super.bindsTrackingAdapter6(instance);
        }

        @Binds
        @IntoSet
        @Deprecated
        @NewTrackingQualifier
        public static TrackingAdapter bindsTrackingAdapter7(TrackingModule $this, TrackingAdapter7 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            return TrackingModule.super.bindsTrackingAdapter7(instance);
        }

        @Binds
        @IntoSet
        @Deprecated
        @NewTrackingQualifier
        public static TrackingAdapter bindsTrackingAdapter8(TrackingModule $this, TrackingAdapter8 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            return TrackingModule.super.bindsTrackingAdapter8(instance);
        }

        @Binds
        @IntoSet
        @Deprecated
        @NewTrackingQualifier
        public static TrackingAdapter bindsTrackingAdapter9(TrackingModule $this, TrackingAdapter9 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            return TrackingModule.super.bindsTrackingAdapter9(instance);
        }

        @Binds
        @ClassKey
        @Deprecated
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

    /* JADX INFO: compiled from: TrackingModule.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jh\u0010\u0004\u001a\u00020\u00052\u001d\b\u0001\u0010\u0006\u001a\u0013\u0012\u000f\u0012\r\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n0\b0\u0007:\u0002\b\u000b2\u001d\b\u0001\u0010\f\u001a\u0013\u0012\u000f\u0012\r\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n0\b0\u0007:\u0002\b\r2\u001c\u0010\u000e\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070\u000fH\u0007b\u0002\b\u0012\u008a\u0002\u0097\u0001\b\u0015\u0012\u0092\u0001\b\u0001\u0012\u008d\u0001\u0012\u008a\u0001\nVcom/samples/metro/demo/di/TrackingModule.Companion.ProvidesTrackingHandlerMetroFactory\"\u0017providesTrackingHandler2\u0017providesTrackingHandler¨\u0006\u0014"}, d2 = {"Lcom/samples/metro/demo/di/TrackingModule$Companion;", "", "<init>", "()V", "providesTrackingHandler", "Lcom/samples/metro/demo/tracking/TrackingHandler;", "oldTrackingAdapter", "Lkotlin/Function0;", "", "Lcom/samples/metro/demo/tracking/TrackingAdapter;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/samples/metro/demo/tracking/OldTrackingQualifier;", "newTrackingAdapter", "Lcom/samples/metro/demo/tracking/NewTrackingQualifier;", "trackingTags", "", "Lkotlin/reflect/KClass;", "Lcom/samples/metro/demo/tracking/TrackingIdentifier;", "Ldev/zacsweers/metro/Provides;", "ProvidesTrackingHandlerMetroFactory", "metroDemo", "dev.zacsweers.metro.compiler"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX INFO: compiled from: TrackingModule.kt */
        @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011J^\u0010\u0002\u001a\u00020\u00032\u0018\b\u0001\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005:\u0002\b\b2\u0018\b\u0001\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005:\u0002\b\n2\u001c\u0010\u000b\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\fH\u0007b\u0002\b\u000fJ\b\u0010\u0010\u001a\u00020\u0003H\u0007Ê\u0001\u0018\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\n\b\u0016\u0012\u0006\b\n0\u00178\u0018Ê\u00016\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\t\b\u001e\u0012\u0005\b\u0003\u0010ø#\u0012\t\b\u001f\u0012\u0005\b\u0003\u0010è*\u0012\b\b \u0012\u0004\b\b(\u001bÊ\u0001\f\b!\u0012\b\b\"\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0012"}, d2 = {"Lcom/samples/metro/demo/di/TrackingModule$Companion$ProvidesTrackingHandlerMetroFactory;", "", "declarationMirror", "Lcom/samples/metro/demo/tracking/TrackingHandler;", "oldTrackingAdapter", "Lkotlin/Function0;", "", "Lcom/samples/metro/demo/tracking/TrackingAdapter;", "Lcom/samples/metro/demo/tracking/OldTrackingQualifier;", "newTrackingAdapter", "Lcom/samples/metro/demo/tracking/NewTrackingQualifier;", "trackingTags", "", "Lkotlin/reflect/KClass;", "Lcom/samples/metro/demo/tracking/TrackingIdentifier;", "Ldev/zacsweers/metro/internal/ComptimeOnly;", "invoke", "Companion", "metroDemo", "Lkotlin/Deprecated;", "message", "This synthesized declaration should not be used directly", "level", "Lkotlin/DeprecationLevel;", "HIDDEN", "Ldev/zacsweers/metro/internal/CallableMetadata;", "callableName", "providesTrackingHandler", "propertyName", "", "startOffset", "endOffset", "newInstanceName", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        @CallableMetadata(callableName = "providesTrackingHandler", endOffset = 2740, newInstanceName = "providesTrackingHandler", propertyName = "", startOffset = 2300)
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
            public static final TrackingHandler providesTrackingHandler(@OldTrackingQualifier Function0<? extends Set<TrackingAdapter>> function0, @NewTrackingQualifier Function0<? extends Set<TrackingAdapter>> function1, Map<KClass<?>, ? extends Function0<? extends TrackingIdentifier>> map) {
                return Companion.providesTrackingHandler(function0, function1, map);
            }

            public final TrackingHandler declarationMirror(@OldTrackingQualifier Function0<? extends Set<TrackingAdapter>> oldTrackingAdapter, @NewTrackingQualifier Function0<? extends Set<TrackingAdapter>> newTrackingAdapter, Map<KClass<?>, ? extends Function0<? extends TrackingIdentifier>> trackingTags) {
                Intrinsics.checkNotNullParameter(oldTrackingAdapter, "oldTrackingAdapter");
                Intrinsics.checkNotNullParameter(newTrackingAdapter, "newTrackingAdapter");
                Intrinsics.checkNotNullParameter(trackingTags, "trackingTags");
                throw new IllegalStateException("Never called".toString());
            }

            @Override // dev.zacsweers.metro.Provider, kotlin.jvm.functions.Function0
            public final TrackingHandler invoke() {
                return Companion.providesTrackingHandler(this.oldTrackingAdapter, this.newTrackingAdapter, this.trackingTags.invoke());
            }

            /* JADX INFO: renamed from: com.samples.metro.demo.di.TrackingModule$Companion$ProvidesTrackingHandlerMetroFactory$Companion, reason: collision with other inner class name */
            /* JADX INFO: compiled from: TrackingModule.kt */
            @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jd\u0010\u0004\u001a\u00020\u00052\u0018\b\u0001\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007:\u0002\b\n2\u0018\b\u0001\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007:\u0002\b\f2\"\u0010\r\u001a\u001e\u0012\u001a\u0012\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000e0\u0007H\u0007b\u0002\b\u0012J^\u0010\u0013\u001a\u00020\u00142\u0018\b\u0001\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0010:\u0002\b\n2\u0018\b\u0001\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0010:\u0002\b\f2\u001c\u0010\r\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000eH\u0007b\u0002\b\u0012¨\u0006\u0015"}, d2 = {"Lcom/samples/metro/demo/di/TrackingModule$Companion$ProvidesTrackingHandlerMetroFactory$Companion;", "", "<init>", "()V", "create", "Lcom/samples/metro/demo/di/TrackingModule$Companion$ProvidesTrackingHandlerMetroFactory;", "oldTrackingAdapter", "Ldev/zacsweers/metro/Provider;", "", "Lcom/samples/metro/demo/tracking/TrackingAdapter;", "Lcom/samples/metro/demo/tracking/OldTrackingQualifier;", "newTrackingAdapter", "Lcom/samples/metro/demo/tracking/NewTrackingQualifier;", "trackingTags", "", "Lkotlin/reflect/KClass;", "Lkotlin/Function0;", "Lcom/samples/metro/demo/tracking/TrackingIdentifier;", "Lkotlin/jvm/JvmStatic;", "providesTrackingHandler", "Lcom/samples/metro/demo/tracking/TrackingHandler;", "metroDemo"}, k = 1, mv = {2, 4, 0}, xi = 48)
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
                public final TrackingHandler providesTrackingHandler(@OldTrackingQualifier Function0<? extends Set<TrackingAdapter>> oldTrackingAdapter, @NewTrackingQualifier Function0<? extends Set<TrackingAdapter>> newTrackingAdapter, Map<KClass<?>, ? extends Function0<? extends TrackingIdentifier>> trackingTags) {
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
        public final TrackingHandler providesTrackingHandler(@OldTrackingQualifier Function0<? extends Set<TrackingAdapter>> oldTrackingAdapter, @NewTrackingQualifier Function0<? extends Set<TrackingAdapter>> newTrackingAdapter, Map<KClass<?>, ? extends Function0<? extends TrackingIdentifier>> trackingTags) {
            Intrinsics.checkNotNullParameter(oldTrackingAdapter, "oldTrackingAdapter");
            Intrinsics.checkNotNullParameter(newTrackingAdapter, "newTrackingAdapter");
            Intrinsics.checkNotNullParameter(trackingTags, "trackingTags");
            return new DefaultTrackingHandler(oldTrackingAdapter, newTrackingAdapter, trackingTags);
        }
    }

    @Binds
    @ClassKey
    @IntoMap
    default TrackingIdentifier providesStringTag(OldTrackingIdentifier instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        throw new IllegalStateException("Never called".toString());
    }
}
