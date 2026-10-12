package com.samples.dagger.demo.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackingModule_Companion_ProvidesStringTagFactory implements Factory<Object> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Object get() {
        return providesStringTag();
    }

    public static TrackingModule_Companion_ProvidesStringTagFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Object providesStringTag() {
        return Preconditions.checkNotNullFromProvides(TrackingModule.INSTANCE.providesStringTag());
    }

    private static final class InstanceHolder {
        static final TrackingModule_Companion_ProvidesStringTagFactory INSTANCE = new TrackingModule_Companion_ProvidesStringTagFactory();

        private InstanceHolder() {
        }
    }
}
