package com.example.mydailyrecord

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mydailyrecord.databinding.FragmentBreakingBinding

class BreakingFragment : Fragment() {

    private lateinit var binding : FragmentBreakingBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBreakingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupClickListeners()
    }

    private fun setupClickListeners() {
        binding.breakTimer15.setOnClickListener{ launchBreakingRecordScreen("15" ) }
        binding.breakTimer30.setOnClickListener { launchBreakingRecordScreen( "30" ) }
        binding.breakTimer60.setOnClickListener { launchBreakingRecordScreen( "60" ) }
        binding.breakTimer120.setOnClickListener { launchBreakingRecordScreen( "120" ) }
    }

    private fun launchBreakingRecordScreen(breakTime : String) {
        val myIntent = Intent(context, EditBreakingRecordActivity::class.java)
        myIntent.putExtra("breakTime", breakTime)
        startActivity(myIntent)
    }

}