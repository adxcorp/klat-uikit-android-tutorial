// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
//    alias(libs.plugins.androidApplication) apply false
//    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
    id("com.android.application") version "7.4.0" apply false
    id("org.jetbrains.kotlin.android") version "1.7.0" apply false
    id("com.android.library") version "7.4.0" apply false
    id("org.jetbrains.kotlin.plugin.serialization") version "1.7.0" apply false
}