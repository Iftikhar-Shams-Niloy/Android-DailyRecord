package com.example.mydailyrecord

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mydailyrecord.databinding.FragmentStudyingBinding

class StudyingFragment : Fragment() {

    private lateinit var binding : FragmentStudyingBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentStudyingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupClickListeners()
    }

    private fun setupClickListeners(){
        binding.studyTimer15.setOnClickListener { launchRunningRecordScreen("15") }
        binding.studyTimer30.setOnClickListener { launchRunningRecordScreen("30") }
        binding.studyTimer60.setOnClickListener { launchRunningRecordScreen("60") }
        binding.studyTimer120.setOnClickListener { launchRunningRecordScreen("120") }
    }

    private fun launchRunningRecordScreen(studyTime:String) {
        val intent = Intent(context, EditStudyingRecordActivity::class.java)
        intent.putExtra("studyTime", studyTime )
        startActivity(intent)
    }

}