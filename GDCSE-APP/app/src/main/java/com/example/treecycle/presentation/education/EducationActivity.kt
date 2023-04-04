package com.example.treecycle.presentation.education

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.treecycle.data.util.educationBanners
import com.example.treecycle.databinding.ActivityEducationBinding
import com.example.treecycle.presentation.home.adapter.SliderAdapter

class EducationActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2
    private val sliderHandler = Handler(Looper.getMainLooper())

    private val binding: ActivityEducationBinding by lazy {
        ActivityEducationBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        viewPager = binding.viewPager2Education
        imageSlider()

        binding.cardClimateChange.setOnClickListener {
            startActivity(Intent(this, EducationChaptersActivity::class.java))
        }
        binding.cardClimateRecycling.setOnClickListener {
            startActivity(Intent(this, EducationRecyclingChaptersActivity::class.java))
        }

    }


    private fun imageSlider() {
        viewPager.apply {
            adapter = SliderAdapter(educationBanners, viewPager)
            offscreenPageLimit = 2
            registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                    sliderHandler.removeCallbacks(sliderRunnable)
                    sliderHandler.postDelayed(sliderRunnable, 3000)
                }
            })
        }

    }

    override fun onPause() {
        super.onPause()
        sliderHandler.removeCallbacks(sliderRunnable)
    }

    override fun onResume() {
        super.onResume()
        sliderHandler.postDelayed(sliderRunnable, 3000)
    }

    private val sliderRunnable = kotlinx.coroutines.Runnable {

        kotlin.run {
            viewPager.currentItem = viewPager.currentItem + 1
        }
    }

}