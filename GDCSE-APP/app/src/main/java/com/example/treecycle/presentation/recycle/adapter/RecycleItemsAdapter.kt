package com.example.treecycle.presentation.recycle.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.treecycle.R
import com.example.treecycle.data.util.OnClickInterface

data class RecycleItem(val name: String, val subHeading: String)
class RecycleItemsAdapter(
    val recycleItems: List<RecycleItem>,
    val onClickInterface: OnClickInterface<RecycleItem>
) :
    RecyclerView.Adapter<RecycleItemsAdapter.RecycleVH>() {
    class RecycleVH(val view: View) : RecyclerView.ViewHolder(view) {

        val name = view.findViewById<TextView>(R.id.tv_name)
        val subHeading = view.findViewById<TextView>(R.id.tv_sub_heading)

        fun bindData(recycleItem: RecycleItem) {
            name.text = recycleItem.name
            subHeading.text = recycleItem.subHeading
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecycleVH {
        return RecycleVH(
            LayoutInflater.from(parent.context).inflate(R.layout.item_recycle_layout, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return recycleItems.size
    }

    override fun onBindViewHolder(holder: RecycleVH, position: Int) {
        holder.bindData(recycleItems[position])
        holder.itemView.setOnClickListener {
            onClickInterface.onClick(recycleItems[position])
        }
    }
}