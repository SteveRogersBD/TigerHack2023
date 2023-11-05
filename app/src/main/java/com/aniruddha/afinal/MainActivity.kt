package com.aniruddha.afinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.NavController

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController // Declare the navController variable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment_container) as NavHostFragment
        navController = navHostFragment.navController // Initialize the navController

        val fitDictionaryCard = findViewById<CardView>(R.id.fit_tionary_card)
        val nutriFitCard = findViewById<CardView>(R.id.nutri_fit_card)
        val fitTrackCard = findViewById<CardView>(R.id.fit_track_card)

        // Set an onClick listener for each CardView
        fitDictionaryCard.setOnClickListener {
            // Navigate to a new fragment when this card is clicked
            navController.navigate(R.id.action_mainActivity_to_workoutChartFragment)
        }

    }
}
