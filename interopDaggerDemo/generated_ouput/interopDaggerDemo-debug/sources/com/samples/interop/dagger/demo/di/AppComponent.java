package com.samples.interop.dagger.demo.di;

import androidx.lifecycle.SavedStateHandle;
import com.samples.interop.dagger.demo.MainActivity;
import com.samples.interop.dagger.demo.errors.DefaultErrorHandler;
import com.samples.interop.dagger.demo.network.AppScreenDetailHandler;
import com.samples.interop.dagger.demo.network.DefaultDataSource;
import com.samples.interop.dagger.demo.network.MainScreenDetailHandler;
import com.samples.interop.dagger.demo.network.ScreenDetailHandler;
import com.samples.interop.dagger.demo.tracking.DefaultTrackingHandler;
import com.samples.interop.dagger.demo.tracking.MainActivityTrackingAdapter;
import com.samples.interop.dagger.demo.tracking.TrackingAdapter;
import com.samples.interop.dagger.demo.tracking.TrackingAdapter2;
import com.samples.interop.dagger.demo.tracking.TrackingAdapter3;
import com.samples.interop.dagger.demo.viewmodel.MainViewModel;
import com.samples.interop.dagger.demo.viewmodel.MainViewModelSubcomponent;
import com.samples.interop.dagger.demo.viewmodel.MainViewModelTrackingModule;
import dagger.BindsInstance;
import dagger.Component;
import dev.zacsweers.metro.DependencyGraph;
import dev.zacsweers.metro.internal.GraphFactoryInvokeFunctionMarker;
import dev.zacsweers.metro.internal.MetroImplMarker;
import dev.zacsweers.metro.interop.javax.JavaxInteropKt;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.inject.Singleton;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: AppComponent.kt */
/* JADX INFO: loaded from: classes3.dex */
@Component(modules = {ErrorModule.class, TrackingModule.class, DataSourceModule.class})
@Singleton
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bg\u0018\u0000 \u00152\u00020\u0001:\u0002\u0015\u0016R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR'\u0010\r\u001a\u0017\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u000f0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0012\u0010\u0011\u001a\u00020\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014Ê\u0001\u0002\b\u0018Ê\u0001\u001c\b\u0019\u0012\u0018\b\u001a\u0012\u0014\b\fJ\u0004\b\t0\u001bJ\u0004\b\t0\u001cJ\u0004\b\t0\u001d¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lcom/samples/interop/dagger/demo/di/AppComponent;", "", "trackingAdapter", "", "Lcom/samples/interop/dagger/demo/tracking/TrackingAdapter;", "getTrackingAdapter", "()Ljava/util/Set;", "screenContextProviderMap", "", "", "Lcom/samples/interop/dagger/demo/network/ScreenDetailHandler;", "getScreenContextProviderMap", "()Ljava/util/Map;", "trackingTags", "Ljava/lang/Class;", "Lkotlin/jvm/JvmSuppressWildcards;", "getTrackingTags", "mainActivitySubComponentFactory", "Lcom/samples/interop/dagger/demo/di/MainActivitySubComponent$Factory;", "getMainActivitySubComponentFactory", "()Lcom/samples/interop/dagger/demo/di/MainActivitySubComponent$Factory;", "Companion", "Impl", "interopDaggerDemo", "Ljavax/inject/Singleton;", "Ldagger/Component;", "modules", "Lcom/samples/interop/dagger/demo/di/ErrorModule;", "Lcom/samples/interop/dagger/demo/di/TrackingModule;", "Lcom/samples/interop/dagger/demo/di/DataSourceModule;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface AppComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    MainActivitySubComponent.Factory getMainActivitySubComponentFactory();

    Map<String, ScreenDetailHandler> getScreenContextProviderMap();

    Set<TrackingAdapter> getTrackingAdapter();

    Map<Class<?>, Object> getTrackingTags();

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
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ê\u0001\u0018\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\b\b\u0012\u0006\b\n0\t8\nÊ\u0001\u0002\b\u000bÊ\u0001\f\b\f\u0012\b\b\r\u0012\u0004\b\u0003\u0010\u0002\u008a\u0002\u007f\b\u000e\u0012{\b\u0001\u0012w\b\u0001\u001a%<get-mainActivitySubComponentFactory>\u001a\u001e<get-screenContextProviderMap>\u001a\u0015<get-trackingAdapter>\u001a\u0012<get-trackingTags>\"\u0001\u000e¨\u0006\u0004"}, d2 = {"Lcom/samples/interop/dagger/demo/di/AppComponent$Impl;", "Lcom/samples/interop/dagger/demo/di/AppComponent;", "<init>", "()V", "interopDaggerDemo", "Lkotlin/Deprecated;", "message", "This synthesized declaration should not be used directly", "level", "Lkotlin/DeprecationLevel;", "HIDDEN", "Ldev/zacsweers/metro/internal/MetroImplMarker;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters", "dev.zacsweers.metro.compiler"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @MetroImplMarker
    public static final class Impl implements AppComponent {
        public static final int $stable = 0;

        public /* synthetic */ Impl(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Impl() {
        }

        @Override // com.samples.interop.dagger.demo.di.AppComponent
        public final MainActivitySubComponent.Factory getMainActivitySubComponentFactory() {
            return new MainActivitySubComponentImpl.FactoryImpl(this);
        }

        @Override // com.samples.interop.dagger.demo.di.AppComponent
        public final Map<String, ScreenDetailHandler> getScreenContextProviderMap() {
            Map mapCreateMapBuilder = MapsKt.createMapBuilder(1);
            mapCreateMapBuilder.put("App", new AppScreenDetailHandler());
            return MapsKt.build(mapCreateMapBuilder);
        }

        @Override // com.samples.interop.dagger.demo.di.AppComponent
        public final Set<TrackingAdapter> getTrackingAdapter() {
            Set setCreateSetBuilder = SetsKt.createSetBuilder(2);
            setCreateSetBuilder.add(new TrackingAdapter2());
            setCreateSetBuilder.add(new TrackingAdapter3());
            return SetsKt.build(setCreateSetBuilder);
        }

        @Override // com.samples.interop.dagger.demo.di.AppComponent
        public final Map<Class<?>, Object> getTrackingTags() {
            Map mapCreateMapBuilder = MapsKt.createMapBuilder(1);
            mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(String.class), "TrackingTag");
            Map mapBuild = MapsKt.build(mapCreateMapBuilder);
            Map linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mapBuild.size()));
            for (Object obj : mapBuild.entrySet()) {
                linkedHashMap.put(JvmClassMappingKt.getJavaClass((KClass) ((Map.Entry) obj).getKey()), ((Map.Entry) obj).getValue());
            }
            return linkedHashMap;
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
                    Set setCreateSetBuilder = SetsKt.createSetBuilder(3);
                    setCreateSetBuilder.add(new TrackingAdapter2());
                    setCreateSetBuilder.add(new TrackingAdapter3());
                    setCreateSetBuilder.add(new MainActivityTrackingAdapter());
                    Set setBuild = SetsKt.build(setCreateSetBuilder);
                    Map mapCreateMapBuilder = MapsKt.createMapBuilder(1);
                    mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(String.class), "TrackingTag");
                    Map mapBuild = MapsKt.build(mapCreateMapBuilder);
                    Map linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mapBuild.size()));
                    for (Object obj : mapBuild.entrySet()) {
                        linkedHashMap.put(JvmClassMappingKt.getJavaClass((KClass) ((Map.Entry) obj).getKey()), ((Map.Entry) obj).getValue());
                    }
                    DefaultTrackingHandler defaultTrackingHandler = new DefaultTrackingHandler(setBuild, linkedHashMap);
                    Map mapCreateMapBuilder2 = MapsKt.createMapBuilder(2);
                    mapCreateMapBuilder2.put("App", JavaxInteropKt.asJavaxProvider(AppScreenDetailHandler.MetroFactory.create()));
                    mapCreateMapBuilder2.put("Main", JavaxInteropKt.asJavaxProvider(MainScreenDetailHandler.MetroFactory.create()));
                    return new MainViewModel(defaultTrackingHandler, new DefaultDataSource(MapsKt.build(mapCreateMapBuilder2)), this.savedStateHandleInstance);
                }
            }

            @Override // com.samples.interop.dagger.demo.di.MainActivitySubComponent
            public final void inject(MainActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                MainActivity.MetroMembersInjector.injectErrorHandler(activity, new DefaultErrorHandler());
                Set setCreateSetBuilder = SetsKt.createSetBuilder(2);
                setCreateSetBuilder.add(new TrackingAdapter2());
                setCreateSetBuilder.add(new TrackingAdapter3());
                Set setBuild = SetsKt.build(setCreateSetBuilder);
                Map mapCreateMapBuilder = MapsKt.createMapBuilder(1);
                mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(String.class), "TrackingTag");
                Map mapBuild = MapsKt.build(mapCreateMapBuilder);
                Map linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mapBuild.size()));
                for (Object obj : mapBuild.entrySet()) {
                    linkedHashMap.put(JvmClassMappingKt.getJavaClass((KClass) ((Map.Entry) obj).getKey()), ((Map.Entry) obj).getValue());
                }
                MainActivity.MetroMembersInjector.injectTrackingHandler(activity, new DefaultTrackingHandler(setBuild, linkedHashMap));
                Map mapCreateMapBuilder2 = MapsKt.createMapBuilder(1);
                mapCreateMapBuilder2.put("App", JavaxInteropKt.asJavaxProvider(AppScreenDetailHandler.MetroFactory.create()));
                MainActivity.MetroMembersInjector.injectDataSource(activity, new DefaultDataSource(MapsKt.build(mapCreateMapBuilder2)));
                MainActivity.MetroMembersInjector.injectMainViewModelSubcomponentFactory(activity, getFactoryFactory());
            }
        }
    }

    @JvmStatic
    @GraphFactoryInvokeFunctionMarker
    static AppComponent invoke() {
        return INSTANCE.invoke();
    }
}
