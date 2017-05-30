package com.awecode.nmd.view.specialist

import android.os.Bundle
import android.view.View
import com.awecode.nmd.R
import com.awecode.nmd.models.Specialists
import com.awecode.stockapp.view.base.BaseFragment

/**
 * Created by munnadroid on 5/30/17.
 */
class SpecialistsFragment : BaseFragment() {
    override val layoutId: Int = R.layout.fragment_specialists

    companion object {
        fun newInstance(): SpecialistsFragment {
            return SpecialistsFragment()
        }
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }


    fun dummyList(): List<Specialists> {
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