package com.example.treecycle.presentation.education

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.treecycle.R
import com.example.treecycle.data.util.OnClickInterface
import com.example.treecycle.data.util.climateChangeChapters
import com.example.treecycle.data.util.recyclingChapters
import com.example.treecycle.databinding.ActivityEducationRecyclingChaptersBinding
import com.example.treecycle.presentation.education.adapter.Chapter
import com.example.treecycle.presentation.education.adapter.ChapterAdapter

class EducationRecyclingChaptersActivity : AppCompatActivity(), OnClickInterface<Chapter> {

    private lateinit var binding: ActivityEducationRecyclingChaptersBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEducationRecyclingChaptersBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvChapters2.adapter = ChapterAdapter(recyclingChapters, this)
    }

    override fun onClick(item: Chapter) {
        val intent = Intent(this, EducationRecyclingCardsActivity::class.java)
        intent.putExtra("KEY", item.name)
        startActivity(intent)
    }
}