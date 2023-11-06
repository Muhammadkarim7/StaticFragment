package com.example.staticfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.staticfragment.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {
    private lateinit var root: View
    private lateinit var binding: FragmentBlankBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlankBinding.inflate(layoutInflater)
        root = inflater.inflate(R.layout.fragment_blank, container, false)

        var aa = root.findViewById<TextView>(R.id.txt)

        aa.setOnClickListener {
            Toast.makeText(context, "Save", Toast.LENGTH_SHORT).show()
        }

        return root
    }
}