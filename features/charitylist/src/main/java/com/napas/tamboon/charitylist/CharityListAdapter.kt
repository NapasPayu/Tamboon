package com.napas.tamboon.charitylist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.napas.tamboon.charitylist.databinding.CharityItemBinding
import com.napas.tamboon.domain.model.Charity

class CharityListAdapter(
    private val onClick: (Charity) -> Unit
) : ListAdapter<Charity, CharityListAdapter.ViewHolder>(CharityDiffCallback) {

    inner class ViewHolder(private val binding: CharityItemBinding, onClick: (Charity) -> Unit) :
        RecyclerView.ViewHolder(binding.root) {

        private var currentCharity: Charity? = null

        init {
            binding.root.setOnClickListener {
                currentCharity?.let {
                    onClick(it)
                }
            }
        }

        fun bind(charity: Charity) {
            currentCharity = charity
            binding.charity = charity
            binding.executePendingBindings()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = CharityItemBinding.inflate(inflater)
        return ViewHolder(binding, onClick)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) =
        holder.bind(getItem(position))
}

object CharityDiffCallback : DiffUtil.ItemCallback<Charity>() {
    override fun areItemsTheSame(oldItem: Charity, newItem: Charity): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Charity, newItem: Charity): Boolean {
        return oldItem.id == newItem.id
    }
}