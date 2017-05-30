package com.awecode.nmd

import android.app.Application
import android.content.ContextWrapper
import com.awecode.nmd.util.Prefs



/**
 * Created by munnadroid on 5/30/17.
 */
class MyApplication :Application(){
    override fun onCreate() {
        super.onCreate()

        Prefs.Builder()
                .setContext(this)
                .setMode(ContextWrapper.MODE_PRIVATE)
                .setPrefsName(packageName)
                .setUseDefaultSharedPreference(true)
                .build()
    }
}