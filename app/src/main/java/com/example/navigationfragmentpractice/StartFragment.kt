package com.example.navigationfragmentpractice


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.navigationfragmentpractice.databinding.FragmentStartBinding


/**
 * A simple [Fragment] subclass.
 */
class StartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?    ): View? {

       val binding: FragmentStartBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_start,container,false)

        binding.button.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_startFragment_to_directionFragment)
        }
        return binding.root

    }


}
