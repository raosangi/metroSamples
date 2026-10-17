package com.samples.interop.dagger.demo.network;

import com.samples.interop.dagger.demo.AppNameInfo;
import com.samples.interop.dagger.demo.AppVersionInfo;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.Factory;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DataSource.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0002\b\b¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fÊ\u0001\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\u0003\u0010\u0000\u008a\u0002\u0016\b\u0013\u0012\u0012\b\u0001\u001a\u000e\n\fMetroFactory¨\u0006\u0010"}, d2 = {"Lcom/samples/interop/dagger/demo/network/ScreenContextProvider;", "", "appNameInfo", "Lcom/samples/interop/dagger/demo/AppNameInfo;", "appVersionInfo", "Lcom/samples/interop/dagger/demo/AppVersionInfo;", "<init>", "(Lcom/samples/interop/dagger/demo/AppNameInfo;Lcom/samples/interop/dagger/demo/AppVersionInfo;)V", "Ljavax/inject/Inject;", "getAppNameInfo", "()Lcom/samples/interop/dagger/demo/AppNameInfo;", "getAppVersionInfo", "()Lcom/samples/interop/dagger/demo/AppVersionInfo;", "getApplicableContext", "", "MetroFactory", "interopDaggerDemo", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters", "dev.zacsweers.metro.compiler"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ScreenContextProvider {
    public static final int $stable = AppVersionInfo.$stable | AppNameInfo.$stable;
    private final AppNameInfo appNameInfo;
    private final AppVersionInfo appVersionInfo;

    /* JADX INFO: compiled from: DataSource.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001:\u0001\nJ\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007b\u0002\b\bJ\b\u0010\t\u001a\u00020\u0003H\u0007Ê\u0001\u0018\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\n\b\u000f\u0012\u0006\b\n0\u00108\u0011Ê\u0001\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000b"}, d2 = {"Lcom/samples/interop/dagger/demo/network/ScreenContextProvider$MetroFactory;", "", "declarationMirror", "Lcom/samples/interop/dagger/demo/network/ScreenContextProvider;", "appNameInfo", "Lcom/samples/interop/dagger/demo/AppNameInfo;", "appVersionInfo", "Lcom/samples/interop/dagger/demo/AppVersionInfo;", "Ldev/zacsweers/metro/internal/ComptimeOnly;", "invoke", "Companion", "interopDaggerDemo", "Lkotlin/Deprecated;", "message", "This synthesized declaration should not be used directly", "level", "Lkotlin/DeprecationLevel;", "HIDDEN", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final class MetroFactory implements Factory<ScreenContextProvider> {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final Provider<AppNameInfo> appNameInfo;
        private final Provider<AppVersionInfo> appVersionInfo;

        private MetroFactory(Provider<AppNameInfo> provider, Provider<AppVersionInfo> provider2) {
            this.appNameInfo = provider;
            this.appVersionInfo = provider2;
        }

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, DefaultConstructorMarker defaultConstructorMarker) {
            this(provider, provider2);
        }

        @JvmStatic
        public static final MetroFactory create(Provider<AppNameInfo> provider, Provider<AppVersionInfo> provider2) {
            return Companion.create(provider, provider2);
        }

        @JvmStatic
        public static final ScreenContextProvider newInstance(AppNameInfo appNameInfo, AppVersionInfo appVersionInfo) {
            return Companion.newInstance(appNameInfo, appVersionInfo);
        }

        public final ScreenContextProvider declarationMirror(AppNameInfo appNameInfo, AppVersionInfo appVersionInfo) {
            Intrinsics.checkNotNullParameter(appNameInfo, "appNameInfo");
            Intrinsics.checkNotNullParameter(appVersionInfo, "appVersionInfo");
            throw new IllegalStateException("Never called".toString());
        }

        @Override // dev.zacsweers.metro.Provider, kotlin.jvm.functions.Function0
        public final ScreenContextProvider invoke() {
            return Companion.newInstance(this.appNameInfo.invoke(), this.appVersionInfo.invoke());
        }

        /* JADX INFO: compiled from: DataSource.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007b\u0002\b\u000bJ\u001c\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007b\u0002\b\u000b¨\u0006\u000e"}, d2 = {"Lcom/samples/interop/dagger/demo/network/ScreenContextProvider$MetroFactory$Companion;", "", "<init>", "()V", "create", "Lcom/samples/interop/dagger/demo/network/ScreenContextProvider$MetroFactory;", "appNameInfo", "Ldev/zacsweers/metro/Provider;", "Lcom/samples/interop/dagger/demo/AppNameInfo;", "appVersionInfo", "Lcom/samples/interop/dagger/demo/AppVersionInfo;", "Lkotlin/jvm/JvmStatic;", "newInstance", "Lcom/samples/interop/dagger/demo/network/ScreenContextProvider;", "interopDaggerDemo"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final MetroFactory create(Provider<AppNameInfo> appNameInfo, Provider<AppVersionInfo> appVersionInfo) {
                Intrinsics.checkNotNullParameter(appNameInfo, "appNameInfo");
                Intrinsics.checkNotNullParameter(appVersionInfo, "appVersionInfo");
                return new MetroFactory(appNameInfo, appVersionInfo, null);
            }

            @JvmStatic
            public final ScreenContextProvider newInstance(AppNameInfo appNameInfo, AppVersionInfo appVersionInfo) {
                Intrinsics.checkNotNullParameter(appNameInfo, "appNameInfo");
                Intrinsics.checkNotNullParameter(appVersionInfo, "appVersionInfo");
                return new ScreenContextProvider(appNameInfo, appVersionInfo);
            }

            private Companion() {
            }
        }
    }

    @Inject
    public ScreenContextProvider(AppNameInfo appNameInfo, AppVersionInfo appVersionInfo) {
        Intrinsics.checkNotNullParameter(appNameInfo, "appNameInfo");
        Intrinsics.checkNotNullParameter(appVersionInfo, "appVersionInfo");
        this.appNameInfo = appNameInfo;
        this.appVersionInfo = appVersionInfo;
    }

    public final AppNameInfo getAppNameInfo() {
        return this.appNameInfo;
    }

    public final AppVersionInfo getAppVersionInfo() {
        return this.appVersionInfo;
    }

    public final String getApplicableContext() {
        return this.appVersionInfo.getAppVersion() + " + " + this.appNameInfo.getAppName();
    }
}
