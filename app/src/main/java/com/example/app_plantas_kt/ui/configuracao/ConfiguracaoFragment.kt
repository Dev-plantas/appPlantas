package com.example.app_plantas_kt.ui.configuracao

import android.content.res.Configuration
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatDelegate
import com.example.app_plantas_kt.R
import com.example.app_plantas_kt.databinding.FragmentConfiguracaoBinding
import com.example.app_plantas_kt.databinding.FragmentFiloBinding

class ConfiguracaoFragment : Fragment() {
    private lateinit var binding: FragmentConfiguracaoBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentConfiguracaoBinding.inflate(inflater, container, false)

        //checagem se o Modo escuro do sistema está ativo
        binding.btnDarkMode.apply {
            isChecked = resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK == Configuration.UI_MODE_NIGHT_YES
        }

        //Swith de ativar e desativar o modo escuro
        binding.btnDarkMode.setOnCheckedChangeListener { _, isChecked ->

            if (isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }


}