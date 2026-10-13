package com.samples.interop.dagger.demo.di;

import androidx.lifecycle.SavedStateHandle;
import com.samples.interop.dagger.demo.MainActivity;
import com.samples.interop.dagger.demo.errors.DefaultErrorHandler;
import com.samples.interop.dagger.demo.network.AppScreenDetailHandler;
import com.samples.interop.dagger.demo.network.DefaultDataSource;
import com.samples.interop.dagger.demo.network.MainScreenDetailHandler;
import com.samples.interop.dagger.demo.network.ScreenDetailHandler;
import com.samples.interop.dagger.demo.tracking.NewTrackingQualifier;
import com.samples.interop.dagger.demo.tracking.OldTrackingIdentifier;
import com.samples.interop.dagger.demo.tracking.OldTrackingQualifier;
import com.samples.interop.dagger.demo.tracking.TrackingAdapter;
import com.samples.interop.dagger.demo.tracking.TrackingAdapter2;
import com.samples.interop.dagger.demo.tracking.TrackingAdapter3;
import com.samples.interop.dagger.demo.tracking.TrackingAdapter4;
import com.samples.interop.dagger.demo.tracking.TrackingAdapter5;
import com.samples.interop.dagger.demo.tracking.TrackingAdapter6;
import com.samples.interop.dagger.demo.tracking.TrackingAdapter7;
import com.samples.interop.dagger.demo.tracking.TrackingAdapter8;
import com.samples.interop.dagger.demo.tracking.TrackingAdapter9;
import com.samples.interop.dagger.demo.tracking.TrackingHandler;
import com.samples.interop.dagger.demo.tracking.TrackingIdentifier;
import com.samples.interop.dagger.demo.viewmodel.MainViewModel;
import com.samples.interop.dagger.demo.viewmodel.MainViewModelSubcomponent;
import com.samples.interop.dagger.demo.viewmodel.MainViewModelTrackingModule;
import dagger.BindsInstance;
import dagger.Component;
import dev.zacsweers.metro.DependencyGraph;
import dev.zacsweers.metro.ProviderKt;
import dev.zacsweers.metro.internal.GraphFactoryInvokeFunctionMarker;
import dev.zacsweers.metro.internal.MetroImplMarker;
import dev.zacsweers.metro.internal.SetFactory;
import dev.zacsweers.metro.interop.javax.JavaxInteropKt;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import javax.inject.Provider;
import javax.inject.Singleton;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: AppComponent.kt */
/* JADX INFO: loaded from: classes3.dex */
@Component(modules = {ErrorModule.class, TrackingModule.class, DataSourceModule.class})
@Singleton
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bg\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fR*\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00038&X§\u0004r\u0002\b\n¢\u0006\f\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR*\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00038&X§\u0004r\u0002\b\u000e¢\u0006\f\u0012\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\tR$\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00030\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R(\u0010\u0015\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0014R\u0012\u0010\u001a\u001a\u00020\u001bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dÊ\u0001\u0002\b!Ê\u0001\u001c\b\"\u0012\u0018\b#\u0012\u0014\b\fJ\u0004\b\t0$J\u0004\b\t0%J\u0004\b\t0&¨\u0006 À\u0006\u0003"}, d2 = {"Lcom/samples/interop/dagger/demo/di/AppComponent;", "", "trackingAdapterOld", "Ljavax/inject/Provider;", "", "Lcom/samples/interop/dagger/demo/tracking/TrackingAdapter;", "getTrackingAdapterOld$annotations", "()V", "getTrackingAdapterOld", "()Ljavax/inject/Provider;", "Lcom/samples/interop/dagger/demo/tracking/OldTrackingQualifier;", "trackingAdapterNew", "getTrackingAdapterNew$annotations", "getTrackingAdapterNew", "Lcom/samples/interop/dagger/demo/tracking/NewTrackingQualifier;", "screenContextProviderMap", "", "", "Lcom/samples/interop/dagger/demo/network/ScreenDetailHandler;", "getScreenContextProviderMap", "()Ljava/util/Map;", "trackingTags", "Ljava/lang/Class;", "Lkotlin/Function0;", "Lcom/samples/interop/dagger/demo/tracking/TrackingIdentifier;", "getTrackingTags", "mainActivitySubComponentFactory", "Lcom/samples/interop/dagger/demo/di/MainActivitySubComponent$Factory;", "getMainActivitySubComponentFactory", "()Lcom/samples/interop/dagger/demo/di/MainActivitySubComponent$Factory;", "Companion", "Impl", "interopDaggerDemo", "Ljavax/inject/Singleton;", "Ldagger/Component;", "modules", "Lcom/samples/interop/dagger/demo/di/ErrorModule;", "Lcom/samples/interop/dagger/demo/di/TrackingModule;", "Lcom/samples/interop/dagger/demo/di/DataSourceModule;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface AppComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: AppComponent.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class DefaultImpls {
        @NewTrackingQualifier
        public static /* synthetic */ void getTrackingAdapterNew$annotations() {
        }

        @OldTrackingQualifier
        public static /* synthetic */ void getTrackingAdapterOld$annotations() {
        }
    }

    MainActivitySubComponent.Factory getMainActivitySubComponentFactory();

    Map<String, Provider<ScreenDetailHandler>> getScreenContextProviderMap();

    Provider<Set<TrackingAdapter>> getTrackingAdapterNew();

    Provider<Set<TrackingAdapter>> getTrackingAdapterOld();

    Map<Class<?>, Function0<TrackingIdentifier>> getTrackingTags();

    /* JADX INFO: compiled from: AppComponent.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u0005H\u0087\u0002b\u0002\b\u0006b\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/samples/interop/dagger/demo/di/AppComponent$Companion;", "", "<init>", "()V", "invoke", "Lcom/samples/interop/dagger/demo/di/AppComponent;", "Ldev/zacsweers/metro/internal/GraphFactoryInvokeFunctionMarker;", "Lkotlin/jvm/JvmStatic;", "interopDaggerDemo"}, k = 1, mv = {2, 4, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ê\u0001\u0018\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\b\b\u0012\u0006\b\n0\t8\nÊ\u0001\u0002\b\u000bÊ\u0001\f\b\f\u0012\b\b\r\u0012\u0004\b\u0003\u0010\u0002\u008a\u0002\u009e\u0001\b\u000e\u0012\u0099\u0001\b\u0001\u0012\u0094\u0001\b\u0001\u001a%<get-mainActivitySubComponentFactory>\u001a\u001e<get-screenContextProviderMap>\u001a\u0018<get-trackingAdapterNew>\u001a\u0018<get-trackingAdapterOld>\u001a\u0012<get-trackingTags>\"\u0001\u001e¨\u0006\u0004"}, d2 = {"Lcom/samples/interop/dagger/demo/di/AppComponent$Impl;", "Lcom/samples/interop/dagger/demo/di/AppComponent;", "<init>", "()V", "interopDaggerDemo", "Lkotlin/Deprecated;", "message", "This synthesized declaration should not be used directly", "level", "Lkotlin/DeprecationLevel;", "HIDDEN", "Ldev/zacsweers/metro/internal/MetroImplMarker;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters", "dev.zacsweers.metro.compiler"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @MetroImplMarker
    public static final class Impl implements AppComponent {
        public static final int $stable = 0;
        Shard1 shard1;
        Shard2 shard2;

        /* JADX INFO: compiled from: AppComponent.kt */
        @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
        private static final class Shard2 {
            public Shard2(Impl graph) {
                Intrinsics.checkNotNullParameter(graph, "graph");
            }

            public final Map<KClass<?>, Function0<TrackingIdentifier>> getMapOfKClass___ToTrackingIdentifier$interopDaggerDemo() {
                Map mapCreateMapBuilder = MapsKt.createMapBuilder(1);
                mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(OldTrackingIdentifier.class), OldTrackingIdentifier.MetroFactory.create());
                return MapsKt.build(mapCreateMapBuilder);
            }
        }

        public /* synthetic */ Impl(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NewTrackingQualifier
        public static /* synthetic */ void getTrackingAdapterNew$annotations() {
        }

        @OldTrackingQualifier
        public static /* synthetic */ void getTrackingAdapterOld$annotations() {
        }

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

                @Override // com.samples.interop.dagger.demo.di.MainActivitySubComponent.Factory
                public final MainActivitySubComponent create() {
                    return new MainActivitySubComponentImpl(this.AppComponentImpl);
                }
            }

            public MainActivitySubComponentImpl(Impl appComponentImpl) {
                Intrinsics.checkNotNullParameter(appComponentImpl, "appComponentImpl");
                this.appComponentImpl = appComponentImpl;
            }

            private final MainViewModelSubcomponent.Factory getFactoryFactory() {
                return new MainViewModelSubcomponentImpl.FactoryImpl(this);
            }

            @Override // com.samples.interop.dagger.demo.di.MainActivitySubComponent
            public final MainViewModelSubcomponent.Factory getMainActivitySubComponentFactory() {
                return getFactoryFactory();
            }

            @Override // com.samples.interop.dagger.demo.di.MainActivitySubComponent
            public final void inject(MainActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                MainActivity.MetroMembersInjector.injectErrorHandler(activity, new DefaultErrorHandler());
                TrackingModule.Companion companion = TrackingModule.INSTANCE;
                Provider<Set<TrackingAdapter>> providerAsJavaxProvider = JavaxInteropKt.asJavaxProvider(this.appComponentImpl.shard1.getSetOfTrackingAdapterProvider$interopDaggerDemo());
                SetFactory.Builder builder = SetFactory.builder(7, 0);
                builder.addProvider(TrackingAdapter3.MetroFactory.create());
                builder.addProvider(TrackingAdapter4.MetroFactory.create());
                builder.addProvider(TrackingAdapter5.MetroFactory.create());
                builder.addProvider(TrackingAdapter6.MetroFactory.create());
                builder.addProvider(TrackingAdapter7.MetroFactory.create());
                builder.addProvider(TrackingAdapter8.MetroFactory.create());
                builder.addProvider(TrackingAdapter9.MetroFactory.create(ProviderKt.providerOf(Optional.empty())));
                MainActivity.MetroMembersInjector.injectTrackingHandler(activity, companion.providesTrackingHandler(providerAsJavaxProvider, JavaxInteropKt.asJavaxProvider(builder.build()), this.appComponentImpl.shard2.getMapOfKClass___ToTrackingIdentifier$interopDaggerDemo()));
                MainActivity.MetroMembersInjector.injectDataSource(activity, new DefaultDataSource(this.appComponentImpl.shard1.getMapOfStringToScreenDetailHandler$interopDaggerDemo()));
                MainActivity.MetroMembersInjector.injectMainViewModelSubcomponentFactory(activity, getFactoryFactory());
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

                    @Override // com.samples.interop.dagger.demo.viewmodel.MainViewModelSubcomponent.Factory
                    public final MainViewModelSubcomponent create(@BindsInstance SavedStateHandle savedStateHandle) {
                        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
                        return new MainViewModelSubcomponentImpl(this.MainActivitySubComponentImpl, savedStateHandle);
                    }
                }

                public MainViewModelSubcomponentImpl(MainActivitySubComponentImpl mainActivitySubComponentImpl, @BindsInstance SavedStateHandle savedStateHandle) {
                    Intrinsics.checkNotNullParameter(mainActivitySubComponentImpl, "mainActivitySubComponentImpl");
                    Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
                    this.mainActivitySubComponentImpl = mainActivitySubComponentImpl;
                    this.savedStateHandleInstance = savedStateHandle;
                }

                @Override // com.samples.interop.dagger.demo.viewmodel.MainViewModelSubcomponent
                public final MainViewModel getMainViewModel() {
                    TrackingModule.Companion companion = TrackingModule.INSTANCE;
                    Provider<Set<TrackingAdapter>> providerAsJavaxProvider = JavaxInteropKt.asJavaxProvider(this.mainActivitySubComponentImpl.appComponentImpl.shard1.getSetOfTrackingAdapterProvider$interopDaggerDemo());
                    SetFactory.Builder builder = SetFactory.builder(7, 0);
                    builder.addProvider(TrackingAdapter3.MetroFactory.create());
                    builder.addProvider(TrackingAdapter4.MetroFactory.create());
                    builder.addProvider(TrackingAdapter5.MetroFactory.create());
                    builder.addProvider(TrackingAdapter6.MetroFactory.create());
                    builder.addProvider(TrackingAdapter7.MetroFactory.create());
                    builder.addProvider(TrackingAdapter8.MetroFactory.create());
                    builder.addProvider(TrackingAdapter9.MetroFactory.create(ProviderKt.providerOf(Optional.empty())));
                    TrackingHandler trackingHandlerProvidesTrackingHandler = companion.providesTrackingHandler(providerAsJavaxProvider, JavaxInteropKt.asJavaxProvider(builder.build()), this.mainActivitySubComponentImpl.appComponentImpl.shard2.getMapOfKClass___ToTrackingIdentifier$interopDaggerDemo());
                    Map mapCreateMapBuilder = MapsKt.createMapBuilder(2);
                    mapCreateMapBuilder.put("App", JavaxInteropKt.asJavaxProvider(AppScreenDetailHandler.MetroFactory.create()));
                    mapCreateMapBuilder.put("Main", JavaxInteropKt.asJavaxProvider(MainScreenDetailHandler.MetroFactory.create()));
                    return new MainViewModel(trackingHandlerProvidesTrackingHandler, new DefaultDataSource(MapsKt.build(mapCreateMapBuilder)), this.savedStateHandleInstance);
                }
            }
        }

        private Impl() {
            this.shard1 = new Shard1(this);
            this.shard2 = new Shard2(this);
        }

        @Override // com.samples.interop.dagger.demo.di.AppComponent
        public final MainActivitySubComponent.Factory getMainActivitySubComponentFactory() {
            return new MainActivitySubComponentImpl.FactoryImpl(this);
        }

        @Override // com.samples.interop.dagger.demo.di.AppComponent
        public final Map<String, Provider<ScreenDetailHandler>> getScreenContextProviderMap() {
            return this.shard1.getMapOfStringToScreenDetailHandler$interopDaggerDemo();
        }

        @Override // com.samples.interop.dagger.demo.di.AppComponent
        public final Provider<Set<TrackingAdapter>> getTrackingAdapterNew() {
            SetFactory.Builder builder = SetFactory.builder(7, 0);
            builder.addProvider(TrackingAdapter3.MetroFactory.create());
            builder.addProvider(TrackingAdapter4.MetroFactory.create());
            builder.addProvider(TrackingAdapter5.MetroFactory.create());
            builder.addProvider(TrackingAdapter6.MetroFactory.create());
            builder.addProvider(TrackingAdapter7.MetroFactory.create());
            builder.addProvider(TrackingAdapter8.MetroFactory.create());
            builder.addProvider(TrackingAdapter9.MetroFactory.create(ProviderKt.providerOf(Optional.empty())));
            return JavaxInteropKt.asJavaxProvider(builder.build());
        }

        @Override // com.samples.interop.dagger.demo.di.AppComponent
        public final Provider<Set<TrackingAdapter>> getTrackingAdapterOld() {
            return JavaxInteropKt.asJavaxProvider(this.shard1.getSetOfTrackingAdapterProvider$interopDaggerDemo());
        }

        @Override // com.samples.interop.dagger.demo.di.AppComponent
        public final Map<Class<?>, Function0<TrackingIdentifier>> getTrackingTags() {
            Map<KClass<?>, Function0<TrackingIdentifier>> mapOfKClass___ToTrackingIdentifier$interopDaggerDemo = this.shard2.getMapOfKClass___ToTrackingIdentifier$interopDaggerDemo();
            Map linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mapOfKClass___ToTrackingIdentifier$interopDaggerDemo.size()));
            for (Object obj : mapOfKClass___ToTrackingIdentifier$interopDaggerDemo.entrySet()) {
                linkedHashMap.put(JvmClassMappingKt.getJavaClass((KClass) ((Map.Entry) obj).getKey()), ((Map.Entry) obj).getValue());
            }
            return linkedHashMap;
        }

        /* JADX INFO: compiled from: AppComponent.kt */
        @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
        private static final class Shard1 {
            public Shard1(Impl graph) {
                Intrinsics.checkNotNullParameter(graph, "graph");
            }

            @OldTrackingQualifier
            public static /* synthetic */ void getSetOfTrackingAdapterProvider$interopDaggerDemo$annotations() {
            }

            public final dev.zacsweers.metro.Provider<Set<TrackingAdapter>> getSetOfTrackingAdapterProvider$interopDaggerDemo() {
                return SetFactory.singleton(TrackingAdapter2.MetroFactory.create());
            }

            public final Map<String, Provider<ScreenDetailHandler>> getMapOfStringToScreenDetailHandler$interopDaggerDemo() {
                Map mapCreateMapBuilder = MapsKt.createMapBuilder(1);
                mapCreateMapBuilder.put("App", JavaxInteropKt.asJavaxProvider(AppScreenDetailHandler.MetroFactory.create()));
                return MapsKt.build(mapCreateMapBuilder);
            }
        }
    }

    @JvmStatic
    @GraphFactoryInvokeFunctionMarker
    static AppComponent invoke() {
        return INSTANCE.invoke();
    }
}
