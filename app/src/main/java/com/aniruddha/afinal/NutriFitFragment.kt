package com.aniruddha.afinal

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class NutriFitFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view5 = inflater.inflate(R.layout.fragment_nutri_fit, container, false)
        val text_work = view5.findViewById<TextView>(R.id.work)
        val text_diet = view5.findViewById<TextView>(R.id.diet)

        text_work.setOnClickListener {
            findNavController().navigate(R.id.action_nutriFitFragment_to_workScheduleFragment)
        }
        return view5
    }
}