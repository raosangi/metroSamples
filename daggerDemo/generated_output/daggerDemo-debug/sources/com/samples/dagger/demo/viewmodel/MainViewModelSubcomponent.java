package com.samples.dagger.demo.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import dagger.BindsInstance;
import dagger.Subcomponent;
import kotlin.Metadata;

/* JADX INFO: compiled from: MainViewModelSubcomponent.kt */
/* JADX INFO: loaded from: classes8.dex */
@Subcomponent(modules = {MainViewModelTrackingModule.class})
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005Ê\u0001\u0010\b\b\u0012\f\b\t\u0012\b\b\fJ\u0004\b\t0\n¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/samples/dagger/demo/viewmodel/MainViewModelSubcomponent;", "", "mainViewModel", "Lcom/samples/dagger/demo/viewmodel/MainViewModel;", "getMainViewModel", "()Lcom/samples/dagger/demo/viewmodel/MainViewModel;", "Factory", "daggerDemo", "Ldagger/Subcomponent;", "modules", "Lcom/samples/dagger/demo/viewmodel/MainViewModelTrackingModule;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface MainViewModelSubcomponent {

    /* JADX INFO: compiled from: MainViewModelSubcomponent.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\b\u0001\u0010\u0004\u001a\u00020\u0005:\u0002\b\u0006H&Ê\u0001\u0002\b\b¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/samples/dagger/demo/viewmodel/MainViewModelSubcomponent$Factory;", "", "create", "Lcom/samples/dagger/demo/viewmodel/MainViewModelSubcomponent;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "Ldagger/BindsInstance;", "daggerDemo", "Ldagger/Subcomponent$Factory;"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @Subcomponent.Factory
    public interface Factory {
        MainViewModelSubcomponent create(@BindsInstance SavedStateHandle savedStateHandle);
    }

    MainViewModel getMainViewModel();
}
