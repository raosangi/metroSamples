package com.samples.interop.dagger.demo.di;

import com.samples.interop.dagger.demo.errors.DefaultErrorHandler;
import com.samples.interop.dagger.demo.errors.ErrorHandler;
import dagger.Binds;
import dagger.Module;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ErrorModule.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'b\u0002\b\u0006Ê\u0001\u0002\b\b\u008a\u0002\b\b\t\u0012\u0004\b\u0001\u0012\u0000¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/samples/interop/dagger/demo/di/ErrorModule;", "", "bindsErrorHandler", "Lcom/samples/interop/dagger/demo/errors/ErrorHandler;", "instance", "Lcom/samples/interop/dagger/demo/errors/DefaultErrorHandler;", "Ldagger/Binds;", "interopDaggerDemo", "Ldagger/Module;", "dev.zacsweers.metro.compiler"}, k = 1, mv = {2, 4, 0}, xi = 48)
@Module
public interface ErrorModule {

    /* JADX INFO: compiled from: ErrorModule.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class DefaultImpls {
        @Binds
        @Deprecated
        public static ErrorHandler bindsErrorHandler(ErrorModule $this, DefaultErrorHandler instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            return ErrorModule.super.bindsErrorHandler(instance);
        }
    }

    @Binds
    default ErrorHandler bindsErrorHandler(DefaultErrorHandler instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        throw new IllegalStateException("Never called".toString());
    }
}
