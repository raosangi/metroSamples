package com.samples.dagger.demo.di;

import com.samples.dagger.demo.network.AppScreenDetailHandler;
import com.samples.dagger.demo.network.DataSource;
import com.samples.dagger.demo.network.DefaultDataSource;
import com.samples.dagger.demo.network.ScreenDetailHandler;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import kotlin.Metadata;

/* JADX INFO: compiled from: DataSourceModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'b\u0002\b\u0006J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\tH'b\u0002\b\nb\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\rb\u0002\b\u0006Ê\u0001\u0002\b\u000f¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/samples/dagger/demo/di/DataSourceModule;", "", "bindsDefaultDataSource", "Lcom/samples/dagger/demo/network/DataSource;", "instance", "Lcom/samples/dagger/demo/network/DefaultDataSource;", "Ldagger/Binds;", "bindsAppScreenDetailHandler", "Lcom/samples/dagger/demo/network/ScreenDetailHandler;", "Lcom/samples/dagger/demo/network/AppScreenDetailHandler;", "Ldagger/multibindings/IntoMap;", "Ldagger/multibindings/StringKey;", "value", "App", "daggerDemo", "Ldagger/Module;"}, k = 1, mv = {2, 4, 0}, xi = 48)
@Module
public interface DataSourceModule {
    @Binds
    @IntoMap
    @StringKey("App")
    ScreenDetailHandler bindsAppScreenDetailHandler(AppScreenDetailHandler instance);

    @Binds
    DataSource bindsDefaultDataSource(DefaultDataSource instance);
}
