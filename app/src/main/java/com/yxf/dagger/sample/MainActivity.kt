package com.yxf.dagger.sample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    companion object {
        const val TAG = "MainActivity"
    }

    @Inject
    lateinit var initializers: AppInitializers

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val daggerAppComponent = DaggerAppComponent.create();
        daggerAppComponent.inject(this)
        initializers.init(application)

        daggerAppComponent.onAppCreateActions().forEach {
            Log.i(TAG, "MainActivity init actions: $it");
            it.onCreate(application)
        }

        daggerAppComponent.secondInitActions().forEach{
            Log.i(TAG, "MainActivity second init actions:$it")
        }
    }
}