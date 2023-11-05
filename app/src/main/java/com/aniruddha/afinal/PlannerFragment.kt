package com.aniruddha.afinal

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

class PlannerFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view4 = inflater.inflate(R.layout.fragment_planner, container, false)
        val enter_button = view4.findViewById<Button>(R.id.enter)
        enter_button.setOnClickListener{
            val pop_up = "Your BMI is ** and a FitPlan has been made successfully!"
            Toast.makeText(requireContext(),pop_up,Toast.LENGTH_SHORT).show()
        }

        return view4
    }
}