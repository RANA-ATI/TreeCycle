package com.example.treecycle.presentation.recycle.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebView
import androidx.recyclerview.widget.RecyclerView
import com.example.treecycle.R

class YoutubeVideosAdapter(val videoLinks: List<String>) :
    RecyclerView.Adapter<YoutubeVideosAdapter.YoutubeViewVH>() {
    class YoutubeViewVH(val view: View) : RecyclerView.ViewHolder(view) {
        val webview = view.findViewById<WebView>(R.id.web_view)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): YoutubeViewVH {
        return YoutubeViewVH(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_youtube_webview, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return videoLinks.size
    }

    override fun onBindViewHolder(holder: YoutubeViewVH, position: Int) {
        holder.webview.apply {
            settings.javaScriptEnabled = true
            webChromeClient = WebChromeClient()
            loadData(videoLinks[position], "text/html", "utf-8")
        }

    }
}