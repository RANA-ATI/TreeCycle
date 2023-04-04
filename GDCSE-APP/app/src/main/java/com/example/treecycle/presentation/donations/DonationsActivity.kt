package com.example.treecycle.presentation.donations

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.treecycle.databinding.ActivityDonationsBinding
import com.example.treecycle.presentation.donations.adapters.OrganizationsAdapter

class DonationsActivity : AppCompatActivity(), OrganizationClickListener {

    private lateinit var binding: ActivityDonationsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDonationsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val orgs = listOf<String>("WHO", "UNICEF")
        binding.organizationsRecyclerView.adapter =
            OrganizationsAdapter(this, orgs, this)
    }

    override fun onOrgClick(organizationName: String) {
    }
}