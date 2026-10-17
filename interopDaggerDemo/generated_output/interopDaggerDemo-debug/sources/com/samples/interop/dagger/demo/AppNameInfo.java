package com.samples.interop.dagger.demo;

import dev.zacsweers.metro.internal.Factory;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* JADX INFO: compiled from: AppInfo.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\r\b\u0007\u001a\u0002\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bÊ\u0001\f\b\u000b\u0012\b\b\f\u0012\u0004\b\u0003\u0010\u0002\u008a\u0002\u0016\b\r\u0012\u0012\b\u0001\u001a\u000e\n\fMetroFactory¨\u0006\n"}, d2 = {"Lcom/samples/interop/dagger/demo/AppNameInfo;", "", "<init>", "()V", "Ljavax/inject/Inject;", "appName", "", "getAppName", "()Ljava/lang/String;", "MetroFactory", "interopDaggerDemo", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters", "dev.zacsweers.metro.compiler"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class AppNameInfo {
    public static final int $stable = 0;
    private final String appName = "com.samples.metro.demo";

    /* JADX INFO: compiled from: AppInfo.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\u00020\u0000H\u0007b\u0002\b\u0005J\f\u0010\u0006\u001a\u00020\u0007H\u0007b\u0002\b\bJ\b\u0010\t\u001a\u00020\u0007H\u0007J\f\u0010\n\u001a\u00020\u0007H\u0007b\u0002\b\u0005Ê\u0001\u0018\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\n\b\u000f\u0012\u0006\b\n0\u00108\u0011Ê\u0001\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000b"}, d2 = {"Lcom/samples/interop/dagger/demo/AppNameInfo$MetroFactory;", "", "<init>", "()V", "create", "Lkotlin/jvm/JvmStatic;", "declarationMirror", "Lcom/samples/interop/dagger/demo/AppNameInfo;", "Ldev/zacsweers/metro/internal/ComptimeOnly;", "invoke", "newInstance", "interopDaggerDemo", "Lkotlin/Deprecated;", "message", "This synthesized declaration should not be used directly", "level", "Lkotlin/DeprecationLevel;", "HIDDEN", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final class MetroFactory implements Factory<AppNameInfo> {
        public static final int $stable = 0;
        public static final MetroFactory INSTANCE = new MetroFactory();

        @JvmStatic
        public static final MetroFactory create() {
            return INSTANCE;
        }

        @JvmStatic
        public static final AppNameInfo newInstance() {
            return new AppNameInfo();
        }

        public final AppNameInfo declarationMirror() {
            throw new IllegalStateException("Never called".toString());
        }

        @Override // dev.zacsweers.metro.Provider, kotlin.jvm.functions.Function0
        public final AppNameInfo invoke() {
            return newInstance();
        }

        private MetroFactory() {
        }
    }

    @Inject
    public AppNameInfo() {
    }

    public final String getAppName() {
        return this.appName;
    }
}
