package com.example.horoscapp.ui.home.horoscope

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.horoscapp.databinding.FragmentHorsocopeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HorsocopeFragment : Fragment() {

    private val horoscopeViewModel by viewModels<HoroscopeViewModel>()


    private var _binding: FragmentHorsocopeBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHorsocopeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}