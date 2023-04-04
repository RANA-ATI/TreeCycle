package com.example.treecycle.presentation.education

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.treecycle.data.util.OnClickInterface
import com.example.treecycle.data.util.climateChangeChapters
import com.example.treecycle.databinding.ActivityEducationChaptersBinding
import com.example.treecycle.presentation.education.adapter.Chapter
import com.example.treecycle.presentation.education.adapter.ChapterAdapter

class EducationChaptersActivity : AppCompatActivity(), OnClickInterface<Chapter> {

    private val binding: ActivityEducationChaptersBinding by lazy {
        ActivityEducationChaptersBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.rvChapters.adapter = ChapterAdapter(climateChangeChapters,this)
    }

    override fun onClick(item: Chapter) {
        val intent = Intent(this, EducationCardsActivity::class.java)
        intent.putExtra("KEY", item.name)
        startActivity(intent)
    }
}