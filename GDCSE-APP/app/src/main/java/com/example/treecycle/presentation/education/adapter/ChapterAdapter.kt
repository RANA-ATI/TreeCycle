package com.example.treecycle.presentation.education.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.treecycle.R
import com.example.treecycle.data.util.ChapterCard
import com.example.treecycle.data.util.OnClickInterface
import com.example.treecycle.data.util.colorList
import com.google.android.material.card.MaterialCardView
import java.io.Serializable

data class Chapter(val id: Int, val name: String, var progress: Int, val chapterCards: ArrayList<ChapterCard>)
class ChapterAdapter(val chapters: List<Chapter>, val onClickInterface: OnClickInterface<Chapter>) :
    RecyclerView.Adapter<ChapterAdapter.ChapterVH>() {
    class ChapterVH(view: View) : RecyclerView.ViewHolder(view) {
        val chapterName = view.findViewById<TextView>(R.id.tv_chapter_name)
        val textProgress = view.findViewById<TextView>(R.id.tv_progress)
        val progressBar = view.findViewById<ProgressBar>(R.id.pb_chapter)
        val topLine = view.findViewById<View>(R.id.view_line_top)
        val botomLine = view.findViewById<View>(R.id.view_line_bottom)
        val lockIcon = view.findViewById<ImageView>(R.id.iv_icon)
        val cardTimeLine = view.findViewById<MaterialCardView>(R.id.card_timeline)

        fun bindData(chapter: Chapter) {
            if (chapter.progress == 0) {
                cardTimeLine.setCardBackgroundColor(cardTimeLine.context.colorList(R.color.colorPrimary))
                chapterName.setTextColor(chapterName.context.resources.getColor(R.color.colorText))
                chapterName.alpha = 0.7f
                lockIcon.apply {
                    setImageResource(R.drawable.ic_lock)
                    setColorFilter(lockIcon.context.resources.getColor(R.color.colorText))
                    rotation = 0f
                    alpha = 0.7f
                }
                textProgress.alpha = 0.7f
            }
            chapterName.text = chapter.name
            textProgress.text = "${chapter.progress}%"
            progressBar.progress = chapter.progress
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChapterVH {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_chapter_active_layout, parent, false)
        return ChapterVH(view)
    }

    override fun getItemCount(): Int {
        return chapters.size
    }

    override fun onBindViewHolder(holder: ChapterVH, position: Int) {
        holder.bindData(chapters[position])
        if (position == 0) {
            holder.topLine.visibility = View.INVISIBLE
        } else if (position == chapters.size - 1) {
            holder.botomLine.visibility = View.INVISIBLE
        }

        holder.cardTimeLine.setOnClickListener {
            onClickInterface.onClick(chapters[position])
        }
    }
}