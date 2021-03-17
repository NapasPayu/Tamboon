package com.napas.tamboon.charitylist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import org.koin.androidx.viewmodel.ext.android.viewModel
import com.napas.tamboon.charitylist.databinding.FragmentCharityListBinding

class CharityListFragment : Fragment() {

    private val viewModel: CharityListViewModel by viewModel()
    private lateinit var binding: FragmentCharityListBinding
    private val adapter by lazy {
        CharityListAdapter { charity ->
            Toast.makeText(
                context,
                charity.name,
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCharityListBinding.inflate(inflater, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initViewModel()
    }

    private fun initView() {
        binding.recyclerView.adapter = adapter
    }

    private fun initViewModel() {
        viewModel.loadingEvent.observeSingle(viewLifecycleOwner, {
            it?.let {
                binding.progress.isVisible = it
            }
        })

        viewModel.charities.observe(viewLifecycleOwner, {
            it?.let {
                adapter.submitList(it)
            }
        })
    }
}

