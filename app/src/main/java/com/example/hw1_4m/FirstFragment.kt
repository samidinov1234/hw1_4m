package com.example.hw1_4m

import android.os.Bundleimport

androidx.fragment.app.Fragment
import android.view.LayoutInflaterimport

android.view.View
import android.view.ViewGroupimport

androidx.navigation.fragment.findNavController
import com.geeks.hw_1_4.databinding.FragmentFirstBinding

open class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState) setupListener ()
    }

    private fun setupListener() {
        binding.btnNext.setOnClickListener {
            findNavController().navigate(
                FirstFragmentDirections.actionFirstFragmentToSecondFragment2(
                    User(
                        binding.etName.text.toString(),
                        binding.etGmail.text.toString(), binding.etPassword.text.toString().toInt()
                    )
                )
            )
        }
    }
}