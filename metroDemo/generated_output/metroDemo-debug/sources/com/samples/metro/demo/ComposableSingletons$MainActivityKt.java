package com.samples.metro.demo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: MainActivity.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
public final class ComposableSingletons$MainActivityKt {
    public static final ComposableSingletons$MainActivityKt INSTANCE = new ComposableSingletons$MainActivityKt();

    /* JADX INFO: renamed from: lambda$-768082633, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f79lambda$768082633 = ComposableLambdaKt.composableLambdaInstance(-768082633, false, new Function2() { // from class: com.samples.metro.demo.ComposableSingletons$MainActivityKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MainActivityKt.lambda__768082633$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-768082633$metroDemo, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7594getLambda$768082633$metroDemo() {
        return f79lambda$768082633;
    }

    static final Unit lambda__768082633$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C88@2796L19:MainActivity.kt#g6mhue");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-768082633, $changed, -1, "com.samples.metro.demo.ComposableSingletons$MainActivityKt.lambda$-768082633.<anonymous> (MainActivity.kt:88)");
            }
            MainActivityKt.Greeting("Android", null, $composer, 6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
