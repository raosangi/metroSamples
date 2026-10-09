package com.samples.dagger.demo.di;

import com.samples.dagger.demo.tracking.DefaultTrackingHandler;
import com.samples.dagger.demo.tracking.TrackingAdapter;
import com.samples.dagger.demo.tracking.TrackingAdapter2;
import com.samples.dagger.demo.tracking.TrackingAdapter3;
import com.samples.dagger.demo.tracking.TrackingHandler;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoSet;
import kotlin.Metadata;

/* JADX INFO: compiled from: TrackingModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'b\u0002\b\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\tH'b\u0002\b\nb\u0002\b\u0006J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\fH'b\u0002\b\nb\u0002\b\u0006Ê\u0001\u0002\b\u000e¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/samples/dagger/demo/di/TrackingModule;", "", "bindsTrackingHandler", "Lcom/samples/dagger/demo/tracking/TrackingHandler;", "instance", "Lcom/samples/dagger/demo/tracking/DefaultTrackingHandler;", "Ldagger/Binds;", "bindsTrackingAdapter2", "Lcom/samples/dagger/demo/tracking/TrackingAdapter;", "Lcom/samples/dagger/demo/tracking/TrackingAdapter2;", "Ldagger/multibindings/IntoSet;", "bindsTrackingAdapter3", "Lcom/samples/dagger/demo/tracking/TrackingAdapter3;", "daggerDemo", "Ldagger/Module;"}, k = 1, mv = {2, 4, 0}, xi = 48)
@Module
public interface TrackingModule {
    @Binds
    @IntoSet
    TrackingAdapter bindsTrackingAdapter2(TrackingAdapter2 instance);

    @Binds
    @IntoSet
    TrackingAdapter bindsTrackingAdapter3(TrackingAdapter3 instance);

    @Binds
    TrackingHandler bindsTrackingHandler(DefaultTrackingHandler instance);
}
