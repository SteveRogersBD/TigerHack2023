package com.aniruddha.afinal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.appbar.MaterialToolbar

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val fitDictionaryCard = view.findViewById<CardView>(R.id.fit_tionary_card)
        val nutriFitCard = view.findViewById<CardView>(R.id.nutri_fit_card)
        val fitTrackCard = view.findViewById<CardView>(R.id.fit_track_card)

        fitDictionaryCard.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_workoutFragment)
        }
        nutriFitCard.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_nutriFitFragment)
        }
        fitTrackCard.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_plannerFragment)
        }

        // Add similar click listeners for other CardViews

        return view
    }
}
