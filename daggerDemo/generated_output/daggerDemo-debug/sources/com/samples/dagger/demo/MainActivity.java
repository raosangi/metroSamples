package com.samples.dagger.demo;

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
import com.samples.dagger.demo.di.AppComponentHolder;
import com.samples.dagger.demo.errors.ErrorHandler;
import com.samples.dagger.demo.network.DataSource;
import com.samples.dagger.demo.tracking.TrackingHandler;
import com.samples.dagger.demo.viewmodel.MainViewModel;
import com.samples.dagger.demo.viewmodel.MainViewModelSubcomponent;
import com.samples.ui.theme.ThemeKt;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: MainActivity.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014R#\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u0092\u0002\u0002\b\n¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR#\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u0092\u0002\u0002\b\n¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R#\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u0092\u0002\u0002\b\n¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R#\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.\u0092\u0002\u0002\b\n¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cÊ\u0001\f\b$\u0012\b\b%\u0012\u0004\b\u0003\u0010\u0000¨\u0006!²\u0006\n\u0010\"\u001a\u00020#X\u008a\u0084\u0002"}, d2 = {"Lcom/samples/dagger/demo/MainActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "errorHandler", "Lcom/samples/dagger/demo/errors/ErrorHandler;", "getErrorHandler", "()Lcom/samples/dagger/demo/errors/ErrorHandler;", "setErrorHandler", "(Lcom/samples/dagger/demo/errors/ErrorHandler;)V", "Ljavax/inject/Inject;", "trackingHandler", "Lcom/samples/dagger/demo/tracking/TrackingHandler;", "getTrackingHandler", "()Lcom/samples/dagger/demo/tracking/TrackingHandler;", "setTrackingHandler", "(Lcom/samples/dagger/demo/tracking/TrackingHandler;)V", "dataSource", "Lcom/samples/dagger/demo/network/DataSource;", "getDataSource", "()Lcom/samples/dagger/demo/network/DataSource;", "setDataSource", "(Lcom/samples/dagger/demo/network/DataSource;)V", "mainViewModelSubcomponentFactory", "Lcom/samples/dagger/demo/viewmodel/MainViewModelSubcomponent$Factory;", "getMainViewModelSubcomponentFactory", "()Lcom/samples/dagger/demo/viewmodel/MainViewModelSubcomponent$Factory;", "setMainViewModelSubcomponentFactory", "(Lcom/samples/dagger/demo/viewmodel/MainViewModelSubcomponent$Factory;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "daggerDemo", "viewmodel", "Lcom/samples/dagger/demo/viewmodel/MainViewModel;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
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
        final Lazy viewmodel$delegate = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MainViewModel.class), new Function0<ViewModelStore>() { // from class: com.samples.dagger.demo.MainActivity$onCreate$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return mainActivity.getViewModelStore();
            }
        }, new Function0() { // from class: com.samples.dagger.demo.MainActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainActivity.onCreate$lambda$0(this.f$0);
            }
        }, new Function0<CreationExtras>() { // from class: com.samples.dagger.demo.MainActivity$onCreate$$inlined$viewModels$default$3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = function0;
                return (function1 == null || (creationExtras = (CreationExtras) function1.invoke()) == null) ? mainActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
        EdgeToEdge.enable$default(this, null, null, 3, null);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(2060142083, true, new Function2() { // from class: com.samples.dagger.demo.MainActivity$$ExternalSyntheticLambda2
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
        initializerViewModelFactoryBuilder.addInitializer(Reflection.getOrCreateKotlinClass(MainViewModel.class), new Function1() { // from class: com.samples.dagger.demo.MainActivity$$ExternalSyntheticLambda4
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
        ComposerKt.sourceInformation($composer, "C61@2144L391,61@2133L402:MainActivity.kt#j0rp11");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2060142083, $changed, -1, "com.samples.dagger.demo.MainActivity.onCreate.<anonymous> (MainActivity.kt:61)");
            }
            ThemeKt.MeetaTheme(false, false, ComposableLambdaKt.rememberComposableLambda(-1338927547, true, new Function2() { // from class: com.samples.dagger.demo.MainActivity$$ExternalSyntheticLambda0
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
        ComposerKt.sourceInformation($composer, "C62@2206L315,62@2162L359:MainActivity.kt#j0rp11");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1338927547, $changed, -1, "com.samples.dagger.demo.MainActivity.onCreate.<anonymous>.<anonymous> (MainActivity.kt:62)");
            }
            ScaffoldKt.m2530ScaffoldTvnljyQ(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-1256473002, true, new Function3() { // from class: com.samples.dagger.demo.MainActivity$$ExternalSyntheticLambda3
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
        ComposerKt.sourceInformation($composer, "CN(innerPadding)63@2270L65,63@2244L91,66@2356L147:MainActivity.kt#j0rp11");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(innerPadding) ? 4 : 2;
        }
        if (!$composer.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1256473002, $dirty, -1, "com.samples.dagger.demo.MainActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:63)");
            }
            MainViewModel mainViewModelOnCreate$lambda$1 = onCreate$lambda$1($viewmodel$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, -584742633, "CC(remember):MainActivity.kt#9igjgp");
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
