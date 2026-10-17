package com.samples.dagger.demo.tracking;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes5.dex */
public final class OldTrackingIdentifier_Factory implements Factory<OldTrackingIdentifier> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public OldTrackingIdentifier get() {
        return newInstance();
    }

    public static OldTrackingIdentifier_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static OldTrackingIdentifier newInstance() {
        return new OldTrackingIdentifier();
    }

    private static final class InstanceHolder {
        static final OldTrackingIdentifier_Factory INSTANCE = new OldTrackingIdentifier_Factory();

        private InstanceHolder() {
        }
    }
}
