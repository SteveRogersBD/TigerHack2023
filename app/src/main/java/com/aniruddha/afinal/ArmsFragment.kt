package com.aniruddha.afinal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class ArmsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view3 = inflater.inflate(R.layout.fragment_arms, container, false)

        val text1 = view3.findViewById<TextView>(R.id.bicepsWorkout1)
        text1.setOnClickListener{
            findNavController().navigate(R.id.action_armsFragment_to_curlFragment)
        }
        return view3
    }
}