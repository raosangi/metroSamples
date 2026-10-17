package com.samples.dagger.demo.di;

import androidx.lifecycle.SavedStateHandle;
import com.samples.dagger.demo.AppNameInfo;
import com.samples.dagger.demo.AppVersionInfo;
import com.samples.dagger.demo.MainActivity;
import com.samples.dagger.demo.MainActivity_MembersInjector;
import com.samples.dagger.demo.errors.DefaultErrorHandler;
import com.samples.dagger.demo.errors.DefaultLogging;
import com.samples.dagger.demo.network.DefaultDataSource;
import com.samples.dagger.demo.network.ScreenContextProvider;
import com.samples.dagger.demo.tracking.OldTrackingIdentifier;
import com.samples.dagger.demo.tracking.OldTrackingIdentifier_Factory;
import com.samples.dagger.demo.tracking.TrackingAdapter;
import com.samples.dagger.demo.tracking.TrackingAdapter2_Factory;
import com.samples.dagger.demo.tracking.TrackingAdapter3_Factory;
import com.samples.dagger.demo.tracking.TrackingAdapter4_Factory;
import com.samples.dagger.demo.tracking.TrackingAdapter5_Factory;
import com.samples.dagger.demo.tracking.TrackingAdapter6_Factory;
import com.samples.dagger.demo.tracking.TrackingAdapter7_Factory;
import com.samples.dagger.demo.tracking.TrackingAdapter8_Factory;
import com.samples.dagger.demo.tracking.TrackingAdapter9;
import com.samples.dagger.demo.tracking.TrackingAdapter9_Factory;
import com.samples.dagger.demo.tracking.TrackingExporter;
import com.samples.dagger.demo.tracking.TrackingHandler;
import com.samples.dagger.demo.tracking.TrackingIdentifier;
import com.samples.dagger.demo.viewmodel.MainViewModel;
import com.samples.dagger.demo.viewmodel.MainViewModelSubcomponent;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.SetFactory;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class DaggerAppComponent {
    private static final Provider ABSENT_JDK_OPTIONAL_PROVIDER = InstanceFactory.create(Optional.empty());

    private DaggerAppComponent() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AppComponent create() {
        return new Builder().build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> Provider<Optional<T>> absentJdkOptionalProvider() {
        Provider<Optional<T>> provider = ABSENT_JDK_OPTIONAL_PROVIDER;
        return provider;
    }

    public static final class Builder {
        private Builder() {
        }

        public AppComponent build() {
            return new AppComponentImpl();
        }
    }

    private static final class MainActivitySubComponentFactory implements MainActivitySubComponent.Factory {
        private final AppComponentImpl appComponentImpl;

        private MainActivitySubComponentFactory(AppComponentImpl appComponentImpl) {
            this.appComponentImpl = appComponentImpl;
        }

        @Override // com.samples.dagger.demo.di.MainActivitySubComponent.Factory
        public MainActivitySubComponent create() {
            return new MainActivitySubComponentImpl(this.appComponentImpl);
        }
    }

    private static final class MainViewModelSubcomponentFactory implements MainViewModelSubcomponent.Factory {
        private final AppComponentImpl appComponentImpl;
        private final MainActivitySubComponentImpl mainActivitySubComponentImpl;

        private MainViewModelSubcomponentFactory(AppComponentImpl appComponentImpl, MainActivitySubComponentImpl mainActivitySubComponentImpl) {
            this.appComponentImpl = appComponentImpl;
            this.mainActivitySubComponentImpl = mainActivitySubComponentImpl;
        }

        @Override // com.samples.dagger.demo.viewmodel.MainViewModelSubcomponent.Factory
        public MainViewModelSubcomponent create(SavedStateHandle savedStateHandle) {
            Preconditions.checkNotNull(savedStateHandle);
            return new MainViewModelSubcomponentImpl(this.appComponentImpl, this.mainActivitySubComponentImpl, savedStateHandle);
        }
    }

    private static final class MainViewModelSubcomponentImpl implements MainViewModelSubcomponent {
        private final AppComponentImpl appComponentImpl;
        private final MainActivitySubComponentImpl mainActivitySubComponentImpl;
        private final MainViewModelSubcomponentImpl mainViewModelSubcomponentImpl = this;
        private final SavedStateHandle savedStateHandle;

        MainViewModelSubcomponentImpl(AppComponentImpl appComponentImpl, MainActivitySubComponentImpl mainActivitySubComponentImpl, SavedStateHandle savedStateHandleParam) {
            this.appComponentImpl = appComponentImpl;
            this.mainActivitySubComponentImpl = mainActivitySubComponentImpl;
            this.savedStateHandle = savedStateHandleParam;
        }

        @Override // com.samples.dagger.demo.viewmodel.MainViewModelSubcomponent
        public MainViewModel getMainViewModel() {
            return new MainViewModel(this.appComponentImpl.trackingHandler(), this.appComponentImpl.defaultDataSource(), this.savedStateHandle);
        }
    }

    private static final class MainActivitySubComponentImpl implements MainActivitySubComponent {
        private final AppComponentImpl appComponentImpl;
        private final MainActivitySubComponentImpl mainActivitySubComponentImpl = this;

        MainActivitySubComponentImpl(AppComponentImpl appComponentImpl) {
            this.appComponentImpl = appComponentImpl;
        }

        @Override // com.samples.dagger.demo.di.MainActivitySubComponent
        public MainViewModelSubcomponent.Factory getMainActivitySubComponentFactory() {
            return new MainViewModelSubcomponentFactory(this.appComponentImpl, this.mainActivitySubComponentImpl);
        }

        @Override // com.samples.dagger.demo.di.MainActivitySubComponent
        public void inject(MainActivity activity) {
            injectMainActivity(activity);
        }

        private MainActivity injectMainActivity(MainActivity instance) {
            MainActivity_MembersInjector.injectErrorHandler(instance, this.appComponentImpl.defaultErrorHandler());
            MainActivity_MembersInjector.injectTrackingHandler(instance, this.appComponentImpl.trackingHandler());
            MainActivity_MembersInjector.injectDataSource(instance, this.appComponentImpl.defaultDataSource());
            MainActivity_MembersInjector.injectMainViewModelSubcomponentFactory(instance, new MainViewModelSubcomponentFactory(this.appComponentImpl, this.mainActivitySubComponentImpl));
            return instance;
        }
    }

    private static final class AppComponentImpl implements AppComponent {
        private final AppComponentImpl appComponentImpl = this;
        Provider<Set<TrackingAdapter>> newTrackingQualifierSetOfTrackingAdapterProvider;
        Provider<Set<TrackingAdapter>> oldTrackingQualifierSetOfTrackingAdapterProvider;
        Provider<Optional<TrackingExporter>> optionalOfTrackingExporterProvider;
        Provider<TrackingAdapter9> trackingAdapter9Provider;

        AppComponentImpl() {
            initialize();
        }

        DefaultErrorHandler defaultErrorHandler() {
            return new DefaultErrorHandler(new DefaultLogging());
        }

        Map<Class<?>, javax.inject.Provider<TrackingIdentifier>> mapOfClassOfObjectAndProviderOfTrackingIdentifier() {
            return Collections.singletonMap(OldTrackingIdentifier.class, OldTrackingIdentifier_Factory.create());
        }

        TrackingHandler trackingHandler() {
            return TrackingModule_Companion_ProvidesTrackingHandlerFactory.providesTrackingHandler(this.oldTrackingQualifierSetOfTrackingAdapterProvider, this.newTrackingQualifierSetOfTrackingAdapterProvider, mapOfClassOfObjectAndProviderOfTrackingIdentifier());
        }

        ScreenContextProvider screenContextProvider() {
            return new ScreenContextProvider(new AppNameInfo(), new AppVersionInfo());
        }

        DefaultDataSource defaultDataSource() {
            return new DefaultDataSource(screenContextProvider(), trackingHandler());
        }

        private void initialize() {
            this.oldTrackingQualifierSetOfTrackingAdapterProvider = oldTrackingQualifierSetOfTrackingAdapterBuilder();
            this.optionalOfTrackingExporterProvider = DaggerAppComponent.absentJdkOptionalProvider();
            this.trackingAdapter9Provider = TrackingAdapter9_Factory.create(this.optionalOfTrackingExporterProvider);
            this.newTrackingQualifierSetOfTrackingAdapterProvider = newTrackingQualifierSetOfTrackingAdapterBuilder();
        }

        SetFactory<TrackingAdapter> oldTrackingQualifierSetOfTrackingAdapterBuilder() {
            SetFactory.Builder<TrackingAdapter> builder = SetFactory.builder(1, 0);
            builder.addProvider(TrackingAdapter2_Factory.create());
            return builder.build();
        }

        SetFactory<TrackingAdapter> newTrackingQualifierSetOfTrackingAdapterBuilder() {
            SetFactory.Builder<TrackingAdapter> builder = SetFactory.builder(7, 0);
            builder.addProvider(TrackingAdapter3_Factory.create());
            builder.addProvider(TrackingAdapter4_Factory.create());
            builder.addProvider(TrackingAdapter5_Factory.create());
            builder.addProvider(TrackingAdapter6_Factory.create());
            builder.addProvider(TrackingAdapter7_Factory.create());
            builder.addProvider(TrackingAdapter8_Factory.create());
            builder.addProvider(this.trackingAdapter9Provider);
            return builder.build();
        }

        @Override // com.samples.dagger.demo.di.AppComponent
        public MainActivitySubComponent.Factory getMainActivitySubComponentFactory() {
            return new MainActivitySubComponentFactory(this.appComponentImpl);
        }
    }
}
