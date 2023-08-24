package com.busraornek.navigation_component

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ubuntuyouiwe.fragmentders.R
import com.ubuntuyouiwe.fragmentders.databinding.FragmentBirinciBinding


class BirinciFragment : Fragment() {

    private lateinit var binding: FragmentBirinciBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBirinciBinding.inflate(inflater, container, false)
        binding.button2SayfaGecis.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.Ikı_sayfa_gecis)

        }
        return binding.root

    }
}