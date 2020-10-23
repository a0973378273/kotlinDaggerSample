package com.jb.testdi

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class DaggerModule {
    @ContributesAndroidInjector
        abstract fun getMainActivity(): MainActivity
} 