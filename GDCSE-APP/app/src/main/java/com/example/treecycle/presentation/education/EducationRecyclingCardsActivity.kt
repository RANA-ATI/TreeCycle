package com.example.treecycle.presentation.education

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.treecycle.R
import com.example.treecycle.data.util.ChapterCard
import com.example.treecycle.data.util.climateChangeChapters
import com.example.treecycle.data.util.recyclingChapters
import com.example.treecycle.databinding.ActivityEducationCardsBinding
import com.example.treecycle.databinding.ActivityEducationRecyclingCardsBinding
import com.example.treecycle.presentation.education.adapter.Chapter

class EducationRecyclingCardsActivity : AppCompatActivity() {

    private val binding: ActivityEducationRecyclingCardsBinding by lazy {
        ActivityEducationRecyclingCardsBinding.inflate(layoutInflater)
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
        val string = bundle?.getString("KEY").toString()

        for (cd in recyclingChapters){
            if(cd.name == string){
                chapterCard = cd.chapterCards
                selectedChapter = cd
            }
        }

        binding.progressHorizontal.progress = selectedChapter.progress

        Log.d("SecondScreenData", string)

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

                progressValue += (100 / chapterCard.size)
                binding.progressHorizontal.progress = progressValue
                selectedChapter.progress = progressValue
            }
        }

        binding.btnContinueLearning.setOnClickListener {
            finish()
        }

    }
}