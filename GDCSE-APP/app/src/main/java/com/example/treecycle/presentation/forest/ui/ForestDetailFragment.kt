package com.example.treecycle.presentation.forest.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import androidx.core.view.allViews
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import com.example.treecycle.R
import com.example.treecycle.databinding.FragmentForestDetailBinding
import com.example.treecycle.presentation.forest.adapters.CalendarAdapter
import java.util.Date

class ForestDetailFragment : Fragment() {

    private lateinit var binding: FragmentForestDetailBinding
    private val viewModel: ForestViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentForestDetailBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dates = listOf("12", "13", "14", "15", "16")
        binding.calendarRecyclerView.adapter = CalendarAdapter(requireActivity(), dates)

        binding.waterPlantButton.setOnClickListener {
            binding.llBgLayer4.visibility = VISIBLE
        }
        binding.btnWaterPlantFinish.setOnClickListener {
            binding.llBgLayer4.visibility = GONE
        }
    }
}