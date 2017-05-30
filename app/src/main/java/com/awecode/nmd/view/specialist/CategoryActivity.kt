package com.awecode.nmd.view.specialist

import android.os.Bundle
import com.awecode.nmd.R
import com.awecode.stockapp.util.extensions.changeDefaultNavIconColor
import com.awecode.stockapp.util.extensions.colorRes
import com.awecode.stockapp.view.base.BaseActivity
import kotlinx.android.synthetic.main.activity_specialist.*

/**
 * Created by munnadroid on 5/30/17.
 */
class SpecialistActivity : BaseActivity() {
    override val layoutId: Int = R.layout.activity_specialist

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupToolbar()

        changeFragment(SpecialistsFragment.newInstance(true), addToBackStack = false)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    fun setupToolbar() {
        setSupportActionBar(toolbar)

        supportActionBar?.title = getString(R.string.doctors)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.changeDefaultNavIconColor(applicationContext, colorRes(R.color.white))

    }

}