package com.napas.tamboon.charitylist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.napas.tamboon.charitylist.databinding.FragmentCharityListBinding
import com.napas.tamboon.commonui.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class CharityListFragment : BaseFragment() {

    private val viewModel: CharityListViewModel by viewModel()
    private lateinit var binding: FragmentCharityListBinding
    private val adapter by lazy {
        CharityListAdapter { charity ->
            findNavController().navigate(CharityListFragmentDirections.actionCharityListFragmentToDonationFragment())
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

        binding.recyclerView.adapter = adapter

        viewModel.alertEvent.observeSingle(viewLifecycleOwner, {
            it?.let {
                showAlertDialog(it)
            }
        })

        viewModel.charities.observe(viewLifecycleOwner, {
            it?.let {
                adapter.submitList(it)
            }
        })
    }
}

