package com.yxf.dagger.feature

import android.app.Application
import android.util.Log
import com.yxf.dagger.core.OnAppCreate

object ExpensiveConfig {
    const val TAG = "ExpensiveConfig"

    object Initializer : OnAppCreate {
        override fun onCreate(application: Application) {
            Log.i(TAG, "ExpensiveConfig onCreate $application");
        }
    }
}
