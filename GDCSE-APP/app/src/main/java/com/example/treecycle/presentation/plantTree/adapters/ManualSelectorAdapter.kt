package com.example.treecycle.presentation.plantTree.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.treecycle.R

class ManualSelectorAdapter (
    private val context: Context,
    private val dataset : List<String>

    ) : RecyclerView.Adapter<ManualSelectorAdapter.ItemViewHolder>() {

    class ItemViewHolder(
        view: View
    ) : RecyclerView.ViewHolder(view) {
        var plantItemText : TextView = view.findViewById(R.id.plantItemText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.plant_tree_type_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.plantItemText.text = dataset[position]
    }

    override fun getItemCount(): Int = dataset.size
}