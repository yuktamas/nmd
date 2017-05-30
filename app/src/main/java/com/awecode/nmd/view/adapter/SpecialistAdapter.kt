package com.awecode.stockapp.view.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.awecode.nmd.R
import com.awecode.nmd.models.Specialists


/**
 * Created by munnadroid on 5/26/17.
 */

class SpecialistAdapter(val specialList: List<Specialists>, val itemClick: (Specialists) -> Unit) :
        RecyclerView.Adapter<SpecialistAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_specialist, parent, false)
        return ViewHolder(view, itemClick)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindForecast(specialList[position])
    }

    override fun getItemCount() = specialList.size


    class ViewHolder(view: View, val itemClick: (Specialists) -> Unit) : RecyclerView.ViewHolder(view) {

        fun bindForecast(indice: Specialists) {
            with(indice) {
                //itemView.nameTextView.text = indice.name
                itemView.setOnClickListener { itemClick(this) }
            }
        }
    }
}