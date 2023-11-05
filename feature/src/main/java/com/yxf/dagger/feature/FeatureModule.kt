package com.yxf.dagger.feature

import com.yxf.dagger.core.OnAppCreate
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet

@Module
object FeatureModule {
    @Provides
    @IntoSet
    fun expensiveConfigInitializer(): OnAppCreate = ExpensiveConfig.Initializer
}