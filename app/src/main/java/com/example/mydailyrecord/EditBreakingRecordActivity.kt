package com.example.mydailyrecord

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mydailyrecord.databinding.ActivityEditBreakingRecordBinding

class EditBreakingRecordActivity : AppCompatActivity() {

    private lateinit var myBinding : ActivityEditBreakingRecordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        myBinding = ActivityEditBreakingRecordBinding.inflate(layoutInflater)
        setContentView(myBinding.root)
        val breakTime = intent.getStringExtra("breakTime")
        myBinding.textViewBreakTimeHeader.setText("Break Time : $breakTime mins")
    }
}