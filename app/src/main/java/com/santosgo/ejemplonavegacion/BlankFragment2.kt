package com.santosgo.ejemplonavegacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs


class BlankFragment2 : Fragment () {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflar el layout para este fragmento
        val root = inflater.inflate(R.layout.fragment_blank2, container, false)

        // Botón 3: Navegar a BlankFragment3
        val btn3 = root.findViewById<Button>(R.id.btn3)
        btn3.setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment2_to_blankFragment4)
        }

        return root
    }
}