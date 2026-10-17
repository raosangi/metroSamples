package com.samples.dagger.demo.di;

import com.samples.dagger.demo.tracking.DefaultTrackingHandler;
import com.samples.dagger.demo.tracking.NewTrackingQualifier;
import com.samples.dagger.demo.tracking.OldTrackingIdentifier;
import com.samples.dagger.demo.tracking.OldTrackingQualifier;
import com.samples.dagger.demo.tracking.TrackingAdapter;
import com.samples.dagger.demo.tracking.TrackingAdapter2;
import com.samples.dagger.demo.tracking.TrackingAdapter3;
import com.samples.dagger.demo.tracking.TrackingAdapter4;
import com.samples.dagger.demo.tracking.TrackingAdapter5;
import com.samples.dagger.demo.tracking.TrackingAdapter6;
import com.samples.dagger.demo.tracking.TrackingAdapter7;
import com.samples.dagger.demo.tracking.TrackingAdapter8;
import com.samples.dagger.demo.tracking.TrackingAdapter9;
import com.samples.dagger.demo.tracking.TrackingExporter;
import com.samples.dagger.demo.tracking.TrackingHandler;
import com.samples.dagger.demo.tracking.TrackingIdentifier;
import dagger.Binds;
import dagger.BindsOptionalOf;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TrackingModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\bg\u0018\u0000 !2\u00020\u0001:\u0001!J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'b\u0002\b\u0006b\u0002\b\u0007b\u0002\b\bJ\u001c\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\nH'b\u0002\b\u0006b\u0002\b\u0007b\u0002\b\u000bJ\u001c\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\rH'b\u0002\b\u0006b\u0002\b\u0007b\u0002\b\u000bJ\u001c\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000fH'b\u0002\b\u0006b\u0002\b\u0007b\u0002\b\u000bJ\u001c\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0011H'b\u0002\b\u0006b\u0002\b\u0007b\u0002\b\u000bJ\u001c\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0013H'b\u0002\b\u0006b\u0002\b\u0007b\u0002\b\u000bJ\u001c\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0015H'b\u0002\b\u0006b\u0002\b\u0007b\u0002\b\u000bJ\u001c\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0017H'b\u0002\b\u0006b\u0002\b\u0007b\u0002\b\u000bJ\f\u0010\u0018\u001a\u00020\u0019H'b\u0002\b\u001aJ&\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u001dH'b\u0002\b\u0007b\u0002\b\u001eb\f\b\u001f\u0012\b\b \u0012\u0004\b\t0\u001dÊ\u0001\u0002\b#¨\u0006\"À\u0006\u0003"}, d2 = {"Lcom/samples/dagger/demo/di/TrackingModule;", "", "bindsTrackingAdapter2", "Lcom/samples/dagger/demo/tracking/TrackingAdapter;", "instance", "Lcom/samples/dagger/demo/tracking/TrackingAdapter2;", "Ldagger/multibindings/IntoSet;", "Ldagger/Binds;", "Lcom/samples/dagger/demo/tracking/OldTrackingQualifier;", "bindsTrackingAdapter3", "Lcom/samples/dagger/demo/tracking/TrackingAdapter3;", "Lcom/samples/dagger/demo/tracking/NewTrackingQualifier;", "bindsTrackingAdapter4", "Lcom/samples/dagger/demo/tracking/TrackingAdapter4;", "bindsTrackingAdapter5", "Lcom/samples/dagger/demo/tracking/TrackingAdapter5;", "bindsTrackingAdapter6", "Lcom/samples/dagger/demo/tracking/TrackingAdapter6;", "bindsTrackingAdapter7", "Lcom/samples/dagger/demo/tracking/TrackingAdapter7;", "bindsTrackingAdapter8", "Lcom/samples/dagger/demo/tracking/TrackingAdapter8;", "bindsTrackingAdapter9", "Lcom/samples/dagger/demo/tracking/TrackingAdapter9;", "bindsOptionalOf", "Lcom/samples/dagger/demo/tracking/TrackingExporter;", "Ldagger/BindsOptionalOf;", "providesStringTag", "Lcom/samples/dagger/demo/tracking/TrackingIdentifier;", "Lcom/samples/dagger/demo/tracking/OldTrackingIdentifier;", "Ldagger/multibindings/IntoMap;", "Ldagger/multibindings/ClassKey;", "value", "Companion", "daggerDemo", "Ldagger/Module;"}, k = 1, mv = {2, 4, 0}, xi = 48)
@Module
public interface TrackingModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @BindsOptionalOf
    TrackingExporter bindsOptionalOf();

    @OldTrackingQualifier
    @Binds
    @IntoSet
    TrackingAdapter bindsTrackingAdapter2(TrackingAdapter2 instance);

    @Binds
    @NewTrackingQualifier
    @IntoSet
    TrackingAdapter bindsTrackingAdapter3(TrackingAdapter3 instance);

    @Binds
    @NewTrackingQualifier
    @IntoSet
    TrackingAdapter bindsTrackingAdapter4(TrackingAdapter4 instance);

    @Binds
    @NewTrackingQualifier
    @IntoSet
    TrackingAdapter bindsTrackingAdapter5(TrackingAdapter5 instance);

    @Binds
    @NewTrackingQualifier
    @IntoSet
    TrackingAdapter bindsTrackingAdapter6(TrackingAdapter6 instance);

    @Binds
    @NewTrackingQualifier
    @IntoSet
    TrackingAdapter bindsTrackingAdapter7(TrackingAdapter7 instance);

    @Binds
    @NewTrackingQualifier
    @IntoSet
    TrackingAdapter bindsTrackingAdapter8(TrackingAdapter8 instance);

    @Binds
    @NewTrackingQualifier
    @IntoSet
    TrackingAdapter bindsTrackingAdapter9(TrackingAdapter9 instance);

    @ClassKey(OldTrackingIdentifier.class)
    @Binds
    @IntoMap
    TrackingIdentifier providesStringTag(OldTrackingIdentifier instance);

    /* JADX INFO: compiled from: TrackingModule.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jm\u0010\u0004\u001a\u00020\u00052\u001d\b\u0001\u0010\u0006\u001a\u0013\u0012\u000f\u0012\r\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n0\b0\u0007:\u0002\b\u000b2\u001d\b\u0001\u0010\f\u001a\u0013\u0012\u000f\u0012\r\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n0\b0\u0007:\u0002\b\r2!\u0010\u000e\u001a\u001d\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00110\u0007¢\u0006\u0002\b\n0\u000fH\u0007b\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/samples/dagger/demo/di/TrackingModule$Companion;", "", "<init>", "()V", "providesTrackingHandler", "Lcom/samples/dagger/demo/tracking/TrackingHandler;", "oldTrackingAdapter", "Ljavax/inject/Provider;", "", "Lcom/samples/dagger/demo/tracking/TrackingAdapter;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/samples/dagger/demo/tracking/OldTrackingQualifier;", "newTrackingAdapter", "Lcom/samples/dagger/demo/tracking/NewTrackingQualifier;", "trackingTags", "", "Ljava/lang/Class;", "Lcom/samples/dagger/demo/tracking/TrackingIdentifier;", "Ldagger/Provides;", "daggerDemo"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Provides
        public final TrackingHandler providesTrackingHandler(@OldTrackingQualifier Provider<Set<TrackingAdapter>> oldTrackingAdapter, @NewTrackingQualifier Provider<Set<TrackingAdapter>> newTrackingAdapter, Map<Class<?>, Provider<TrackingIdentifier>> trackingTags) {
            Intrinsics.checkNotNullParameter(oldTrackingAdapter, "oldTrackingAdapter");
            Intrinsics.checkNotNullParameter(newTrackingAdapter, "newTrackingAdapter");
            Intrinsics.checkNotNullParameter(trackingTags, "trackingTags");
            return new DefaultTrackingHandler(oldTrackingAdapter, newTrackingAdapter, trackingTags);
        }
    }
}
