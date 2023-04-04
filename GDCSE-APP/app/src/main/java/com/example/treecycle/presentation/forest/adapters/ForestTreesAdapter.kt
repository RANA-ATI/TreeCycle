package com.example.treecycle.presentation.forest.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.treecycle.R
import com.example.treecycle.databinding.FragmentForestHomeBinding
import com.example.treecycle.presentation.forest.data.Tree
import com.example.treecycle.presentation.forest.ui.ForestHomeFragment
import com.example.treecycle.presentation.forest.ui.PlantedTreeClickListener
import com.google.android.material.card.MaterialCardView
import com.google.android.material.progressindicator.CircularProgressIndicator

class ForestTreesAdapter(
private val context: Context,
private val dataset : List<Tree>,
private val treeClickListener: PlantedTreeClickListener
) : RecyclerView.Adapter<ForestTreesAdapter.ItemViewHolder>() {

    class ItemViewHolder(
        view: View
    ) : RecyclerView.ViewHolder(view) {

        var treeName : TextView = view.findViewById(R.id.tree_name_card_text)
        var treeProgress: TextView = view.findViewById(R.id.tree_progress_text_view)
        var treeProgressRing: ProgressBar = view.findViewById(R.id.tree_progress_ring)

        var forestTreeItemCard: MaterialCardView = view.findViewById(R.id.forest_tree_item_card)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.forest_recycler_view_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.treeName.text = dataset[position].treeName
        holder.treeProgress.text = dataset[position].treeProgress.toString()
        holder.treeProgressRing.setProgress(dataset[position].treeProgress)

        holder.forestTreeItemCard.setOnClickListener {
            treeClickListener.onForestTreeClick(dataset[position])
        }
    }

    override fun getItemCount(): Int = dataset.size
}