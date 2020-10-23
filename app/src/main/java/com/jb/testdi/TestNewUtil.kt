package com.jb.testdi

import android.util.Log
import javax.inject.Inject

class TestNewUtil @Inject constructor() {
    @Inject lateinit var util: TestUtil
    fun print() {
        Log.d("test", "1234:" + util.toString())
    }
}