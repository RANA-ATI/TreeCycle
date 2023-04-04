package com.example.treecycle.presentation.education

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.treecycle.data.util.ChapterCard
import com.example.treecycle.data.util.chapterCards
import com.example.treecycle.data.util.climateChangeChapters
import com.example.treecycle.databinding.ActivityEducationCardsBinding
import com.example.treecycle.presentation.education.adapter.Chapter

class EducationCardsActivity : AppCompatActivity() {
    private val binding: ActivityEducationCardsBinding by lazy {
        ActivityEducationCardsBinding.inflate(layoutInflater)
    }

    var counter = 0
    var progressValue: Int = 0
    lateinit var string: String;
    lateinit var chapterCard: ArrayList<ChapterCard>
    lateinit var selectedChapter: Chapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val bundle = intent?.extras
        string = bundle?.getString("KEY").toString()


        for (cd in climateChangeChapters) {
            if (cd.name == string) {
                chapterCard = cd.chapterCards
                selectedChapter = cd
            }
        }

        binding.progressHorizontal.progress = selectedChapter.progress
        Log.d("chapter", selectedChapter.name)

        binding.tvHashtag.text = chapterCard[counter].hashTag
        binding.tvContent.text = chapterCard[counter].content

        binding.btnMarkAsRead.setOnClickListener {
            if (counter < chapterCard.size - 1) {
                counter++
                binding.tvHashtag.text = chapterCard[counter].hashTag
                binding.tvContent.text = chapterCard[counter].content

                progressValue += (100 / chapterCard.size)
                binding.progressHorizontal.progress = progressValue
                selectedChapter.progress = progressValue

                Log.d("chapter",selectedChapter.progress.toString())
            } else {
                binding.llBgLayer1.visibility = View.VISIBLE
                binding.llBgLayer2.visibility = View.VISIBLE
                binding.btnPrev.isClickable = false
                binding.btnMarkAsRead.isClickable = false
            }
        }

        binding.btnPrev.setOnClickListener {
            if (counter > 0) {
                counter--
                binding.tvHashtag.text = chapterCard[counter].hashTag
                binding.tvContent.text = chapterCard[counter].content

                progressValue -= (100 / chapterCard.size)
                binding.progressHorizontal.progress = progressValue
                selectedChapter.progress = progressValue
            }
        }

        binding.btnContinueLearning.setOnClickListener {
            progressValue += (100 / chapterCard.size)
            binding.progressHorizontal.progress = progressValue
            selectedChapter.progress = progressValue

            Log.d("chapter",selectedChapter.progress.toString())
            finish()
        }

    }
}