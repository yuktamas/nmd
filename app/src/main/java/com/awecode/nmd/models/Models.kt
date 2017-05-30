package com.awecode.nmd.models

import paperparcel.PaperParcel
import paperparcel.PaperParcelable

/**
 * Created by munnadroid on 5/30/17.
 */

@PaperParcel
data class Specialists(val name: String, val id: Int, val totalCount:Int) : PaperParcelable {
    companion object {
        @JvmField val CREATOR = PaperParcelSpecialists.CREATOR
    }
}