package com.example.treecycle.presentation.forest.ui

import android.view.View
import com.example.treecycle.presentation.forest.data.Tree

interface PlantedTreeClickListener {
    fun onForestTreeClick(tree: Tree)
}