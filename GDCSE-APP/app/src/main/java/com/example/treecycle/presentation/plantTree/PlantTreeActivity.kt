package com.example.treecycle.presentation.plantTree

import android.content.Intent
import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import androidx.appcompat.app.AppCompatActivity
import com.example.treecycle.R
import com.example.treecycle.databinding.ActivityPlantTreeBinding
import com.example.treecycle.presentation.MainActivity
import com.example.treecycle.presentation.plant.PlantsDatasource
import com.example.treecycle.presentation.plantTree.adapters.ManualSelectorAdapter
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.material.datepicker.MaterialDatePicker


class PlantTreeActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var binding: ActivityPlantTreeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPlantTreeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /* Accessing data from a dummy source */
        val datasource = PlantsDatasource().getPlants()

        /* Recycler view config */
        val itemAdapter = ManualSelectorAdapter(this, datasource)
        binding.ChoseManualRecyclerView.adapter = itemAdapter

        /* Plays lotte animation when btnPlant is clicked. */
        binding.btnPlant.setOnClickListener {
            binding.llBgLayer3.visibility = VISIBLE
        }

        /* Returns to plant fragment when btnPlantFinish is clicked. */
        binding.btnPlantFinish.setOnClickListener {
            binding.llBgLayer3.visibility = GONE
            binding.btnPlant.visibility = GONE
        }

        /* Instantiating a support fragment for map*/
        val mapFragment = SupportMapFragment.newInstance()
        supportFragmentManager
            .beginTransaction()
            .add(R.id.container, mapFragment)
            .commit()

        /* Launches a DatePicker. */
        binding.selectDateButton.setOnClickListener {
            launchDatePicker()
        }
    }

    override fun onMapReady(googleMap: GoogleMap) {
        googleMap.addMarker(
            MarkerOptions()
                .position(LatLng(31.4027231,74.2104454))
                .title("Marker")
        )
    }

    /* Creates a DatePicker instance. */
    private fun launchDatePicker(){
        val datePicker =
            MaterialDatePicker.Builder.datePicker()
                .setTitleText("Select date")
                .setSelection(MaterialDatePicker.todayInUtcMilliseconds())
                .build()

        datePicker.show(supportFragmentManager, "date_picker");
    }
}