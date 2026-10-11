package com.samples.interop.dagger.demo.di;

import com.samples.interop.dagger.demo.errors.DefaultErrorHandler;
import com.samples.interop.dagger.demo.errors.ErrorHandler;
import dagger.Module;
import dev.zacsweers.metro.Binds;
import dev.zacsweers.metro.internal.CallableMetadata;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ErrorModule.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001:\u0001\u0007J\u0014\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'b\u0002\b\u0006Ê\u0001\u0002\b\t\u008a\u0002\b\b\n\u0012\u0004\b\u0001\u0012\u0000¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/samples/interop/dagger/demo/di/ErrorModule;", "", "bindsErrorHandler", "Lcom/samples/interop/dagger/demo/errors/ErrorHandler;", "instance", "Lcom/samples/interop/dagger/demo/errors/DefaultErrorHandler;", "Ldagger/Binds;", "BindsMirror", "interopDaggerDemo", "Ldagger/Module;", "dev.zacsweers.metro.compiler"}, k = 1, mv = {2, 4, 0}, xi = 48)
@Module
public interface ErrorModule {

    /* JADX INFO: compiled from: ErrorModule.kt */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JB\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007b\u0002\b\bb,\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0004\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\t\b\r\u0012\u0005\b\u0003\u0010\u0086\u0004\u0012\t\b\u000e\u0012\u0005\b\u0003\u0010\u008a\u0005Ê\u0001\u0018\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\n\b\u0013\u0012\u0006\b\n0\u00148\u0015Ê\u0001\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u000f"}, d2 = {"Lcom/samples/interop/dagger/demo/di/ErrorModule$BindsMirror;", "", "<init>", "()V", "bindsErrorHandler", "Lcom/samples/interop/dagger/demo/errors/ErrorHandler;", "instance", "Lcom/samples/interop/dagger/demo/errors/DefaultErrorHandler;", "Ldev/zacsweers/metro/Binds;", "Ldev/zacsweers/metro/internal/CallableMetadata;", "callableName", "propertyName", "", "startOffset", "endOffset", "interopDaggerDemo", "Lkotlin/Deprecated;", "message", "This synthesized declaration should not be used directly", "level", "Lkotlin/DeprecationLevel;", "HIDDEN", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static abstract class BindsMirror {
        public static final int $stable = 8;

        private BindsMirror() {
        }

        @Binds
        @CallableMetadata(callableName = "bindsErrorHandler", endOffset = 325, propertyName = "", startOffset = 259)
        public final ErrorHandler bindsErrorHandler(DefaultErrorHandler instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            throw new IllegalStateException("Never called".toString());
        }
    }

    /* JADX INFO: compiled from: ErrorModule.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class DefaultImpls {
        @dagger.Binds
        @Deprecated
        public static ErrorHandler bindsErrorHandler(ErrorModule $this, DefaultErrorHandler instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            return ErrorModule.super.bindsErrorHandler(instance);
        }
    }

    @dagger.Binds
    default ErrorHandler bindsErrorHandler(DefaultErrorHandler instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        throw new IllegalStateException("Never called".toString());
    }
}
