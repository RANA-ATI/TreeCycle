package com.example.treecycle.presentation.forest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.treecycle.R
import com.example.treecycle.databinding.ActivityForestBinding
import com.example.treecycle.databinding.ActivityPlantTreeBinding
import com.example.treecycle.presentation.forest.adapters.ForestTreesAdapter
import com.example.treecycle.presentation.forest.data.ForestTrees

class ForestActivity : AppCompatActivity() {

    private lateinit var binding: ActivityForestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityForestBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}