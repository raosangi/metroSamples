package com.samples.metro.demo.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import dev.zacsweers.metro.GraphExtension;
import dev.zacsweers.metro.Provides;
import kotlin.Metadata;

/* JADX INFO: compiled from: MainViewModelSubcomponent.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005Ê\u0001\u0010\b\b\u0012\f\b\t\u0012\b\b\fJ\u0004\b\t0\n¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/samples/metro/demo/viewmodel/MainViewModelSubcomponent;", "", "mainViewModel", "Lcom/samples/metro/demo/viewmodel/MainViewModel;", "getMainViewModel", "()Lcom/samples/metro/demo/viewmodel/MainViewModel;", "Factory", "metroDemo", "Ldev/zacsweers/metro/GraphExtension;", "bindingContainers", "Lcom/samples/metro/demo/viewmodel/MainViewModelTrackingModule;"}, k = 1, mv = {2, 4, 0}, xi = 48)
@GraphExtension(bindingContainers = {MainViewModelTrackingModule.class})
public interface MainViewModelSubcomponent {

    /* JADX INFO: compiled from: MainViewModelSubcomponent.kt */
    @GraphExtension.Factory
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\b\u0001\u0010\u0004\u001a\u00020\u0005:\u0002\b\u0006H&Ê\u0001\u0002\b\b¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/samples/metro/demo/viewmodel/MainViewModelSubcomponent$Factory;", "", "create", "Lcom/samples/metro/demo/viewmodel/MainViewModelSubcomponent;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "Ldev/zacsweers/metro/Provides;", "metroDemo", "Ldev/zacsweers/metro/GraphExtension$Factory;"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface Factory {
        MainViewModelSubcomponent create(@Provides SavedStateHandle savedStateHandle);
    }

    MainViewModel getMainViewModel();
}
