package com.samples.dagger.demo.tracking;

import dagger.internal.Factory;
import dagger.internal.Provider;
import java.util.Optional;

/* JADX INFO: loaded from: classes5.dex */
public final class TrackingAdapter9_Factory implements Factory<TrackingAdapter9> {
    private final Provider<Optional<TrackingExporter>> optionalExporterProvider;

    private TrackingAdapter9_Factory(Provider<Optional<TrackingExporter>> optionalExporterProvider) {
        this.optionalExporterProvider = optionalExporterProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public TrackingAdapter9 get() {
        return newInstance(this.optionalExporterProvider.get());
    }

    public static TrackingAdapter9_Factory create(Provider<Optional<TrackingExporter>> optionalExporterProvider) {
        return new TrackingAdapter9_Factory(optionalExporterProvider);
    }

    public static TrackingAdapter9 newInstance(Optional<TrackingExporter> optionalExporter) {
        return new TrackingAdapter9(optionalExporter);
    }
}
