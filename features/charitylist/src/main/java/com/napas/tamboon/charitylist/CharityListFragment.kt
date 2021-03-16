package com.napas.tamboon.charitylist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.napas.tamboon.charitylist.databinding.FragmentCharityListBinding

class CharityListFragment : Fragment() {

    private val viewModel: CharityListViewModel by viewModels()
    private lateinit var binding: FragmentCharityListBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCharityListBinding.inflate(inflater, container, false).apply {
            viewModel = viewModel
            binding.lifecycleOwner = viewLifecycleOwner
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}

