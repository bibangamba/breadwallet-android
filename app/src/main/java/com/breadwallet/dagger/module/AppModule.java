package com.breadwallet.dagger.module;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private Context mApplicationContext;

    public AppModule(Context applicationContext) {
        mApplicationContext = applicationContext;
    }

    @Provides
    Context providesApplicationContext() {
        return mApplicationContext;
    }
}
