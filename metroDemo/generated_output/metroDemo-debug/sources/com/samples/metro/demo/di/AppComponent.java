package com.samples.metro.demo.di;

import androidx.lifecycle.SavedStateHandle;
import com.samples.metro.demo.AppNameInfo;
import com.samples.metro.demo.AppVersionInfo;
import com.samples.metro.demo.MainActivity;
import com.samples.metro.demo.errors.DefaultErrorHandler;
import com.samples.metro.demo.errors.DefaultLogging;
import com.samples.metro.demo.network.AppScreenDetailHandler;
import com.samples.metro.demo.network.DataSource;
import com.samples.metro.demo.network.DefaultDataSource;
import com.samples.metro.demo.network.ScreenContextProvider;
import com.samples.metro.demo.network.ScreenDetailHandler;
import com.samples.metro.demo.tracking.NewTrackingQualifier;
import com.samples.metro.demo.tracking.OldTrackingIdentifier;
import com.samples.metro.demo.tracking.OldTrackingQualifier;
import com.samples.metro.demo.tracking.TrackingAdapter;
import com.samples.metro.demo.tracking.TrackingAdapter2;
import com.samples.metro.demo.tracking.TrackingAdapter3;
import com.samples.metro.demo.tracking.TrackingAdapter4;
import com.samples.metro.demo.tracking.TrackingAdapter5;
import com.samples.metro.demo.tracking.TrackingAdapter6;
import com.samples.metro.demo.tracking.TrackingAdapter7;
import com.samples.metro.demo.tracking.TrackingAdapter8;
import com.samples.metro.demo.tracking.TrackingAdapter9;
import com.samples.metro.demo.tracking.TrackingExporter;
import com.samples.metro.demo.tracking.TrackingHandler;
import com.samples.metro.demo.tracking.TrackingIdentifier;
import com.samples.metro.demo.viewmodel.MainViewModel;
import com.samples.metro.demo.viewmodel.MainViewModelSubcomponent;
import com.samples.metro.demo.viewmodel.MainViewModelTrackingModule;
import dev.zacsweers.metro.AppScope;
import dev.zacsweers.metro.DependencyGraph;
import dev.zacsweers.metro.OptionalBinding;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.Provides;
import dev.zacsweers.metro.internal.GraphFactoryInvokeFunctionMarker;
import dev.zacsweers.metro.internal.MetroImplMarker;
import dev.zacsweers.metro.internal.SetFactory;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: AppComponent.kt */
/* JADX INFO: loaded from: classes8.dex */
@DependencyGraph(bindingContainers = {ErrorModule.class, TrackingModule.class, DataSourceModule.class}, scope = AppScope.class)
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bg\u0018\u0000 '2\u00020\u0001:\u0002'(R*\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00038&X§\u0004r\u0002\b\n¢\u0006\f\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR*\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00038&X§\u0004r\u0002\b\u000e¢\u0006\f\u0012\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\tR$\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00030\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R(\u0010\u0015\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00030\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0012\u0010\u0019\u001a\u00020\u001aX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR \u0010\u001d\u001a\u0004\u0018\u00010\u001e8VX\u0097\u0004r\u0002\b\"¢\u0006\f\u0012\u0004\b\u001f\u0010\u0007\u001a\u0004\b \u0010!R\u0012\u0010#\u001a\u00020$X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&Ê\u0001&\b*\u0012\b\b+\u0012\u0004\b\t0,\u0012\u0018\b-\u0012\u0014\b\fJ\u0004\b\t0.J\u0004\b\t0/J\u0004\b\t00¨\u0006)À\u0006\u0003"}, d2 = {"Lcom/samples/metro/demo/di/AppComponent;", "", "trackingAdapterOld", "Lkotlin/Function0;", "", "Lcom/samples/metro/demo/tracking/TrackingAdapter;", "getTrackingAdapterOld$annotations", "()V", "getTrackingAdapterOld", "()Lkotlin/jvm/functions/Function0;", "Lcom/samples/metro/demo/tracking/OldTrackingQualifier;", "trackingAdapterNew", "getTrackingAdapterNew$annotations", "getTrackingAdapterNew", "Lcom/samples/metro/demo/tracking/NewTrackingQualifier;", "screenContextProviderMap", "", "", "Lcom/samples/metro/demo/network/ScreenDetailHandler;", "getScreenContextProviderMap", "()Ljava/util/Map;", "trackingTags", "Lkotlin/reflect/KClass;", "Lcom/samples/metro/demo/tracking/TrackingIdentifier;", "getTrackingTags", "dataSource", "Lcom/samples/metro/demo/network/DataSource;", "getDataSource", "()Lcom/samples/metro/demo/network/DataSource;", "trackingExporter", "Lcom/samples/metro/demo/tracking/TrackingExporter;", "getTrackingExporter$annotations", "getTrackingExporter", "()Lcom/samples/metro/demo/tracking/TrackingExporter;", "Ldev/zacsweers/metro/OptionalBinding;", "mainActivitySubComponentFactory", "Lcom/samples/metro/demo/di/MainActivitySubComponent$Factory;", "getMainActivitySubComponentFactory", "()Lcom/samples/metro/demo/di/MainActivitySubComponent$Factory;", "Companion", "Impl", "metroDemo", "Ldev/zacsweers/metro/DependencyGraph;", "scope", "Ldev/zacsweers/metro/AppScope;", "bindingContainers", "Lcom/samples/metro/demo/di/ErrorModule;", "Lcom/samples/metro/demo/di/TrackingModule;", "Lcom/samples/metro/demo/di/DataSourceModule;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface AppComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    DataSource getDataSource();

    MainActivitySubComponent.Factory getMainActivitySubComponentFactory();

    Map<String, Function0<ScreenDetailHandler>> getScreenContextProviderMap();

    Function0<Set<TrackingAdapter>> getTrackingAdapterNew();

    Function0<Set<TrackingAdapter>> getTrackingAdapterOld();

    Map<KClass<?>, Function0<TrackingIdentifier>> getTrackingTags();

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
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ê\u0001\u0018\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\b\b\u0012\u0006\b\n0\t8\nÊ\u0001\u0002\b\u000bÊ\u0001\f\b\f\u0012\b\b\r\u0012\u0004\b\u0003\u0010\u0002\u008a\u0002È\u0001\b\u000e\u0012Ã\u0001\b\u0001\u0012¾\u0001\b\u0001\u001a\u0010<get-dataSource>\u001a%<get-mainActivitySubComponentFactory>\u001a\u001e<get-screenContextProviderMap>\u001a\u0018<get-trackingAdapterNew>\u001a\u0018<get-trackingAdapterOld>\u001a\u0016<get-trackingExporter>\u001a\u0012<get-trackingTags>\"\u0001\\¨\u0006\u0004"}, d2 = {"Lcom/samples/metro/demo/di/AppComponent$Impl;", "Lcom/samples/metro/demo/di/AppComponent;", "<init>", "()V", "metroDemo", "Lkotlin/Deprecated;", "message", "This synthesized declaration should not be used directly", "level", "Lkotlin/DeprecationLevel;", "HIDDEN", "Ldev/zacsweers/metro/internal/MetroImplMarker;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters", "dev.zacsweers.metro.compiler"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @MetroImplMarker
    public static final class Impl implements AppComponent {
        public static final int $stable = 0;

        /* JADX INFO: compiled from: AppComponent.kt */
        @DependencyGraph
        @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
        private static final class MainActivitySubComponentImpl implements MainActivitySubComponent {
            Impl appComponentImpl;

            /* JADX INFO: compiled from: AppComponent.kt */
            @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
            private static final class FactoryImpl implements MainActivitySubComponent.Factory {
                final Impl AppComponentImpl;

                public FactoryImpl(Impl AppComponentImpl) {
                    Intrinsics.checkNotNullParameter(AppComponentImpl, "AppComponentImpl");
                    this.AppComponentImpl = AppComponentImpl;
                }

                @Override // com.samples.metro.demo.di.MainActivitySubComponent.Factory
                public final MainActivitySubComponent create() {
                    return new MainActivitySubComponentImpl(this.AppComponentImpl);
                }
            }

            /* JADX INFO: compiled from: AppComponent.kt */
            @DependencyGraph(bindingContainers = {MainViewModelTrackingModule.class})
            @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
            private static final class MainViewModelSubcomponentImpl implements MainViewModelSubcomponent {
                MainActivitySubComponentImpl mainActivitySubComponentImpl;
                final SavedStateHandle savedStateHandleInstance;

                /* JADX INFO: compiled from: AppComponent.kt */
                @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
                private static final class FactoryImpl implements MainViewModelSubcomponent.Factory {
                    final MainActivitySubComponentImpl MainActivitySubComponentImpl;

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

                @Override // com.samples.metro.demo.viewmodel.MainViewModelSubcomponent
                public final MainViewModel getMainViewModel() {
                    return new MainViewModel(this.mainActivitySubComponentImpl.appComponentImpl.getProvidesTrackingHandler(), this.mainActivitySubComponentImpl.appComponentImpl.getDefaultDataSource(), this.savedStateHandleInstance);
                }
            }

            public MainActivitySubComponentImpl(Impl appComponentImpl) {
                Intrinsics.checkNotNullParameter(appComponentImpl, "appComponentImpl");
                this.appComponentImpl = appComponentImpl;
            }

            private final MainViewModelSubcomponent.Factory getFactoryFactory() {
                return new MainViewModelSubcomponentImpl.FactoryImpl(this);
            }

            @Override // com.samples.metro.demo.di.MainActivitySubComponent
            public final MainViewModelSubcomponent.Factory getMainActivitySubComponentFactory() {
                return getFactoryFactory();
            }

            @Override // com.samples.metro.demo.di.MainActivitySubComponent
            public final void inject(MainActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                MainActivity.MetroMembersInjector.injectErrorHandler(activity, new DefaultErrorHandler(new DefaultLogging()));
                MainActivity.MetroMembersInjector.injectTrackingHandler(activity, this.appComponentImpl.getProvidesTrackingHandler());
                MainActivity.MetroMembersInjector.injectDataSource(activity, this.appComponentImpl.getDefaultDataSource());
                MainActivity.MetroMembersInjector.injectMainViewModelSubcomponentFactory(activity, getFactoryFactory());
            }
        }

        public /* synthetic */ Impl(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DefaultDataSource getDefaultDataSource() {
            return new DefaultDataSource(new ScreenContextProvider(new AppNameInfo(), new AppVersionInfo()), getProvidesTrackingHandler());
        }

        private final Map<KClass<?>, Function0<TrackingIdentifier>> getMapOfKClass___ToTrackingIdentifier() {
            Map mapCreateMapBuilder = MapsKt.createMapBuilder(1);
            mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(OldTrackingIdentifier.class), OldTrackingIdentifier.MetroFactory.create());
            return MapsKt.build(mapCreateMapBuilder);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final TrackingHandler getProvidesTrackingHandler() {
            return TrackingModule.INSTANCE.providesTrackingHandler(getSetOfTrackingAdapterProvider2(), getSetOfTrackingAdapterProvider(), getMapOfKClass___ToTrackingIdentifier());
        }

        private final Provider<Set<TrackingAdapter>> getSetOfTrackingAdapterProvider() {
            SetFactory.Builder builder = SetFactory.builder(7, 0);
            builder.addProvider(TrackingAdapter9.MetroFactory.Companion.create$default(TrackingAdapter9.MetroFactory.Companion, null, 1, null));
            builder.addProvider(TrackingAdapter8.MetroFactory.create());
            builder.addProvider(TrackingAdapter7.MetroFactory.create());
            builder.addProvider(TrackingAdapter6.MetroFactory.create());
            builder.addProvider(TrackingAdapter5.MetroFactory.create());
            builder.addProvider(TrackingAdapter4.MetroFactory.create());
            builder.addProvider(TrackingAdapter3.MetroFactory.create());
            return builder.build();
        }

        @NewTrackingQualifier
        private static /* synthetic */ void getSetOfTrackingAdapterProvider$annotations() {
        }

        private final Provider<Set<TrackingAdapter>> getSetOfTrackingAdapterProvider2() {
            return SetFactory.singleton(TrackingAdapter2.MetroFactory.create());
        }

        @OldTrackingQualifier
        private static /* synthetic */ void getSetOfTrackingAdapterProvider2$annotations() {
        }

        @NewTrackingQualifier
        public static /* synthetic */ void getTrackingAdapterNew$annotations() {
        }

        @OldTrackingQualifier
        public static /* synthetic */ void getTrackingAdapterOld$annotations() {
        }

        private Impl() {
        }

        @Override // com.samples.metro.demo.di.AppComponent
        public final DataSource getDataSource() {
            return getDefaultDataSource();
        }

        @Override // com.samples.metro.demo.di.AppComponent
        public final MainActivitySubComponent.Factory getMainActivitySubComponentFactory() {
            return new MainActivitySubComponentImpl.FactoryImpl(this);
        }

        @Override // com.samples.metro.demo.di.AppComponent
        public final Map<String, Function0<ScreenDetailHandler>> getScreenContextProviderMap() {
            Map mapCreateMapBuilder = MapsKt.createMapBuilder(1);
            mapCreateMapBuilder.put("App", AppScreenDetailHandler.MetroFactory.create());
            return MapsKt.build(mapCreateMapBuilder);
        }

        @Override // com.samples.metro.demo.di.AppComponent
        public final Function0<Set<TrackingAdapter>> getTrackingAdapterNew() {
            return getSetOfTrackingAdapterProvider();
        }

        @Override // com.samples.metro.demo.di.AppComponent
        public final Function0<Set<TrackingAdapter>> getTrackingAdapterOld() {
            return getSetOfTrackingAdapterProvider2();
        }

        @Override // com.samples.metro.demo.di.AppComponent
        public /* bridge */ TrackingExporter getTrackingExporter() {
            return super.getTrackingExporter();
        }

        @Override // com.samples.metro.demo.di.AppComponent
        public final Map<KClass<?>, Function0<TrackingIdentifier>> getTrackingTags() {
            return getMapOfKClass___ToTrackingIdentifier();
        }
    }

    /* JADX INFO: compiled from: AppComponent.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class DefaultImpls {
        @NewTrackingQualifier
        public static /* synthetic */ void getTrackingAdapterNew$annotations() {
        }

        @OldTrackingQualifier
        public static /* synthetic */ void getTrackingAdapterOld$annotations() {
        }

        @OptionalBinding
        public static /* synthetic */ void getTrackingExporter$annotations() {
        }

        @Deprecated
        public static TrackingExporter getTrackingExporter(AppComponent $this) {
            return AppComponent.super.getTrackingExporter();
        }
    }

    default TrackingExporter getTrackingExporter() {
        return null;
    }

    @JvmStatic
    @GraphFactoryInvokeFunctionMarker
    static AppComponent invoke() {
        return INSTANCE.invoke();
    }
}
