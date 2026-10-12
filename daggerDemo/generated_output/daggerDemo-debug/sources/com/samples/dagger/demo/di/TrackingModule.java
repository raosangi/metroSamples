package com.samples.dagger.demo.di;

import com.samples.dagger.demo.tracking.DefaultTrackingHandler;
import com.samples.dagger.demo.tracking.TrackingAdapter;
import com.samples.dagger.demo.tracking.TrackingAdapter2;
import com.samples.dagger.demo.tracking.TrackingAdapter3;
import com.samples.dagger.demo.tracking.TrackingHandler;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import kotlin.Metadata;

/* JADX INFO: compiled from: TrackingModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\bg\u0018\u0000 \r2\u00020\u0001:\u0001\rJ\u0014\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'b\u0002\b\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\tH'b\u0002\b\nb\u0002\b\u0006J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\fH'b\u0002\b\nb\u0002\b\u0006Ê\u0001\u0002\b\u000f¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/samples/dagger/demo/di/TrackingModule;", "", "bindsTrackingHandler", "Lcom/samples/dagger/demo/tracking/TrackingHandler;", "instance", "Lcom/samples/dagger/demo/tracking/DefaultTrackingHandler;", "Ldagger/Binds;", "bindsTrackingAdapter2", "Lcom/samples/dagger/demo/tracking/TrackingAdapter;", "Lcom/samples/dagger/demo/tracking/TrackingAdapter2;", "Ldagger/multibindings/IntoSet;", "bindsTrackingAdapter3", "Lcom/samples/dagger/demo/tracking/TrackingAdapter3;", "Companion", "daggerDemo", "Ldagger/Module;"}, k = 1, mv = {2, 4, 0}, xi = 48)
@Module
public interface TrackingModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Binds
    @IntoSet
    TrackingAdapter bindsTrackingAdapter2(TrackingAdapter2 instance);

    @Binds
    @IntoSet
    TrackingAdapter bindsTrackingAdapter3(TrackingAdapter3 instance);

    @Binds
    TrackingHandler bindsTrackingHandler(DefaultTrackingHandler instance);

    /* JADX INFO: compiled from: TrackingModule.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u0001H\u0007b\u0002\b\u0005b\u0002\b\u0006b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¨\u0006\n"}, d2 = {"Lcom/samples/dagger/demo/di/TrackingModule$Companion;", "", "<init>", "()V", "providesStringTag", "Ldagger/Provides;", "Ldagger/multibindings/IntoMap;", "Ldagger/multibindings/ClassKey;", "value", "", "daggerDemo"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Provides
        @ClassKey(String.class)
        @IntoMap
        public final Object providesStringTag() {
            return "TrackingTag";
        }
    }
}
