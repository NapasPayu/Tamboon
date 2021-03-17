package com.napas.tamboon.donation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.napas.tamboon.commonui.base.BaseFragment
import com.napas.tamboon.donation.databinding.FragmentDonationCompleteBinding

class DonationCompleteFragment : BaseFragment() {

    private lateinit var binding: FragmentDonationCompleteBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDonationCompleteBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonOk.setOnClickListener {
            findNavController().popBackStack()
        }
    }
}