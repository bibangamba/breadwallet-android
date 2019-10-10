package com.breadwallet.repository;

import android.content.Context;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class RepoModule {

    @Provides
    @Singleton
    public FeeRepository providesFeeRepository(Context context) {
        return new FeeRepository(context);
    }
}
