package com.example.mydailyrecord

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.edit
import androidx.preference.PreferenceManager
import com.example.mydailyrecord.databinding.ActivityEditStudyingRecordBinding

class EditStudyingRecordActivity : AppCompatActivity() {

    private lateinit var binding : ActivityEditStudyingRecordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEditStudyingRecordBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val studyTime = intent.getStringExtra("studyTime")
        title = "Study Time : $studyTime"
        binding.textViewStudyTimeHeader.setText("Study Time : $studyTime")

//        val applicationPreferences = PreferenceManager.getDefaultSharedPreferences(this)
//        applicationPreferences.edit {
//            putString("Some Application data", "Application preference value here")
//        }
//
//        val activityPreferences = getPreferences(Context.MODE_PRIVATE)
//        activityPreferences.edit {
//            putInt("Some Activity Data", 500)
//        }
//
//        val fileNamePreferences = getSharedPreferences("Some shared preference file", Context.MODE_PRIVATE)
//        fileNamePreferences.edit {
//            putBoolean("Some preference file name data", false)
//        }

    }

    private fun saveRecord(){
        
    }
}