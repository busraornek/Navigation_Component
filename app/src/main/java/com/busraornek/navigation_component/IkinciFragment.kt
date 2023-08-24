package com.busraornek.navigation_component

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ubuntuyouiwe.fragmentders.R
import com.ubuntuyouiwe.fragmentders.databinding.FragmentBirinciBinding
import com.ubuntuyouiwe.fragmentders.databinding.FragmentIkinciBinding


class IkinciFragment : Fragment() {

    private lateinit var binding: FragmentIkinciBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentIkinciBinding.inflate(inflater, container, false)
        binding.button3SayfayaGecis.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.Uc_Sayfa_Gecis)

        }
        return binding.root

    }

}