package com.samples.dagger.demo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: MainActivity.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
public final class ComposableSingletons$MainActivityKt {
    public static final ComposableSingletons$MainActivityKt INSTANCE = new ComposableSingletons$MainActivityKt();

    /* JADX INFO: renamed from: lambda$-262360092, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f79lambda$262360092 = ComposableLambdaKt.composableLambdaInstance(-262360092, false, new Function2() { // from class: com.samples.dagger.demo.ComposableSingletons$MainActivityKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MainActivityKt.lambda__262360092$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-262360092$daggerDemo, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7595getLambda$262360092$daggerDemo() {
        return f79lambda$262360092;
    }

    static final Unit lambda__262360092$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C88@2788L19:MainActivity.kt#j0rp11");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-262360092, $changed, -1, "com.samples.dagger.demo.ComposableSingletons$MainActivityKt.lambda$-262360092.<anonymous> (MainActivity.kt:88)");
            }
            MainActivityKt.Greeting("Android", null, $composer, 6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
