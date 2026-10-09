package com.samples.dagger.demo.di;

import com.samples.dagger.demo.errors.DefaultErrorHandler;
import com.samples.dagger.demo.errors.ErrorHandler;
import dagger.Binds;
import dagger.Module;
import kotlin.Metadata;

/* JADX INFO: compiled from: ErrorModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'b\u0002\b\u0006Ê\u0001\u0002\b\b¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/samples/dagger/demo/di/ErrorModule;", "", "bindsErrorHandler", "Lcom/samples/dagger/demo/errors/ErrorHandler;", "instance", "Lcom/samples/dagger/demo/errors/DefaultErrorHandler;", "Ldagger/Binds;", "daggerDemo", "Ldagger/Module;"}, k = 1, mv = {2, 4, 0}, xi = 48)
@Module
public interface ErrorModule {
    @Binds
    ErrorHandler bindsErrorHandler(DefaultErrorHandler instance);
}
