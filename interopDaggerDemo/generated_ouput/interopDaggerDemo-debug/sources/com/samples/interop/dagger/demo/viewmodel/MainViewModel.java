package com.samples.interop.dagger.demo.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.samples.interop.dagger.demo.network.DataSource;
import com.samples.interop.dagger.demo.tracking.TrackingHandler;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.Factory;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MainViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0002\b\n¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0015\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014Ê\u0001\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\u0003\u0010\u0000\u008a\u0002\u0016\b\u001b\u0012\u0012\b\u0001\u001a\u000e\n\fMetroFactory¨\u0006\u0018"}, d2 = {"Lcom/samples/interop/dagger/demo/viewmodel/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "trackingHandler", "Lcom/samples/interop/dagger/demo/tracking/TrackingHandler;", "dataSource", "Lcom/samples/interop/dagger/demo/network/DataSource;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/samples/interop/dagger/demo/tracking/TrackingHandler;Lcom/samples/interop/dagger/demo/network/DataSource;Landroidx/lifecycle/SavedStateHandle;)V", "Ljavax/inject/Inject;", "getTrackingHandler", "()Lcom/samples/interop/dagger/demo/tracking/TrackingHandler;", "getDataSource", "()Lcom/samples/interop/dagger/demo/network/DataSource;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "message", "", "getMessage", "()Ljava/lang/String;", "track", "", "MetroFactory", "interopDaggerDemo", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters", "dev.zacsweers.metro.compiler"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class MainViewModel extends ViewModel {
    public static final int $stable = 8;
    private final DataSource dataSource;
    private final String message;
    private final SavedStateHandle savedStateHandle;
    private final TrackingHandler trackingHandler;

    /* JADX INFO: compiled from: MainViewModel.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001:\u0001\fJ$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007b\u0002\b\nJ\b\u0010\u000b\u001a\u00020\u0003H\u0007Ê\u0001\u0018\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\n\b\u0011\u0012\u0006\b\n0\u00128\u0013Ê\u0001\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\u0003\u0010\u0002¨\u0006\r"}, d2 = {"Lcom/samples/interop/dagger/demo/viewmodel/MainViewModel$MetroFactory;", "", "declarationMirror", "Lcom/samples/interop/dagger/demo/viewmodel/MainViewModel;", "trackingHandler", "Lcom/samples/interop/dagger/demo/tracking/TrackingHandler;", "dataSource", "Lcom/samples/interop/dagger/demo/network/DataSource;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "Ldev/zacsweers/metro/internal/ComptimeOnly;", "invoke", "Companion", "interopDaggerDemo", "Lkotlin/Deprecated;", "message", "This synthesized declaration should not be used directly", "level", "Lkotlin/DeprecationLevel;", "HIDDEN", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final class MetroFactory implements Factory<MainViewModel> {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final Provider<DataSource> dataSource;
        private final Provider<SavedStateHandle> savedStateHandle;
        private final Provider<TrackingHandler> trackingHandler;

        private MetroFactory(Provider<TrackingHandler> provider, Provider<DataSource> provider2, Provider<SavedStateHandle> provider3) {
            this.trackingHandler = provider;
            this.dataSource = provider2;
            this.savedStateHandle = provider3;
        }

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, Provider provider3, DefaultConstructorMarker defaultConstructorMarker) {
            this(provider, provider2, provider3);
        }

        @JvmStatic
        public static final MetroFactory create(Provider<TrackingHandler> provider, Provider<DataSource> provider2, Provider<SavedStateHandle> provider3) {
            return Companion.create(provider, provider2, provider3);
        }

        @JvmStatic
        public static final MainViewModel newInstance(TrackingHandler trackingHandler, DataSource dataSource, SavedStateHandle savedStateHandle) {
            return Companion.newInstance(trackingHandler, dataSource, savedStateHandle);
        }

        public final MainViewModel declarationMirror(TrackingHandler trackingHandler, DataSource dataSource, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(trackingHandler, "trackingHandler");
            Intrinsics.checkNotNullParameter(dataSource, "dataSource");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            throw new IllegalStateException("Never called".toString());
        }

        @Override // dev.zacsweers.metro.Provider, kotlin.jvm.functions.Function0
        public final MainViewModel invoke() {
            return Companion.newInstance(this.trackingHandler.invoke(), this.dataSource.invoke(), this.savedStateHandle.invoke());
        }

        /* JADX INFO: compiled from: MainViewModel.kt */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007b\u0002\b\rJ$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007b\u0002\b\r¨\u0006\u0010"}, d2 = {"Lcom/samples/interop/dagger/demo/viewmodel/MainViewModel$MetroFactory$Companion;", "", "<init>", "()V", "create", "Lcom/samples/interop/dagger/demo/viewmodel/MainViewModel$MetroFactory;", "trackingHandler", "Ldev/zacsweers/metro/Provider;", "Lcom/samples/interop/dagger/demo/tracking/TrackingHandler;", "dataSource", "Lcom/samples/interop/dagger/demo/network/DataSource;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "Lkotlin/jvm/JvmStatic;", "newInstance", "Lcom/samples/interop/dagger/demo/viewmodel/MainViewModel;", "interopDaggerDemo"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final MetroFactory create(Provider<TrackingHandler> trackingHandler, Provider<DataSource> dataSource, Provider<SavedStateHandle> savedStateHandle) {
                Intrinsics.checkNotNullParameter(trackingHandler, "trackingHandler");
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
                return new MetroFactory(trackingHandler, dataSource, savedStateHandle, null);
            }

            @JvmStatic
            public final MainViewModel newInstance(TrackingHandler trackingHandler, DataSource dataSource, SavedStateHandle savedStateHandle) {
                Intrinsics.checkNotNullParameter(trackingHandler, "trackingHandler");
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
                return new MainViewModel(trackingHandler, dataSource, savedStateHandle);
            }

            private Companion() {
            }
        }
    }

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
