package com.samples.metro.demo.theme;

import android.content.Context;
import android.os.Build;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.DynamicTonalPaletteKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Theme.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aF\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0002\b\nH\u0007b\u0002\b\nb\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e¢\u0006\u0002\u0010\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"DarkColorScheme", "Landroidx/compose/material3/ColorScheme;", "LightColorScheme", "MeetaTheme", "", "darkTheme", "", "dynamicColor", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/runtime/ComposableInferredTarget;", "scheme", "[0[0]]", "metroDemo"}, k = 2, mv = {2, 4, 0}, xi = 48)
public final class ThemeKt {
    private static final ColorScheme DarkColorScheme = ColorSchemeKt.m2054darkColorSchemeCXl9yA$default(ColorKt.getPurple80(), 0, 0, 0, 0, ColorKt.getPurpleGrey80(), 0, 0, 0, ColorKt.getPink80(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -546, 15, null);
    private static final ColorScheme LightColorScheme = ColorSchemeKt.m2058lightColorSchemeCXl9yA$default(ColorKt.getPurple40(), 0, 0, 0, 0, ColorKt.getPurpleGrey40(), 0, 0, 0, ColorKt.getPink40(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -546, 15, null);

    static final Unit MeetaTheme$lambda$0(boolean z, boolean z2, Function2 function2, int i, int i2, Composer composer, int i3) {
        MeetaTheme(z, z2, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void MeetaTheme(boolean darkTheme, boolean dynamicColor, final Function2<? super Composer, ? super Integer, Unit> content, Composer $composer, final int $changed, final int i) {
        final boolean darkTheme2;
        final boolean dynamicColor2;
        ColorScheme colorScheme;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer $composer2 = $composer.startRestartGroup(1444020464);
        ComposerKt.sourceInformation($composer2, "C(MeetaTheme)N(darkTheme,dynamicColor,content)52@1576L114:Theme.kt#arjqbf");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= ((i & 1) == 0 && $composer2.changed(darkTheme)) ? 4 : 2;
        }
        int i2 = i & 2;
        if (i2 != 0) {
            $dirty |= 48;
        } else if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(dynamicColor) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(content) ? 256 : 128;
        }
        if ($composer2.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
            $composer2.startDefaults();
            ComposerKt.sourceInformation($composer2, "37@1089L21");
            if (($changed & 1) != 0 && !$composer2.getDefaultsInvalid()) {
                $composer2.skipToGroupEnd();
                if ((i & 1) != 0) {
                    $dirty &= -15;
                }
            } else {
                if ((i & 1) != 0) {
                    darkTheme = DarkThemeKt.isSystemInDarkTheme($composer2, 0);
                    $dirty &= -15;
                }
                if (i2 != 0) {
                    dynamicColor = true;
                }
            }
            $composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1444020464, $dirty, -1, "com.samples.metro.demo.theme.MeetaTheme (Theme.kt:41)");
            }
            if (dynamicColor && Build.VERSION.SDK_INT >= 31) {
                $composer2.startReplaceGroup(421498775);
                ComposerKt.sourceInformation($composer2, "44@1379L7");
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object objConsume = $composer2.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                Context context = (Context) objConsume;
                ColorScheme colorSchemeDynamicDarkColorScheme = darkTheme ? DynamicTonalPaletteKt.dynamicDarkColorScheme(context) : DynamicTonalPaletteKt.dynamicLightColorScheme(context);
                $composer2.endReplaceGroup();
                colorScheme = colorSchemeDynamicDarkColorScheme;
            } else if (darkTheme) {
                $composer2.startReplaceGroup(429244287);
                $composer2.endReplaceGroup();
                colorScheme = DarkColorScheme;
            } else {
                $composer2.startReplaceGroup(429245312);
                $composer2.endReplaceGroup();
                colorScheme = LightColorScheme;
            }
            MaterialThemeKt.MaterialTheme(colorScheme, null, TypeKt.getTypography(), content, $composer2, ($dirty << 3) & 7168, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            darkTheme2 = darkTheme;
            dynamicColor2 = dynamicColor;
        } else {
            $composer2.skipToGroupEnd();
            darkTheme2 = darkTheme;
            dynamicColor2 = dynamicColor;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.samples.metro.demo.theme.ThemeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ThemeKt.MeetaTheme$lambda$0(darkTheme2, dynamicColor2, content, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
