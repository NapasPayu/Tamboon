package com.napas.tamboon.donation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import co.omise.android.extensions.setOnAfterTextChangeListener
import com.napas.tamboon.commonui.base.BaseFragment
import com.napas.tamboon.donation.databinding.FragmentDonationBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class DonationFragment : BaseFragment() {

    private val viewModel: DonationViewModel by viewModel()
    private lateinit var binding: FragmentDonationBinding
    private val invalidMessage by lazy { getString(R.string.field_invalid) }

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

        viewModel.alertEvent.observeSingle(viewLifecycleOwner, {
            it?.let {
                showAlertDialog(it)
            }
        })

        viewModel.donationResult.observeSingle(viewLifecycleOwner, {
            it?.let {
                findNavController().navigate(DonationFragmentDirections.actionDonationFragmentToDonationCompleteFragment())
            }
        })

        with(binding.editTextCreditCard) {
            setOnAfterTextChangeListener {
                viewModel.onCreditCardChanged(isValid)
                binding.textInputLayoutCreditCard.error = invalidMessage.takeIf { !isValid }
            }
        }

        with(binding.editTextCardName) {
            setOnAfterTextChangeListener {
                viewModel.onCardNameChanged(isValid)
                binding.textInputLayoutCardName.error = invalidMessage.takeIf { !isValid }
            }
        }

        with(binding.editTextExpiryDate) {
            setOnAfterTextChangeListener {
                viewModel.onExpiryDateChanged(isValid)
            }
        }

        with(binding.editTextSecurityCode) {
            setOnAfterTextChangeListener {
                viewModel.onSecurityCodeChanged(isValid)
            }
        }

        binding.buttonSubmit.setOnClickListener {
            viewModel.donate(
                creditCard = binding.editTextCreditCard.cardNumber,
                cardName = binding.editTextCardName.cardName,
                expiryMonth = binding.editTextExpiryDate.expiryMonth,
                expiryYear = binding.editTextExpiryDate.expiryYear,
                securityCode = binding.editTextSecurityCode.securityCode
            )
        }
    }
}