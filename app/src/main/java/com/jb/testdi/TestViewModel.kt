package com.jb.testdi

import android.util.Log
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class TestViewModel: ViewModel(){
    @Inject lateinit var testUtil: TestUtil
    fun print() {
        Log.d("test", "ViewModel:"+testUtil.toString())
    }
}