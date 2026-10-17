package com.samples.dagger.demo.di;

import dagger.Component;
import javax.inject.Singleton;
import kotlin.Metadata;

/* JADX INFO: compiled from: AppComponent.kt */
/* JADX INFO: loaded from: classes6.dex */
@Component(modules = {ErrorModule.class, TrackingModule.class, DataSourceModule.class})
@Singleton
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005Ê\u0001\u0002\b\u0007Ê\u0001\u001c\b\b\u0012\u0018\b\t\u0012\u0014\b\fJ\u0004\b\t0\nJ\u0004\b\t0\u000bJ\u0004\b\t0\f¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/samples/dagger/demo/di/AppComponent;", "", "mainActivitySubComponentFactory", "Lcom/samples/dagger/demo/di/MainActivitySubComponent$Factory;", "getMainActivitySubComponentFactory", "()Lcom/samples/dagger/demo/di/MainActivitySubComponent$Factory;", "daggerDemo", "Ljavax/inject/Singleton;", "Ldagger/Component;", "modules", "Lcom/samples/dagger/demo/di/ErrorModule;", "Lcom/samples/dagger/demo/di/TrackingModule;", "Lcom/samples/dagger/demo/di/DataSourceModule;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface AppComponent {
    MainActivitySubComponent.Factory getMainActivitySubComponentFactory();
}
