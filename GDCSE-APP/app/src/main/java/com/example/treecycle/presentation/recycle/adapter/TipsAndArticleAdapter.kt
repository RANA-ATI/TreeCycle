package com.example.treecycle.presentation.recycle.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.treecycle.R

class TipsAndArticleAdapter(val tips: List<String>):RecyclerView.Adapter<TipsAndArticleAdapter.TipsArticleVH>() {
    class TipsArticleVH(val view: View):RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TipsArticleVH {
        return TipsArticleVH(LayoutInflater.from(parent.context).inflate(R.layout.item_recycle_tips_layout, parent, false))

    }

    override fun getItemCount(): Int {
        return tips.size
    }

    override fun onBindViewHolder(holder: TipsArticleVH, position: Int) {

    }
}
