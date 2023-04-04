package com.example.treecycle.presentation.forest.ui

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.treecycle.R
import com.example.treecycle.databinding.FragmentForestHomeBinding
import com.example.treecycle.presentation.forest.adapters.ForestTreesAdapter
import com.example.treecycle.presentation.forest.data.ForestTrees
import com.example.treecycle.presentation.forest.data.Tree
import com.example.treecycle.presentation.plantTree.PlantTreeActivity

class ForestHomeFragment : Fragment(), PlantedTreeClickListener {

    private lateinit var binding: FragmentForestHomeBinding
    private val viewModel: ForestViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentForestHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val datasource = ForestTrees().getPlantedTrees()
        binding.plantedTreesRecyclerView.adapter =
            ForestTreesAdapter(requireContext(), datasource, this)

        binding.plantTreeCardButton.setOnClickListener {
            val intent = Intent(context, PlantTreeActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onForestTreeClick(tree: Tree) {
        view?.findNavController()?.navigate(R.id.forestDetailFragment)
    }
}