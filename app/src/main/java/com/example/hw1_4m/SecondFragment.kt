package com.example.hw1_4m

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw1_4m.databinding.FragmentSecondBinding


class SecondFragment : FirstFragment(){
    private lateinit var binding: FragmentSecondBinding
    private val args by navArgs <SecondFragmentArgs>()




    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getData()
    }

    private fun getData() {
        binding.tvName.text = args.user.name
         binding.tvGmail.text = args.user.gmail
        binding.tvPassword.text = args.user.password.toString()

    }

}



