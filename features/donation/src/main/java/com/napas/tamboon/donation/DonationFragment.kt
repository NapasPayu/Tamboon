package com.napas.tamboon.donation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.napas.tamboon.commonui.base.BaseFragment
import com.napas.tamboon.donation.databinding.FragmentDonationBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class DonationFragment : BaseFragment() {

    private val viewModel: DonationViewModel by viewModel()
    private lateinit var binding: FragmentDonationBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDonationBinding.inflate(inflater, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.donationResult.observeSingle(viewLifecycleOwner, {
            it?.let {
                findNavController().navigate(DonationFragmentDirections.actionDonationFragmentToDonationCompleteFragment())
            }
        })
    }
}