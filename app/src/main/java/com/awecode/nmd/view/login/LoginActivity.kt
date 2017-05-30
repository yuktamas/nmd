package com.awecode.nmd.view.login

import android.os.Bundle
import com.awecode.nmd.R
import com.awecode.stockapp.util.extensions.makeFullscreen
import com.awecode.stockapp.view.base.BaseActivity

/**
 * Created by munnadroid on 5/30/17.
 */

class LoginActivity : BaseActivity() {
    override val layoutId: Int = R.layout.activity_login

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.makeFullscreen()
    }
}
