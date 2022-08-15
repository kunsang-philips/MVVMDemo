package com.dogpo.mvvmdemo.entries

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.dogpo.mvvmdemo.databinding.EntriesFragmentBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class EntriesFragment : Fragment() {

    private val viewModel: EntriesViewModel by viewModels()
    private lateinit var viewBinder: EntriesFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewBinder = EntriesFragmentBinding.inflate(layoutInflater)
        viewModel.retrieveEntries()
        observeData()
        return viewBinder.root
    }

    private fun observeData() {
        viewModel.entriesData.observe(viewLifecycleOwner, {
            val sb = StringBuilder()
            it.entries.forEach {
                sb.append(it.description).append("\n")
            }
            viewBinder.textViewEntries.text = sb.toString()
        })
    }
}
