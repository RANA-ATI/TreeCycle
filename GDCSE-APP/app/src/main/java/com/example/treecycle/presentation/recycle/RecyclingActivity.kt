package com.example.treecycle.presentation.recycle

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.treecycle.data.util.OnClickInterface
import com.example.treecycle.data.util.recycleItems
import com.example.treecycle.data.util.testTipsAndArticles
import com.example.treecycle.databinding.ActivityRecyclingBinding
import com.example.treecycle.presentation.recycle.adapter.RecycleItem
import com.example.treecycle.presentation.recycle.adapter.RecycleItemsAdapter
import com.example.treecycle.presentation.recycle.adapter.TipsAndArticleAdapter

class RecyclingActivity : AppCompatActivity(), OnClickInterface<RecycleItem> {
    private val binding: ActivityRecyclingBinding by lazy {
        ActivityRecyclingBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.rvTipsArticles.adapter = TipsAndArticleAdapter(testTipsAndArticles)
        binding.rvHowToRecycle.adapter = RecycleItemsAdapter(recycleItems, this)

    }

    override fun onClick(item: RecycleItem) {
        startActivity(Intent(this, RecycleItemDetailActivity::class.java))
    }
}