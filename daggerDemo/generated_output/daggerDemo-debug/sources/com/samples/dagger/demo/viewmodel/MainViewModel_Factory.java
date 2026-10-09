package com.samples.dagger.demo.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import com.samples.dagger.demo.network.DataSource;
import com.samples.dagger.demo.tracking.TrackingHandler;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes8.dex */
public final class MainViewModel_Factory implements Factory<MainViewModel> {
    private final Provider<DataSource> dataSourceProvider;
    private final Provider<SavedStateHandle> savedStateHandleProvider;
    private final Provider<TrackingHandler> trackingHandlerProvider;

    private MainViewModel_Factory(Provider<TrackingHandler> trackingHandlerProvider, Provider<DataSource> dataSourceProvider, Provider<SavedStateHandle> savedStateHandleProvider) {
        this.trackingHandlerProvider = trackingHandlerProvider;
        this.dataSourceProvider = dataSourceProvider;
        this.savedStateHandleProvider = savedStateHandleProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public MainViewModel get() {
        return newInstance(this.trackingHandlerProvider.get(), this.dataSourceProvider.get(), this.savedStateHandleProvider.get());
    }

    public static MainViewModel_Factory create(Provider<TrackingHandler> trackingHandlerProvider, Provider<DataSource> dataSourceProvider, Provider<SavedStateHandle> savedStateHandleProvider) {
        return new MainViewModel_Factory(trackingHandlerProvider, dataSourceProvider, savedStateHandleProvider);
    }

    public static MainViewModel newInstance(TrackingHandler trackingHandler, DataSource dataSource, SavedStateHandle savedStateHandle) {
        return new MainViewModel(trackingHandler, dataSource, savedStateHandle);
    }
}
