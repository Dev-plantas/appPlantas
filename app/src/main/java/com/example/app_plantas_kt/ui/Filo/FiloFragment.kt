package com.example.app_plantas_kt.ui.Filo

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.app_plantas_kt.R
import com.example.app_plantas_kt.databinding.FragmentFiloBinding
import com.example.app_plantas_kt.ui.home.HomeFragment

class FiloFragment : Fragment() {

    private lateinit var binding: FragmentFiloBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFiloBinding.inflate(inflater, container, false)


        //Navegar para a tela Home
        binding.btnHome.setOnClickListener {
            findNavController().navigate(R.id.nav_home)
        }


        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}