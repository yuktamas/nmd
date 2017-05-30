package com.awecode.nmd.view.specialist

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.awecode.nmd.R
import com.awecode.nmd.models.Specialists
import com.awecode.stockapp.util.extensions.hide
import com.awecode.stockapp.util.extensions.toast
import com.awecode.stockapp.view.adapter.SpecialistAdapter
import com.awecode.stockapp.view.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_specialists.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

/**
 * Created by munnadroid on 5/30/17.
 */
class SpecialistsFragment : BaseFragment() {
    override val layoutId: Int = R.layout.fragment_specialists

    companion object {
        fun newInstance(): SpecialistsFragment {
            return SpecialistsFragment()
        }

        fun newInstance(isFromActivity: Boolean): SpecialistsFragment {
            var fragment = SpecialistsFragment()
            fragment.setData(isFromActivity)
            return fragment
        }
    }

    private var mIsFromActivity: Boolean = false

    private fun setData(fromActivity: Boolean) {
        this.mIsFromActivity = fromActivity;
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (mIsFromActivity)
            titleTextView.hide()
        setupListAdapter()
    }

    /**
     * request api and populate in list in view
     */
    fun setupListAdapter() = doAsync {
        var dataList = getDummyList()
        uiThread {
            recyclerView.layoutManager = LinearLayoutManager(activity)
            val adapter = SpecialistAdapter(dataList) {
                toast("item clicked: $it")
            }
            recyclerView.adapter = adapter
        }

    }


    fun getDummyList(): List<Specialists> {
        return ArrayList<Specialists>().apply {
            add(Specialists("Allergist", 1, 10))
            add(Specialists("Anesthesiologist", 2, 20))
            add(Specialists("Cardiologist", 3, 5))
            add(Specialists("Dermatologist", 1, 20))
            add(Specialists("Gastroenterologist", 1, 12))
            add(Specialists("Cardiovascular surgeon", 1, 8))
            add(Specialists("Endocrinologist", 1, 7))
            add(Specialists("Forensic pathologist", 1, 23))
            add(Specialists("Gynecologist", 1, 14))
            add(Specialists("Neurologist", 1, 12))
            add(Specialists("Oncologist", 1, 9))
            add(Specialists("Ophthalmologist", 1, 21))

            add(Specialists("Allergist", 1, 10))
            add(Specialists("Anesthesiologist", 2, 20))
            add(Specialists("Cardiologist", 3, 5))
            add(Specialists("Dermatologist", 1, 20))
            add(Specialists("Gastroenterologist", 1, 12))
            add(Specialists("Cardiovascular surgeon", 1, 8))
            add(Specialists("Endocrinologist", 1, 7))
            add(Specialists("Forensic pathologist", 1, 23))
            add(Specialists("Gynecologist", 1, 14))
            add(Specialists("Neurologist", 1, 12))
            add(Specialists("Oncologist", 1, 9))
            add(Specialists("Ophthalmologist", 1, 21))
        }

    }
}