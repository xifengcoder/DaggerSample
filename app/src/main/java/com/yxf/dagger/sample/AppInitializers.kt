package com.yxf.dagger.sample

import android.app.Application
import android.util.Log
import com.yxf.dagger.core.OnAppCreate
import javax.inject.Inject

class AppInitializers @Inject constructor(
    private val initializers: Set<@JvmSuppressWildcards OnAppCreate>
) {

    companion object {
        const val TAG = "AppInitializers"
    }

    fun init(application: Application) {
        Log.i(TAG, "initializers: $initializers")
        initializers.forEach { it.onCreate(application) }
    }
}