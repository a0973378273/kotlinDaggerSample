package com.jb.testdi

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class TestModule {
    @Singleton
    @Provides
    fun getTestUtil1():TestUtil{
        return TestUtil()
    }
}