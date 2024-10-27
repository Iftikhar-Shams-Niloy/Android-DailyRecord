package com.example.mydailyrecord

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.fragment.app.commit
import com.example.mydailyrecord.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView

class MainActivity : AppCompatActivity(), NavigationBarView.OnItemSelectedListener {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.commit {
            add(R.id.frame_content, StudyingFragment())
        }

//        binding.bottomNav.setOnNavigationItemSelectedListener()  <-- This is depricated insted use --> ".setOnItemSelectedListener()"
        binding.bottomNav.setOnItemSelectedListener(this)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.reset_studying){}
        return when(item.itemId){
            R.id.reset_studying -> { Toast.makeText(this, "RESET STUDY Selected!", Toast.LENGTH_SHORT).show(); true}
            R.id.reset_breaking -> { Toast.makeText(this, "RESET BREAK Selected!", Toast.LENGTH_SHORT).show(); true}
            R.id.reset_all -> { Toast.makeText(this, "RESET ALL Selected!", Toast.LENGTH_SHORT).show(); true}
            else -> {super.onOptionsItemSelected(item)}
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.nav_study -> {onStudyClicked(); true}
            R.id.nav_break -> {onBreakClicked(); true}
            R.id.nav_status -> {onStatusClicked(); true}
            else -> false
        }
    }

    private fun onStudyClicked() {
        supportFragmentManager.commit {
            replace(R.id.frame_content, StudyingFragment())
        }
    }
    private fun onBreakClicked(){
        supportFragmentManager.commit {
            replace(R.id.frame_content, BreakingFragment())
        }
    }
    private fun onStatusClicked(){
        supportFragmentManager.commit {
            replace(R.id.frame_content, StatusFragment())
        }
    }

}