package com.example.treecycle.presentation.plant

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.treecycle.R
import com.example.treecycle.databinding.FragmentPlantBinding
import com.example.treecycle.presentation.forest.ForestActivity
import com.example.treecycle.presentation.plantTree.PlantTreeActivity
import com.google.android.material.card.MaterialCardView

class PlantFragment : Fragment() {

    private val binding:FragmentPlantBinding by lazy {
        FragmentPlantBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /* Accessing card buttons via id.*/
        val plantATreeButton : MaterialCardView = view.findViewById(R.id.plantTreeCardButton)
        val myForestCardButton: MaterialCardView = view.findViewById(R.id.myForestCardButton)

        plantATreeButton.setOnClickListener {

            /* Launching [PlantTreeActivity]. */
            val intent = Intent(requireActivity(), PlantTreeActivity::class.java)
            startActivity(intent)
        }

        myForestCardButton.setOnClickListener {

            /* Launching [ForestActivity]. */
            val intent = Intent(requireActivity(), ForestActivity::class.java)
            startActivity(intent)
        }
    }
}