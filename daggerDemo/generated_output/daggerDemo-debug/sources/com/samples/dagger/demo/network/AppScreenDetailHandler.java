package com.samples.dagger.demo.network;

import android.util.Log;
import javax.inject.Inject;
import kotlin.Metadata;

/* JADX INFO: compiled from: ScreenDetailHandler.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\b\u0007\u001a\u0002\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0005\u001a\u00020\u0006H\u0016Ê\u0001\f\b\b\u0012\b\b\t\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0007"}, d2 = {"Lcom/samples/dagger/demo/network/AppScreenDetailHandler;", "Lcom/samples/dagger/demo/network/ScreenDetailHandler;", "<init>", "()V", "Ljavax/inject/Inject;", "getScreenContext", "", "daggerDemo", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class AppScreenDetailHandler implements ScreenDetailHandler {
    public static final int $stable = 0;

    @Inject
    public AppScreenDetailHandler() {
    }

    @Override // com.samples.dagger.demo.network.ScreenDetailHandler
    public String getScreenContext() {
        Log.d("ScreenDetailHandler", "invoke with app context");
        return "app";
    }
}
