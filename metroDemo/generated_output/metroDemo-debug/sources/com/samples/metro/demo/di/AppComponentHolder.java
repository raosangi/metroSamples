package com.samples.metro.demo.di;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: AppComponent.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007Ê\u0001\f\b\u000b\u0012\b\b\f\u0012\u0004\b\u0003\u0010\u0002¨\u0006\n"}, d2 = {"Lcom/samples/metro/demo/di/AppComponentHolder;", "", "<init>", "()V", "appComponent", "Lcom/samples/metro/demo/di/AppComponent;", "getAppComponent", "()Lcom/samples/metro/demo/di/AppComponent;", "appComponent$delegate", "Lkotlin/Lazy;", "metroDemo", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class AppComponentHolder {
    public static final int $stable = 0;
    public static final AppComponentHolder INSTANCE = new AppComponentHolder();

    /* JADX INFO: renamed from: appComponent$delegate, reason: from kotlin metadata */
    private static final Lazy appComponent = LazyKt.lazy(new Function0() { // from class: com.samples.metro.demo.di.AppComponentHolder$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppComponent.INSTANCE.invoke();
        }
    });

    private AppComponentHolder() {
    }

    public final AppComponent getAppComponent() {
        return (AppComponent) appComponent.getValue();
    }
}
