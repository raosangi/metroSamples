package com.samples.metro.demo.di;

import androidx.lifecycle.SavedStateHandle;
import com.samples.metro.demo.MainActivity;
import com.samples.metro.demo.errors.DefaultErrorHandler;
import com.samples.metro.demo.network.AppScreenDetailHandler;
import com.samples.metro.demo.network.DefaultDataSource;
import com.samples.metro.demo.network.MainScreenDetailHandler;
import com.samples.metro.demo.network.ScreenDetailHandler;
import com.samples.metro.demo.tracking.DefaultTrackingHandler;
import com.samples.metro.demo.tracking.MainActivityTrackingAdapter;
import com.samples.metro.demo.tracking.TrackingAdapter;
import com.samples.metro.demo.tracking.TrackingAdapter2;
import com.samples.metro.demo.tracking.TrackingAdapter3;
import com.samples.metro.demo.viewmodel.MainViewModel;
import com.samples.metro.demo.viewmodel.MainViewModelSubcomponent;
import com.samples.metro.demo.viewmodel.MainViewModelTrackingModule;
import dev.zacsweers.metro.AppScope;
import dev.zacsweers.metro.DependencyGraph;
import dev.zacsweers.metro.Provides;
import dev.zacsweers.metro.internal.GraphFactoryInvokeFunctionMarker;
import dev.zacsweers.metro.internal.MetroImplMarker;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppComponent.kt */
/* JADX INFO: loaded from: classes8.dex */
@DependencyGraph(bindingContainers = {ErrorModule.class, TrackingModule.class, DataSourceModule.class}, scope = AppScope.class)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bg\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010Ê\u0001&\b\u0014\u0012\b\b\u0015\u0012\u0004\b\t0\u0016\u0012\u0018\b\u0017\u0012\u0014\b\fJ\u0004\b\t0\u0018J\u0004\b\t0\u0019J\u0004\b\t0\u001a¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lcom/samples/metro/demo/di/AppComponent;", "", "trackingAdapter", "", "Lcom/samples/metro/demo/tracking/TrackingAdapter;", "getTrackingAdapter", "()Ljava/util/Set;", "screenContextProviderMap", "", "", "Lcom/samples/metro/demo/network/ScreenDetailHandler;", "getScreenContextProviderMap", "()Ljava/util/Map;", "mainActivitySubComponentFactory", "Lcom/samples/metro/demo/di/MainActivitySubComponent$Factory;", "getMainActivitySubComponentFactory", "()Lcom/samples/metro/demo/di/MainActivitySubComponent$Factory;", "Companion", "Impl", "metroDemo", "Ldev/zacsweers/metro/DependencyGraph;", "scope", "Ldev/zacsweers/metro/AppScope;", "bindingContainers", "Lcom/samples/metro/demo/di/ErrorModule;", "Lcom/samples/metro/demo/di/TrackingModule;", "Lcom/samples/metro/demo/di/DataSourceModule;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface AppComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    MainActivitySubComponent.Factory getMainActivitySubComponentFactory();

    Map<String, ScreenDetailHandler> getScreenContextProviderMap();

    Set<TrackingAdapter> getTrackingAdapter();

    /* JADX INFO: compiled from: AppComponent.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u0005H\u0087\u0002b\u0002\b\u0006b\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/samples/metro/demo/di/AppComponent$Companion;", "", "<init>", "()V", "invoke", "Lcom/samples/metro/demo/di/AppComponent;", "Ldev/zacsweers/metro/internal/GraphFactoryInvokeFunctionMarker;", "Lkotlin/jvm/JvmStatic;", "metroDemo"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @JvmStatic
        @GraphFactoryInvokeFunctionMarker
        public final AppComponent invoke() {
            return new Impl(null);
        }
    }

    /* JADX INFO: compiled from: AppComponent.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ê\u0001\u0018\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\b\b\u0012\u0006\b\n0\t8\nÊ\u0001\u0002\b\u000bÊ\u0001\f\b\f\u0012\b\b\r\u0012\u0004\b\u0003\u0010\u0000\u008a\u0002k\b\u000e\u0012g\b\u0001\u0012c\b\u0001\u001a%<get-mainActivitySubComponentFactory>\u001a\u001e<get-screenContextProviderMap>\u001a\u0015<get-trackingAdapter>\"\u0001\u0006¨\u0006\u0004"}, d2 = {"Lcom/samples/metro/demo/di/AppComponent$Impl;", "Lcom/samples/metro/demo/di/AppComponent;", "<init>", "()V", "metroDemo", "Lkotlin/Deprecated;", "message", "This synthesized declaration should not be used directly", "level", "Lkotlin/DeprecationLevel;", "HIDDEN", "Ldev/zacsweers/metro/internal/MetroImplMarker;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters", "dev.zacsweers.metro.compiler"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @MetroImplMarker
    public static final class Impl implements AppComponent {
        public static final int $stable = 8;
        private final Impl thisGraphInstance;

        public /* synthetic */ Impl(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Set<TrackingAdapter> getSetOfTrackingAdapter() {
            Set setCreateSetBuilder = SetsKt.createSetBuilder(2);
            setCreateSetBuilder.add(new TrackingAdapter3());
            setCreateSetBuilder.add(new TrackingAdapter2());
            return SetsKt.build(setCreateSetBuilder);
        }

        private Impl() {
            this.thisGraphInstance = this;
        }

        @Override // com.samples.metro.demo.di.AppComponent
        public final MainActivitySubComponent.Factory getMainActivitySubComponentFactory() {
            return new MainActivitySubComponentImpl.FactoryImpl(this.thisGraphInstance);
        }

        @Override // com.samples.metro.demo.di.AppComponent
        public final Map<String, ScreenDetailHandler> getScreenContextProviderMap() {
            return getMapOfStringToScreenDetailHandler();
        }

        @Override // com.samples.metro.demo.di.AppComponent
        public final Set<TrackingAdapter> getTrackingAdapter() {
            return getSetOfTrackingAdapter();
        }

        /* JADX INFO: compiled from: AppComponent.kt */
        @DependencyGraph
        @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
        private static final class MainActivitySubComponentImpl implements MainActivitySubComponent {
            private Impl appComponentImpl;
            private final MainActivitySubComponentImpl thisGraphInstance;

            /* JADX INFO: compiled from: AppComponent.kt */
            @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
            private static final class FactoryImpl implements MainActivitySubComponent.Factory {
                private final Impl AppComponentImpl;

                public FactoryImpl(Impl AppComponentImpl) {
                    Intrinsics.checkNotNullParameter(AppComponentImpl, "AppComponentImpl");
                    this.AppComponentImpl = AppComponentImpl;
                }

                @Override // com.samples.metro.demo.di.MainActivitySubComponent.Factory
                public final MainActivitySubComponent create() {
                    return new MainActivitySubComponentImpl(this.AppComponentImpl);
                }
            }

            public MainActivitySubComponentImpl(Impl appComponentImpl) {
                Intrinsics.checkNotNullParameter(appComponentImpl, "appComponentImpl");
                this.appComponentImpl = appComponentImpl;
                this.thisGraphInstance = this;
            }

            private final MainViewModelSubcomponent.Factory getFactoryFactory() {
                return new MainViewModelSubcomponentImpl.FactoryImpl(this.thisGraphInstance);
            }

            private final Set<TrackingAdapter> getSetOfTrackingAdapter() {
                Set setCreateSetBuilder = SetsKt.createSetBuilder(2);
                setCreateSetBuilder.add(new TrackingAdapter3());
                setCreateSetBuilder.add(new TrackingAdapter2());
                return SetsKt.build(setCreateSetBuilder);
            }

            @Override // com.samples.metro.demo.di.MainActivitySubComponent
            public final MainViewModelSubcomponent.Factory getMainActivitySubComponentFactory() {
                return getFactoryFactory();
            }

            @Override // com.samples.metro.demo.di.MainActivitySubComponent
            public final void inject(MainActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                MainActivity.MetroMembersInjector.Companion.injectErrorHandler(activity, new DefaultErrorHandler());
                MainActivity.MetroMembersInjector.Companion.injectTrackingHandler(activity, new DefaultTrackingHandler(getSetOfTrackingAdapter()));
                MainActivity.MetroMembersInjector.Companion.injectDataSource(activity, new DefaultDataSource(getMapOfStringToScreenDetailHandler()));
                MainActivity.MetroMembersInjector.Companion.injectMainViewModelSubcomponentFactory(activity, getFactoryFactory());
            }

            /* JADX INFO: compiled from: AppComponent.kt */
            @DependencyGraph(bindingContainers = {MainViewModelTrackingModule.class})
            @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
            private static final class MainViewModelSubcomponentImpl implements MainViewModelSubcomponent {
                private MainActivitySubComponentImpl mainActivitySubComponentImpl;
                private final SavedStateHandle savedStateHandleInstance;

                /* JADX INFO: compiled from: AppComponent.kt */
                @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
                private static final class FactoryImpl implements MainViewModelSubcomponent.Factory {
                    private final MainActivitySubComponentImpl MainActivitySubComponentImpl;

                    public FactoryImpl(MainActivitySubComponentImpl MainActivitySubComponentImpl) {
                        Intrinsics.checkNotNullParameter(MainActivitySubComponentImpl, "MainActivitySubComponentImpl");
                        this.MainActivitySubComponentImpl = MainActivitySubComponentImpl;
                    }

                    @Override // com.samples.metro.demo.viewmodel.MainViewModelSubcomponent.Factory
                    public final MainViewModelSubcomponent create(@Provides SavedStateHandle savedStateHandle) {
                        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
                        return new MainViewModelSubcomponentImpl(this.MainActivitySubComponentImpl, savedStateHandle);
                    }
                }

                public MainViewModelSubcomponentImpl(MainActivitySubComponentImpl mainActivitySubComponentImpl, @Provides SavedStateHandle savedStateHandle) {
                    Intrinsics.checkNotNullParameter(mainActivitySubComponentImpl, "mainActivitySubComponentImpl");
                    Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
                    this.mainActivitySubComponentImpl = mainActivitySubComponentImpl;
                    this.savedStateHandleInstance = savedStateHandle;
                }

                private final Set<TrackingAdapter> getSetOfTrackingAdapter() {
                    Set setCreateSetBuilder = SetsKt.createSetBuilder(3);
                    setCreateSetBuilder.add(new MainActivityTrackingAdapter());
                    setCreateSetBuilder.add(new TrackingAdapter3());
                    setCreateSetBuilder.add(new TrackingAdapter2());
                    return SetsKt.build(setCreateSetBuilder);
                }

                @Override // com.samples.metro.demo.viewmodel.MainViewModelSubcomponent
                public final MainViewModel getMainViewModel() {
                    return new MainViewModel(new DefaultTrackingHandler(getSetOfTrackingAdapter()), new DefaultDataSource(getMapOfStringToScreenDetailHandler()), this.savedStateHandleInstance);
                }

                private final Map<String, Function0<ScreenDetailHandler>> getMapOfStringToScreenDetailHandler() {
                    Map mapCreateMapBuilder = MapsKt.createMapBuilder(2);
                    mapCreateMapBuilder.put("App", AppScreenDetailHandler.MetroFactory.create());
                    mapCreateMapBuilder.put("Main", MainScreenDetailHandler.MetroFactory.create());
                    return MapsKt.build(mapCreateMapBuilder);
                }
            }

            private final Map<String, Function0<ScreenDetailHandler>> getMapOfStringToScreenDetailHandler() {
                Map mapCreateMapBuilder = MapsKt.createMapBuilder(1);
                mapCreateMapBuilder.put("App", AppScreenDetailHandler.MetroFactory.create());
                return MapsKt.build(mapCreateMapBuilder);
            }
        }

        private final Map<String, ScreenDetailHandler> getMapOfStringToScreenDetailHandler() {
            Map mapCreateMapBuilder = MapsKt.createMapBuilder(1);
            mapCreateMapBuilder.put("App", new AppScreenDetailHandler());
            return MapsKt.build(mapCreateMapBuilder);
        }
    }

    @JvmStatic
    @GraphFactoryInvokeFunctionMarker
    static AppComponent invoke() {
        return INSTANCE.invoke();
    }
}
