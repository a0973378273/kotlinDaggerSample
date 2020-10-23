package com.jb.testdi

import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [TestModule::class, AndroidInjectionModule::class, DaggerModule::class])
interface DaggerComponent {
    fun inject(application: MyApp?)
}