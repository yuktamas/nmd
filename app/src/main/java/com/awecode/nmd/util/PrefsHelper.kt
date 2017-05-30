package com.awecode.nmd.util

/**
 * Created by munnadroid on 5/30/17.
 */

class PrefsHelper {
    companion object {
        fun setLoginStatus(loginStatus: Boolean) = Prefs.putBoolean(Constants.PREFS_LOGIN_STATUS, loginStatus)

        fun getLoginStatus(): Boolean = Prefs.getBoolean(Constants.PREFS_LOGIN_STATUS, false)
    }
}