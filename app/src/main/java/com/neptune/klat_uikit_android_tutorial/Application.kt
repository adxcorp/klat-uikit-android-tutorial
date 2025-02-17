package com.neptune.klat_uikit_android_tutorial

import android.app.Application
import com.neptune.klat_uikit_android.KlatUiKit

class KlatApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        KlatUiKit.initialize(applicationContext, "YOUR_APP_ID")
    }
}