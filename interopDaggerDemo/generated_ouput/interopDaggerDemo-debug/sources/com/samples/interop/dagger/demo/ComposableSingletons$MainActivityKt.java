package com.samples.interop.dagger.demo;

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
    private static Function2<Composer, Integer, Unit> lambda$743914997 = ComposableLambdaKt.composableLambdaInstance(743914997, false, new Function2() { // from class: com.samples.interop.dagger.demo.ComposableSingletons$MainActivityKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MainActivityKt.lambda_743914997$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$743914997$interopDaggerDemo() {
        return lambda$743914997;
    }

    static final Unit lambda_743914997$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C87@2860L19:MainActivity.kt#ipvxa4");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(743914997, $changed, -1, "com.samples.interop.dagger.demo.ComposableSingletons$MainActivityKt.lambda$743914997.<anonymous> (MainActivity.kt:87)");
            }
            MainActivityKt.Greeting("Android", null, $composer, 6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
