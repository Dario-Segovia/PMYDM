package com.santosgo.ejemplonavegacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class BlankFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflar el layout para este fragmento
        val root = inflater.inflate(R.layout.fragment_blank, container, false)

        // Botón 1: Navegar a BlankFragment2
        val btn1 = root.findViewById<Button>(R.id.btn1)
        btn1.setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment_to_blankFragment2)
        }

        // Botón 2: Navegar a BlankFragment3
        val btn2 = root.findViewById<Button>(R.id.btn2)
        btn2.setOnClickListener {
            findNavController().navigate(BlankFragmentDirections.actionBlankFragmentToBlankFragment2(

            )
            )
        }

        return root
    }


}