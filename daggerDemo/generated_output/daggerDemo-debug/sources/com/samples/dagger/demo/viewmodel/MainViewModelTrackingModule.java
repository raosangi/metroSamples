package com.samples.dagger.demo.viewmodel;

import com.samples.dagger.demo.network.MainScreenDetailHandler;
import com.samples.dagger.demo.network.ScreenDetailHandler;
import com.samples.dagger.demo.tracking.MainActivityTrackingAdapter;
import com.samples.dagger.demo.tracking.TrackingAdapter;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import dagger.multibindings.StringKey;
import kotlin.Metadata;

/* JADX INFO: compiled from: MainViewModelSubcomponent.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'b\u0002\b\u0006b\u0002\b\u0007J&\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\nH'b\u0002\b\u000bb\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000eb\u0002\b\u0007Ê\u0001\u0002\b\u0010¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/samples/dagger/demo/viewmodel/MainViewModelTrackingModule;", "", "bindsTrackingAdapter3", "Lcom/samples/dagger/demo/tracking/TrackingAdapter;", "instance", "Lcom/samples/dagger/demo/tracking/MainActivityTrackingAdapter;", "Ldagger/multibindings/IntoSet;", "Ldagger/Binds;", "bindsMainScreenDetailHandler", "Lcom/samples/dagger/demo/network/ScreenDetailHandler;", "Lcom/samples/dagger/demo/network/MainScreenDetailHandler;", "Ldagger/multibindings/IntoMap;", "Ldagger/multibindings/StringKey;", "value", "Main", "daggerDemo", "Ldagger/Module;"}, k = 1, mv = {2, 4, 0}, xi = 48)
@Module
public interface MainViewModelTrackingModule {
    @Binds
    @IntoMap
    @StringKey("Main")
    ScreenDetailHandler bindsMainScreenDetailHandler(MainScreenDetailHandler instance);

    @Binds
    @IntoSet
    TrackingAdapter bindsTrackingAdapter3(MainActivityTrackingAdapter instance);
}
