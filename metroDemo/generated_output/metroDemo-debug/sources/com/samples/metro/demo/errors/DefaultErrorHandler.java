package com.samples.metro.demo.errors;

import android.util.Log;
import dev.zacsweers.metro.Inject;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.Factory;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ErrorHandler.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\u0015\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0002\b\u0006¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016Ê\u0001\f\b\r\u0012\b\b\u000e\u0012\u0004\b\u0003\u0010\u0002\u008a\u0002\u0016\b\u000f\u0012\u0012\b\u0001\u001a\u000e\n\fMetroFactory¨\u0006\f"}, d2 = {"Lcom/samples/metro/demo/errors/DefaultErrorHandler;", "Lcom/samples/metro/demo/errors/ErrorHandler;", "logging", "Lcom/samples/metro/demo/errors/DefaultLogging;", "<init>", "(Lcom/samples/metro/demo/errors/DefaultLogging;)V", "Ldev/zacsweers/metro/Inject;", "handleError", "", "message", "", "MetroFactory", "metroDemo", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters", "dev.zacsweers.metro.compiler"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class DefaultErrorHandler implements ErrorHandler {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: ErrorHandler.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001:\u0001\bJ\u0014\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007b\u0002\b\u0006J\b\u0010\u0007\u001a\u00020\u0003H\u0007Ê\u0001\u0018\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\n\b\r\u0012\u0006\b\n0\u000e8\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0000¨\u0006\t"}, d2 = {"Lcom/samples/metro/demo/errors/DefaultErrorHandler$MetroFactory;", "", "declarationMirror", "Lcom/samples/metro/demo/errors/DefaultErrorHandler;", "logging", "Lcom/samples/metro/demo/errors/DefaultLogging;", "Ldev/zacsweers/metro/internal/ComptimeOnly;", "invoke", "Companion", "metroDemo", "Lkotlin/Deprecated;", "message", "This synthesized declaration should not be used directly", "level", "Lkotlin/DeprecationLevel;", "HIDDEN", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final class MetroFactory implements Factory<DefaultErrorHandler> {
        private final Provider<DefaultLogging> logging;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        private MetroFactory(Provider<DefaultLogging> provider) {
            this.logging = provider;
        }

        public /* synthetic */ MetroFactory(Provider provider, DefaultConstructorMarker defaultConstructorMarker) {
            this(provider);
        }

        @JvmStatic
        public static final MetroFactory create(Provider<DefaultLogging> provider) {
            return Companion.create(provider);
        }

        @JvmStatic
        public static final DefaultErrorHandler newInstance(DefaultLogging defaultLogging) {
            return Companion.newInstance(defaultLogging);
        }

        public final DefaultErrorHandler declarationMirror(DefaultLogging logging) {
            Intrinsics.checkNotNullParameter(logging, "logging");
            throw new IllegalStateException("Never called".toString());
        }

        @Override // dev.zacsweers.metro.Provider, kotlin.jvm.functions.Function0
        public final DefaultErrorHandler invoke() {
            return Companion.newInstance(this.logging.invoke());
        }

        /* JADX INFO: compiled from: ErrorHandler.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007b\u0002\b\tJ\u0014\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\bH\u0007b\u0002\b\t¨\u0006\f"}, d2 = {"Lcom/samples/metro/demo/errors/DefaultErrorHandler$MetroFactory$Companion;", "", "<init>", "()V", "create", "Lcom/samples/metro/demo/errors/DefaultErrorHandler$MetroFactory;", "logging", "Ldev/zacsweers/metro/Provider;", "Lcom/samples/metro/demo/errors/DefaultLogging;", "Lkotlin/jvm/JvmStatic;", "newInstance", "Lcom/samples/metro/demo/errors/DefaultErrorHandler;", "metroDemo"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final MetroFactory create(Provider<DefaultLogging> logging) {
                Intrinsics.checkNotNullParameter(logging, "logging");
                return new MetroFactory(logging, null);
            }

            @JvmStatic
            public final DefaultErrorHandler newInstance(DefaultLogging logging) {
                Intrinsics.checkNotNullParameter(logging, "logging");
                return new DefaultErrorHandler(logging);
            }

            private Companion() {
            }
        }
    }

    @Inject
    public DefaultErrorHandler(DefaultLogging logging) {
        Intrinsics.checkNotNullParameter(logging, "logging");
    }

    @Override // com.samples.metro.demo.errors.ErrorHandler
    public void handleError(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.d("ErrorHandler", message);
    }
}
