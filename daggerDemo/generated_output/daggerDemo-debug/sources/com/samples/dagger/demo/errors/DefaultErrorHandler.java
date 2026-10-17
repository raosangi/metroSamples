package com.samples.dagger.demo.errors;

import android.util.Log;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ErrorHandler.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0002\b\u0006¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016Ê\u0001\f\b\f\u0012\b\b\r\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000b"}, d2 = {"Lcom/samples/dagger/demo/errors/DefaultErrorHandler;", "Lcom/samples/dagger/demo/errors/ErrorHandler;", "defaultLogging", "Lcom/samples/dagger/demo/errors/DefaultLogging;", "<init>", "(Lcom/samples/dagger/demo/errors/DefaultLogging;)V", "Ljavax/inject/Inject;", "handleError", "", "message", "", "daggerDemo", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class DefaultErrorHandler implements ErrorHandler {
    public static final int $stable = 0;

    @Inject
    public DefaultErrorHandler(DefaultLogging defaultLogging) {
        Intrinsics.checkNotNullParameter(defaultLogging, "defaultLogging");
    }

    @Override // com.samples.dagger.demo.errors.ErrorHandler
    public void handleError(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.d("ErrorHandler", message);
    }
}
