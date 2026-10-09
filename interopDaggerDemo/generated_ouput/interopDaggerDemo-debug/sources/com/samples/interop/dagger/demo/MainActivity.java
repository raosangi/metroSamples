package com.samples.interop.dagger.demo;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.samples.interop.dagger.demo.di.AppComponentHolder;
import com.samples.interop.dagger.demo.errors.ErrorHandler;
import com.samples.interop.dagger.demo.network.DataSource;
import com.samples.interop.dagger.demo.theme.ThemeKt;
import com.samples.interop.dagger.demo.tracking.TrackingHandler;
import com.samples.interop.dagger.demo.viewmodel.MainViewModel;
import com.samples.interop.dagger.demo.viewmodel.MainViewModelSubcomponent;
import dev.zacsweers.metro.Assisted;
import dev.zacsweers.metro.MembersInjector;
import dev.zacsweers.metro.Provider;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: MainActivity.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014R#\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u0092\u0002\u0002\b\n¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR#\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u0092\u0002\u0002\b\n¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R#\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u0092\u0002\u0002\b\n¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R#\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.\u0092\u0002\u0002\b\n¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cÊ\u0001\f\b%\u0012\b\b&\u0012\u0004\b\u0003\u0010\u0000\u008a\u0002\u0086\u0001\b'\u0012\u0081\u0001\b\u0001\u001a}\u0012{\n\u0014MetroMembersInjector\u0012\u0010injectDataSource\u0012\u0012injectErrorHandler\u0012&injectMainViewModelSubcomponentFactory\u0012\u0015injectTrackingHandler¨\u0006\"²\u0006\n\u0010#\u001a\u00020$X\u008a\u0084\u0002"}, d2 = {"Lcom/samples/interop/dagger/demo/MainActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "errorHandler", "Lcom/samples/interop/dagger/demo/errors/ErrorHandler;", "getErrorHandler", "()Lcom/samples/interop/dagger/demo/errors/ErrorHandler;", "setErrorHandler", "(Lcom/samples/interop/dagger/demo/errors/ErrorHandler;)V", "Ljavax/inject/Inject;", "trackingHandler", "Lcom/samples/interop/dagger/demo/tracking/TrackingHandler;", "getTrackingHandler", "()Lcom/samples/interop/dagger/demo/tracking/TrackingHandler;", "setTrackingHandler", "(Lcom/samples/interop/dagger/demo/tracking/TrackingHandler;)V", "dataSource", "Lcom/samples/interop/dagger/demo/network/DataSource;", "getDataSource", "()Lcom/samples/interop/dagger/demo/network/DataSource;", "setDataSource", "(Lcom/samples/interop/dagger/demo/network/DataSource;)V", "mainViewModelSubcomponentFactory", "Lcom/samples/interop/dagger/demo/viewmodel/MainViewModelSubcomponent$Factory;", "getMainViewModelSubcomponentFactory", "()Lcom/samples/interop/dagger/demo/viewmodel/MainViewModelSubcomponent$Factory;", "setMainViewModelSubcomponentFactory", "(Lcom/samples/interop/dagger/demo/viewmodel/MainViewModelSubcomponent$Factory;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "MetroMembersInjector", "interopDaggerDemo", "viewmodel", "Lcom/samples/interop/dagger/demo/viewmodel/MainViewModel;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters", "dev.zacsweers.metro.compiler"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class MainActivity extends ComponentActivity {
    public static final int $stable = 8;

    @Inject
    public DataSource dataSource;

    @Inject
    public ErrorHandler errorHandler;

    @Inject
    public MainViewModelSubcomponent.Factory mainViewModelSubcomponentFactory;

    @Inject
    public TrackingHandler trackingHandler;

    /* JADX INFO: compiled from: MainActivity.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eBA\b\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rÊ\u0001\u0018\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\n\b\u0013\u0012\u0006\b\n0\u00148\u0015Ê\u0001\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000f"}, d2 = {"Lcom/samples/interop/dagger/demo/MainActivity$MetroMembersInjector;", "Ldev/zacsweers/metro/MembersInjector;", "Lcom/samples/interop/dagger/demo/MainActivity;", "errorHandler", "Ldev/zacsweers/metro/Provider;", "Lcom/samples/interop/dagger/demo/errors/ErrorHandler;", "trackingHandler", "Lcom/samples/interop/dagger/demo/tracking/TrackingHandler;", "dataSource", "Lcom/samples/interop/dagger/demo/network/DataSource;", "mainViewModelSubcomponentFactory", "Lcom/samples/interop/dagger/demo/viewmodel/MainViewModelSubcomponent$Factory;", "<init>", "(Ldev/zacsweers/metro/Provider;Ldev/zacsweers/metro/Provider;Ldev/zacsweers/metro/Provider;Ldev/zacsweers/metro/Provider;)V", "Companion", "interopDaggerDemo", "Lkotlin/Deprecated;", "message", "This synthesized declaration should not be used directly", "level", "Lkotlin/DeprecationLevel;", "HIDDEN", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final class MetroMembersInjector implements MembersInjector<MainActivity> {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final Provider<DataSource> dataSource;
        private final Provider<ErrorHandler> errorHandler;
        private final Provider<MainViewModelSubcomponent.Factory> mainViewModelSubcomponentFactory;
        private final Provider<TrackingHandler> trackingHandler;

        public /* synthetic */ MetroMembersInjector(Provider provider, Provider provider2, Provider provider3, Provider provider4, DefaultConstructorMarker defaultConstructorMarker) {
            this(provider, provider2, provider3, provider4);
        }

        @JvmStatic
        public static final MembersInjector<MainActivity> create(Provider<ErrorHandler> provider, Provider<TrackingHandler> provider2, Provider<DataSource> provider3, Provider<MainViewModelSubcomponent.Factory> provider4) {
            return Companion.create(provider, provider2, provider3, provider4);
        }

        /* JADX INFO: compiled from: MainActivity.kt */
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JJ\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0007b\u0002\b\u0010J\"\u0010\u0011\u001a\u00020\u00122\f\b\u0001\u0010\u0013\u001a\u00020\u0006:\u0002\b\u00142\u0006\u0010\f\u001a\u00020\rH\u0007b\u0002\b\u0010J\"\u0010\u0015\u001a\u00020\u00122\f\b\u0001\u0010\u0013\u001a\u00020\u0006:\u0002\b\u00142\u0006\u0010\u0007\u001a\u00020\tH\u0007b\u0002\b\u0010J\"\u0010\u0016\u001a\u00020\u00122\f\b\u0001\u0010\u0013\u001a\u00020\u0006:\u0002\b\u00142\u0006\u0010\u000e\u001a\u00020\u000fH\u0007b\u0002\b\u0010J\"\u0010\u0017\u001a\u00020\u00122\f\b\u0001\u0010\u0013\u001a\u00020\u0006:\u0002\b\u00142\u0006\u0010\n\u001a\u00020\u000bH\u0007b\u0002\b\u0010¨\u0006\u0018"}, d2 = {"Lcom/samples/interop/dagger/demo/MainActivity$MetroMembersInjector$Companion;", "", "<init>", "()V", "create", "Ldev/zacsweers/metro/MembersInjector;", "Lcom/samples/interop/dagger/demo/MainActivity;", "errorHandler", "Ldev/zacsweers/metro/Provider;", "Lcom/samples/interop/dagger/demo/errors/ErrorHandler;", "trackingHandler", "Lcom/samples/interop/dagger/demo/tracking/TrackingHandler;", "dataSource", "Lcom/samples/interop/dagger/demo/network/DataSource;", "mainViewModelSubcomponentFactory", "Lcom/samples/interop/dagger/demo/viewmodel/MainViewModelSubcomponent$Factory;", "Lkotlin/jvm/JvmStatic;", "injectDataSource", "", "instance", "Ldev/zacsweers/metro/Assisted;", "injectErrorHandler", "injectMainViewModelSubcomponentFactory", "injectTrackingHandler", "interopDaggerDemo"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final MembersInjector<MainActivity> create(Provider<ErrorHandler> errorHandler, Provider<TrackingHandler> trackingHandler, Provider<DataSource> dataSource, Provider<MainViewModelSubcomponent.Factory> mainViewModelSubcomponentFactory) {
                Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
                Intrinsics.checkNotNullParameter(trackingHandler, "trackingHandler");
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                Intrinsics.checkNotNullParameter(mainViewModelSubcomponentFactory, "mainViewModelSubcomponentFactory");
                return new MetroMembersInjector(errorHandler, trackingHandler, dataSource, mainViewModelSubcomponentFactory, null);
            }

            private Companion() {
            }

            @JvmStatic
            public final void injectDataSource(@Assisted MainActivity instance, DataSource dataSource) {
                Intrinsics.checkNotNullParameter(instance, "instance");
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                instance.dataSource = dataSource;
            }

            @JvmStatic
            public final void injectErrorHandler(@Assisted MainActivity instance, ErrorHandler errorHandler) {
                Intrinsics.checkNotNullParameter(instance, "instance");
                Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
                instance.errorHandler = errorHandler;
            }

            @JvmStatic
            public final void injectMainViewModelSubcomponentFactory(@Assisted MainActivity instance, MainViewModelSubcomponent.Factory mainViewModelSubcomponentFactory) {
                Intrinsics.checkNotNullParameter(instance, "instance");
                Intrinsics.checkNotNullParameter(mainViewModelSubcomponentFactory, "mainViewModelSubcomponentFactory");
                instance.mainViewModelSubcomponentFactory = mainViewModelSubcomponentFactory;
            }

            @JvmStatic
            public final void injectTrackingHandler(@Assisted MainActivity instance, TrackingHandler trackingHandler) {
                Intrinsics.checkNotNullParameter(instance, "instance");
                Intrinsics.checkNotNullParameter(trackingHandler, "trackingHandler");
                instance.trackingHandler = trackingHandler;
            }
        }

        private MetroMembersInjector(Provider<ErrorHandler> provider, Provider<TrackingHandler> provider2, Provider<DataSource> provider3, Provider<MainViewModelSubcomponent.Factory> provider4) {
            this.errorHandler = provider;
            this.trackingHandler = provider2;
            this.dataSource = provider3;
            this.mainViewModelSubcomponentFactory = provider4;
        }

        @Override // dev.zacsweers.metro.MembersInjector
        public final void injectMembers(MainActivity instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Companion.injectErrorHandler(instance, this.errorHandler.invoke());
            Companion.injectTrackingHandler(instance, this.trackingHandler.invoke());
            Companion.injectDataSource(instance, this.dataSource.invoke());
            Companion.injectMainViewModelSubcomponentFactory(instance, this.mainViewModelSubcomponentFactory.invoke());
        }

        @JvmStatic
        public static final void injectDataSource(@Assisted MainActivity instance, DataSource dataSource) {
            Companion.injectDataSource(instance, dataSource);
        }

        @JvmStatic
        public static final void injectErrorHandler(@Assisted MainActivity instance, ErrorHandler errorHandler) {
            Companion.injectErrorHandler(instance, errorHandler);
        }

        @JvmStatic
        public static final void injectMainViewModelSubcomponentFactory(@Assisted MainActivity instance, MainViewModelSubcomponent.Factory mainViewModelSubcomponentFactory) {
            Companion.injectMainViewModelSubcomponentFactory(instance, mainViewModelSubcomponentFactory);
        }

        @JvmStatic
        public static final void injectTrackingHandler(@Assisted MainActivity instance, TrackingHandler trackingHandler) {
            Companion.injectTrackingHandler(instance, trackingHandler);
        }
    }

    public final ErrorHandler getErrorHandler() {
        ErrorHandler errorHandler = this.errorHandler;
        if (errorHandler != null) {
            return errorHandler;
        }
        Intrinsics.throwUninitializedPropertyAccessException("errorHandler");
        return null;
    }

    public final void setErrorHandler(ErrorHandler errorHandler) {
        Intrinsics.checkNotNullParameter(errorHandler, "<set-?>");
        this.errorHandler = errorHandler;
    }

    public final TrackingHandler getTrackingHandler() {
        TrackingHandler trackingHandler = this.trackingHandler;
        if (trackingHandler != null) {
            return trackingHandler;
        }
        Intrinsics.throwUninitializedPropertyAccessException("trackingHandler");
        return null;
    }

    public final void setTrackingHandler(TrackingHandler trackingHandler) {
        Intrinsics.checkNotNullParameter(trackingHandler, "<set-?>");
        this.trackingHandler = trackingHandler;
    }

    public final DataSource getDataSource() {
        DataSource dataSource = this.dataSource;
        if (dataSource != null) {
            return dataSource;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dataSource");
        return null;
    }

    public final void setDataSource(DataSource dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "<set-?>");
        this.dataSource = dataSource;
    }

    public final MainViewModelSubcomponent.Factory getMainViewModelSubcomponentFactory() {
        MainViewModelSubcomponent.Factory factory = this.mainViewModelSubcomponentFactory;
        if (factory != null) {
            return factory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mainViewModelSubcomponentFactory");
        return null;
    }

    public final void setMainViewModelSubcomponentFactory(MainViewModelSubcomponent.Factory factory) {
        Intrinsics.checkNotNullParameter(factory, "<set-?>");
        this.mainViewModelSubcomponentFactory = factory;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppComponentHolder.INSTANCE.getAppComponent().getMainActivitySubComponentFactory().create().inject(this);
        getErrorHandler().handleError("main activity error");
        getTrackingHandler().handleTracking("mainActivity");
        getDataSource().getData("App");
        final MainActivity mainActivity = this;
        final Function0 function0 = null;
        final Lazy viewmodel$delegate = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MainViewModel.class), new Function0<ViewModelStore>() { // from class: com.samples.interop.dagger.demo.MainActivity$onCreate$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return mainActivity.getViewModelStore();
            }
        }, new Function0() { // from class: com.samples.interop.dagger.demo.MainActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainActivity.onCreate$lambda$0(this.f$0);
            }
        }, new Function0<CreationExtras>() { // from class: com.samples.interop.dagger.demo.MainActivity$onCreate$$inlined$viewModels$default$3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = function0;
                return (function1 == null || (creationExtras = (CreationExtras) function1.invoke()) == null) ? mainActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
        EdgeToEdge.enable$default(this, null, null, 3, null);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1683833108, true, new Function2() { // from class: com.samples.interop.dagger.demo.MainActivity$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MainActivity.onCreate$lambda$2(viewmodel$delegate, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MainViewModel onCreate$lambda$1(Lazy<MainViewModel> lazy) {
        return lazy.getValue();
    }

    static final ViewModelProvider.Factory onCreate$lambda$0(final MainActivity this$0) {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(Reflection.getOrCreateKotlinClass(MainViewModel.class), new Function1() { // from class: com.samples.interop.dagger.demo.MainActivity$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainActivity.onCreate$lambda$0$0$0(this.f$0, (CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MainViewModel onCreate$lambda$0$0$0(MainActivity this$0, CreationExtras initializer) {
        Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
        return this$0.getMainViewModelSubcomponentFactory().create(SavedStateHandleSupport.createSavedStateHandle(initializer)).getMainViewModel();
    }

    static final Unit onCreate$lambda$2(final Lazy $viewmodel$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C60@2216L391,60@2205L402:MainActivity.kt#ipvxa4");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1683833108, $changed, -1, "com.samples.interop.dagger.demo.MainActivity.onCreate.<anonymous> (MainActivity.kt:60)");
            }
            ThemeKt.MeetaTheme(false, false, ComposableLambdaKt.rememberComposableLambda(1880633174, true, new Function2() { // from class: com.samples.interop.dagger.demo.MainActivity$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MainActivity.onCreate$lambda$2$0($viewmodel$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2$0(final Lazy $viewmodel$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C61@2278L315,61@2234L359:MainActivity.kt#ipvxa4");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1880633174, $changed, -1, "com.samples.interop.dagger.demo.MainActivity.onCreate.<anonymous>.<anonymous> (MainActivity.kt:61)");
            }
            ScaffoldKt.m2530ScaffoldTvnljyQ(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(1961211495, true, new Function3() { // from class: com.samples.interop.dagger.demo.MainActivity$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MainActivity.onCreate$lambda$2$0$0($viewmodel$delegate, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2$0$0(Lazy $viewmodel$delegate, PaddingValues innerPadding, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(innerPadding, "innerPadding");
        ComposerKt.sourceInformation($composer, "CN(innerPadding)62@2342L65,62@2316L91,65@2428L147:MainActivity.kt#ipvxa4");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(innerPadding) ? 4 : 2;
        }
        if (!$composer.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1961211495, $dirty, -1, "com.samples.interop.dagger.demo.MainActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:62)");
            }
            MainViewModel mainViewModelOnCreate$lambda$1 = onCreate$lambda$1($viewmodel$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, -766394136, "CC(remember):MainActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($viewmodel$delegate);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = (Function2) new MainActivity$onCreate$1$1$1$1$1($viewmodel$delegate, null);
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            EffectsKt.LaunchedEffect(mainViewModelOnCreate$lambda$1, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, $composer, MainViewModel.$stable);
            MainActivityKt.Greeting(onCreate$lambda$1($viewmodel$delegate).getMessage(), PaddingKt.padding(Modifier.INSTANCE, innerPadding), $composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
