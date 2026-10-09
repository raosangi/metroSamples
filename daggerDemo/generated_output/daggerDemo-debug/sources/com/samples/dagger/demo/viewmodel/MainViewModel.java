package com.samples.dagger.demo.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.samples.dagger.demo.network.DataSource;
import com.samples.dagger.demo.tracking.TrackingHandler;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MainViewModel.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0002\b\n¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0015\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014Ê\u0001\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0017"}, d2 = {"Lcom/samples/dagger/demo/viewmodel/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "trackingHandler", "Lcom/samples/dagger/demo/tracking/TrackingHandler;", "dataSource", "Lcom/samples/dagger/demo/network/DataSource;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/samples/dagger/demo/tracking/TrackingHandler;Lcom/samples/dagger/demo/network/DataSource;Landroidx/lifecycle/SavedStateHandle;)V", "Ljavax/inject/Inject;", "getTrackingHandler", "()Lcom/samples/dagger/demo/tracking/TrackingHandler;", "getDataSource", "()Lcom/samples/dagger/demo/network/DataSource;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "message", "", "getMessage", "()Ljava/lang/String;", "track", "", "daggerDemo", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class MainViewModel extends ViewModel {
    public static final int $stable = 8;
    private final DataSource dataSource;
    private final String message;
    private final SavedStateHandle savedStateHandle;
    private final TrackingHandler trackingHandler;

    @Inject
    public MainViewModel(TrackingHandler trackingHandler, DataSource dataSource, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(trackingHandler, "trackingHandler");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.trackingHandler = trackingHandler;
        this.dataSource = dataSource;
        this.savedStateHandle = savedStateHandle;
        this.message = "hello";
    }

    public final TrackingHandler getTrackingHandler() {
        return this.trackingHandler;
    }

    public final DataSource getDataSource() {
        return this.dataSource;
    }

    public final SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void track() {
        this.dataSource.getData("Main");
        this.trackingHandler.handleTracking("hello tracking");
    }
}
