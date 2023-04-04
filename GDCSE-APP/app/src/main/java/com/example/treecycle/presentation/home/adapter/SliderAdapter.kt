package com.example.treecycle.presentation.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.treecycle.R
import com.makeramen.roundedimageview.RoundedImageView


class SliderAdapter(
    val sliderItems: ArrayList<Int>,
    val viewPager2: ViewPager2?,
) : RecyclerView.Adapter<SliderAdapter.SliderViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SliderViewHolder {

        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.slider_image_container, parent, false)
        return SliderViewHolder(view)
    }

    override fun onBindViewHolder(holder: SliderViewHolder, position: Int) {
        holder.bindData(sliderItems[position])
        if (position == sliderItems.size - 2 && viewPager2 != null) {
            viewPager2.post(runnable)
        }
    }

    override fun getItemCount(): Int {
        return sliderItems.size
    }


    class SliderViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

        private lateinit var roundImageView: RoundedImageView
        fun bindData(slider: Int) {
            roundImageView = view.findViewById(R.id.imageSlide)
            roundImageView.setImageResource(slider)
        }

    }

    private val runnable = Runnable {
        kotlin.run {
            sliderItems.addAll(sliderItems)
            notifyDataSetChanged()
        }
    }


}