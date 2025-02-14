package com.neptune.klat_uikit_android_tutorial

import android.app.Application
import com.neptune.klat_uikit_android.KlatUiKit

class KlatApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        KlatUiKit.initialize(applicationContext, "ffbdd92b-c437-4c84-ab2c-9bf2c9207a42")
    }
}