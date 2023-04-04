package com.example.treecycle.presentation.forest.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.treecycle.R
import com.example.treecycle.presentation.forest.data.Tree
import com.example.treecycle.presentation.forest.ui.PlantedTreeClickListener
import com.google.android.material.card.MaterialCardView
import java.util.Date

class CalendarAdapter(
private val context: Context,
private val dataset : List<String>,
) : RecyclerView.Adapter<CalendarAdapter.ItemViewHolder>() {

    class ItemViewHolder(
        view: View
    ) : RecyclerView.ViewHolder(view) {

        var day : TextView = view.findViewById(R.id.calendar_day)
        var date : TextView = view.findViewById(R.id.calendar_date)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.calendar_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.date.text = dataset[position]
    }

    override fun getItemCount(): Int = dataset.size
}