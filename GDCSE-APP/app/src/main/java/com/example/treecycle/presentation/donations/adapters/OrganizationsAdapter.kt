package com.example.treecycle.presentation.donations.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.treecycle.R
import com.example.treecycle.presentation.donations.OrganizationClickListener
import com.google.android.material.card.MaterialCardView

class OrganizationsAdapter(
    private val context: Context,
    private val dataset : List<String>,
    private val organizationClickListener: OrganizationClickListener
) : RecyclerView.Adapter<OrganizationsAdapter.ItemViewHolder>() {

    class ItemViewHolder(
        view: View
    ) : RecyclerView.ViewHolder(view) {

        var orgName : TextView = view.findViewById(R.id.donations_recycler_view_item_text)
        var orgCard: MaterialCardView = view.findViewById(R.id.donations_recycler_view_item_card)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_donations_recycler_view, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.orgName.text = dataset[position]
        holder.orgCard.setOnClickListener {
            organizationClickListener.onOrgClick(dataset[position])
        }
    }

    override fun getItemCount(): Int = dataset.size
}