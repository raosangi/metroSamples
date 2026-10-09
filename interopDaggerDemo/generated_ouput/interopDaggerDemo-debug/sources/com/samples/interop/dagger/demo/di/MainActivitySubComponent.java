package com.samples.interop.dagger.demo.di;

import com.samples.interop.dagger.demo.MainActivity;
import com.samples.interop.dagger.demo.viewmodel.MainViewModelSubcomponent;
import dagger.Subcomponent;
import kotlin.Metadata;

/* JADX INFO: compiled from: MainActivitySubcomponent.kt */
/* JADX INFO: loaded from: classes3.dex */
@Subcomponent
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\bg\u0018\u00002\u00020\u0001:\u0001\nJ\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005Ê\u0001\u0002\b\f¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/samples/interop/dagger/demo/di/MainActivitySubComponent;", "", "mainActivitySubComponentFactory", "Lcom/samples/interop/dagger/demo/viewmodel/MainViewModelSubcomponent$Factory;", "getMainActivitySubComponentFactory", "()Lcom/samples/interop/dagger/demo/viewmodel/MainViewModelSubcomponent$Factory;", "inject", "", "activity", "Lcom/samples/interop/dagger/demo/MainActivity;", "Factory", "interopDaggerDemo", "Ldagger/Subcomponent;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface MainActivitySubComponent {

    /* JADX INFO: compiled from: MainActivitySubcomponent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&Ê\u0001\u0002\b\u0005¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/samples/interop/dagger/demo/di/MainActivitySubComponent$Factory;", "", "create", "Lcom/samples/interop/dagger/demo/di/MainActivitySubComponent;", "interopDaggerDemo", "Ldagger/Subcomponent$Factory;"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @Subcomponent.Factory
    public interface Factory {
        MainActivitySubComponent create();
    }

    MainViewModelSubcomponent.Factory getMainActivitySubComponentFactory();

    void inject(MainActivity activity);
}
