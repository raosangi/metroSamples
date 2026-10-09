package com.samples.dagger.demo.di;

import androidx.lifecycle.SavedStateHandle;
import com.samples.dagger.demo.MainActivity;
import com.samples.dagger.demo.MainActivity_MembersInjector;
import com.samples.dagger.demo.errors.DefaultErrorHandler;
import com.samples.dagger.demo.network.AppScreenDetailHandler_Factory;
import com.samples.dagger.demo.network.DefaultDataSource;
import com.samples.dagger.demo.network.MainScreenDetailHandler_Factory;
import com.samples.dagger.demo.network.ScreenDetailHandler;
import com.samples.dagger.demo.tracking.DefaultTrackingHandler;
import com.samples.dagger.demo.tracking.MainActivityTrackingAdapter;
import com.samples.dagger.demo.tracking.TrackingAdapter;
import com.samples.dagger.demo.tracking.TrackingAdapter2;
import com.samples.dagger.demo.tracking.TrackingAdapter3;
import com.samples.dagger.demo.viewmodel.MainViewModel;
import com.samples.dagger.demo.viewmodel.MainViewModelSubcomponent;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dagger.internal.SetBuilder;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class DaggerAppComponent {
    private DaggerAppComponent() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AppComponent create() {
        return new Builder().build();
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

        Set setOfTrackingAdapterBuilder() {
            SetBuilder setBuilder = SetBuilder.newSetBuilder(3);
            setBuilder.add(new TrackingAdapter2());
            setBuilder.add(new TrackingAdapter3());
            setBuilder.add(new MainActivityTrackingAdapter());
            return setBuilder.build();
        }

        Set<TrackingAdapter> setOfTrackingAdapter() {
            return setOfTrackingAdapterBuilder();
        }

        DefaultTrackingHandler defaultTrackingHandler() {
            return new DefaultTrackingHandler(setOfTrackingAdapter());
        }

        Map mapOfStringAndProviderOfScreenDetailHandlerBuilder() {
            MapBuilder mapBuilder = MapBuilder.newMapBuilder(2);
            mapBuilder.put("App", AppScreenDetailHandler_Factory.create());
            mapBuilder.put("Main", MainScreenDetailHandler_Factory.create());
            return mapBuilder.build();
        }

        Map<String, Provider<ScreenDetailHandler>> mapOfStringAndProviderOfScreenDetailHandler() {
            return mapOfStringAndProviderOfScreenDetailHandlerBuilder();
        }

        DefaultDataSource defaultDataSource() {
            return new DefaultDataSource(mapOfStringAndProviderOfScreenDetailHandler());
        }

        @Override // com.samples.dagger.demo.viewmodel.MainViewModelSubcomponent
        public MainViewModel getMainViewModel() {
            return new MainViewModel(defaultTrackingHandler(), defaultDataSource(), this.savedStateHandle);
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
            MainActivity_MembersInjector.injectErrorHandler(instance, new DefaultErrorHandler());
            MainActivity_MembersInjector.injectTrackingHandler(instance, this.appComponentImpl.defaultTrackingHandler());
            MainActivity_MembersInjector.injectDataSource(instance, this.appComponentImpl.defaultDataSource());
            MainActivity_MembersInjector.injectMainViewModelSubcomponentFactory(instance, new MainViewModelSubcomponentFactory(this.appComponentImpl, this.mainActivitySubComponentImpl));
            return instance;
        }
    }

    private static final class AppComponentImpl implements AppComponent {
        private final AppComponentImpl appComponentImpl = this;

        AppComponentImpl() {
        }

        Set setOfTrackingAdapterBuilder() {
            SetBuilder setBuilder = SetBuilder.newSetBuilder(2);
            setBuilder.add(new TrackingAdapter2());
            setBuilder.add(new TrackingAdapter3());
            return setBuilder.build();
        }

        Set<TrackingAdapter> setOfTrackingAdapter() {
            return setOfTrackingAdapterBuilder();
        }

        DefaultTrackingHandler defaultTrackingHandler() {
            return new DefaultTrackingHandler(setOfTrackingAdapter());
        }

        Map<String, Provider<ScreenDetailHandler>> mapOfStringAndProviderOfScreenDetailHandler() {
            return Collections.singletonMap("App", AppScreenDetailHandler_Factory.create());
        }

        DefaultDataSource defaultDataSource() {
            return new DefaultDataSource(mapOfStringAndProviderOfScreenDetailHandler());
        }

        @Override // com.samples.dagger.demo.di.AppComponent
        public MainActivitySubComponent.Factory getMainActivitySubComponentFactory() {
            return new MainActivitySubComponentFactory(this.appComponentImpl);
        }
    }
}
