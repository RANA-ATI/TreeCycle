package com.example.treecycle.presentation.recycle

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.treecycle.R
import com.example.treecycle.data.util.doYouKnowBanners
import com.example.treecycle.data.util.embedYoutubeVideos
import com.example.treecycle.databinding.ActivityRecycleItemDetailBinding
import com.example.treecycle.presentation.home.adapter.SliderAdapter
import com.example.treecycle.presentation.recycle.adapter.YoutubeVideosAdapter
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerSupportFragmentX

class RecycleItemDetailActivity : AppCompatActivity(), YouTubePlayer.OnInitializedListener {
    private lateinit var viewPager: ViewPager2
    private val sliderHandler = Handler(Looper.getMainLooper())

    private val binding: ActivityRecycleItemDetailBinding by lazy {
        ActivityRecycleItemDetailBinding.inflate(layoutInflater)
    }

    private lateinit var youTubePlayerFragment: YouTubePlayerSupportFragmentX
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        viewPager = binding.viewPager2DoYouKnowBanner
        imageSlider()

        youTubePlayerFragment =
            supportFragmentManager.findFragmentById(R.id.official_player_view) as YouTubePlayerSupportFragmentX

        youTubePlayerFragment.initialize("AIzaSyC7RHZgkGcA28CynZz64dZCfnmD4SDeCss", this)


//        binding.rvMoreVideos.adapter = YoutubeVideosAdapter(embedYoutubeVideos)
    }

    override fun onInitializationSuccess(
        provider: YouTubePlayer.Provider,
        youTubePlayer: YouTubePlayer,
        wasRestored: Boolean
    ) {
        if (!wasRestored) {
            youTubePlayer.cueVideo("YE7VzlLtp-4")
        }
    }


    override fun onInitializationFailure(
        provider: YouTubePlayer.Provider,
        youTubeInitializationResult: YouTubeInitializationResult
    ) {
        if (youTubeInitializationResult.isUserRecoverableError) {
            youTubeInitializationResult.getErrorDialog(this, RECOVERY_DIALOG_REQUEST).show()
        } else {
            val errorMessage = String.format(
                "There was an error initializing the YouTubePlayer (%1\$s)",
                youTubeInitializationResult.toString()
            )
            Toast.makeText(this, errorMessage, Toast.LENGTH_LONG).show()
        }
    }

    private fun imageSlider() {
        viewPager.apply {
            adapter = SliderAdapter(doYouKnowBanners, viewPager)
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


    companion object {
        const val RECOVERY_DIALOG_REQUEST = 1
    }
}