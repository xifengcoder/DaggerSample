package com.yxf.dagger.sample

import android.util.Log
import com.yxf.dagger.core.OnAppCreate
import com.yxf.dagger.feature.ExpensiveConfig
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet

@Module
class AppModule {
    @Provides
    @IntoSet
    fun provideInitActions(): OnAppCreate {
        return SdkInit()
    }

    @Provides
    fun provideSdkOnCreate():OnAppCreate {
        return OnAppCreate {
            Log.i("yxf", "123");
        }
    }
}