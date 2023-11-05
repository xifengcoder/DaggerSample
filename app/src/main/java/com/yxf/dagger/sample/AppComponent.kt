package com.yxf.dagger.sample

import com.yxf.dagger.core.OnAppCreate
import com.yxf.dagger.feature.FeatureModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, FeatureModule::class])
interface AppComponent {

    fun onAppCreateActions(): Set<OnAppCreate>

    fun secondInitActions():Set<OnAppCreate>

    fun inject(mainActivity: MainActivity)
}