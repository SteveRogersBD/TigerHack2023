package com.aniruddha.afinal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class WorkoutFragment : Fragment() {
   override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val view1 = inflater.inflate(R.layout.fragment_workout, container, false)

       val text = view1.findViewById<TextView>(R.id.arms_workout)
       text.setOnClickListener{
            findNavController().navigate(R.id.action_workoutFragment_to_armsFragment)
       }

       return view1
    }

}