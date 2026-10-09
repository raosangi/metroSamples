package com.samples.dagger.demo;

import com.samples.dagger.demo.errors.ErrorHandler;
import com.samples.dagger.demo.network.DataSource;
import com.samples.dagger.demo.tracking.TrackingHandler;
import com.samples.dagger.demo.viewmodel.MainViewModelSubcomponent;
import dagger.MembersInjector;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
    private final Provider<DataSource> dataSourceProvider;
    private final Provider<ErrorHandler> errorHandlerProvider;
    private final Provider<MainViewModelSubcomponent.Factory> mainViewModelSubcomponentFactoryProvider;
    private final Provider<TrackingHandler> trackingHandlerProvider;

    private MainActivity_MembersInjector(Provider<ErrorHandler> errorHandlerProvider, Provider<TrackingHandler> trackingHandlerProvider, Provider<DataSource> dataSourceProvider, Provider<MainViewModelSubcomponent.Factory> mainViewModelSubcomponentFactoryProvider) {
        this.errorHandlerProvider = errorHandlerProvider;
        this.trackingHandlerProvider = trackingHandlerProvider;
        this.dataSourceProvider = dataSourceProvider;
        this.mainViewModelSubcomponentFactoryProvider = mainViewModelSubcomponentFactoryProvider;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MainActivity instance) {
        injectErrorHandler(instance, this.errorHandlerProvider.get());
        injectTrackingHandler(instance, this.trackingHandlerProvider.get());
        injectDataSource(instance, this.dataSourceProvider.get());
        injectMainViewModelSubcomponentFactory(instance, this.mainViewModelSubcomponentFactoryProvider.get());
    }

    public static MembersInjector<MainActivity> create(Provider<ErrorHandler> errorHandlerProvider, Provider<TrackingHandler> trackingHandlerProvider, Provider<DataSource> dataSourceProvider, Provider<MainViewModelSubcomponent.Factory> mainViewModelSubcomponentFactoryProvider) {
        return new MainActivity_MembersInjector(errorHandlerProvider, trackingHandlerProvider, dataSourceProvider, mainViewModelSubcomponentFactoryProvider);
    }

    public static void injectErrorHandler(MainActivity instance, ErrorHandler errorHandler) {
        instance.errorHandler = errorHandler;
    }

    public static void injectTrackingHandler(MainActivity instance, TrackingHandler trackingHandler) {
        instance.trackingHandler = trackingHandler;
    }

    public static void injectDataSource(MainActivity instance, DataSource dataSource) {
        instance.dataSource = dataSource;
    }

    public static void injectMainViewModelSubcomponentFactory(MainActivity instance, MainViewModelSubcomponent.Factory mainViewModelSubcomponentFactory) {
        instance.mainViewModelSubcomponentFactory = mainViewModelSubcomponentFactory;
    }
}
