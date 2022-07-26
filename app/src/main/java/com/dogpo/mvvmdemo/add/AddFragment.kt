package com.dogpo.mvvmdemo.add

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.dogpo.mvvmdemo.databinding.AddFragmentBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class AddFragment : Fragment() {
    @Inject
    lateinit var addImpl1: AddImpl1

    private val viewModel: AddViewModel by viewModels()
    private lateinit var viewBinder: AddFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewBinder = AddFragmentBinding.inflate(layoutInflater)
        initListner()
        observeData()
        return viewBinder.root
    }

    private fun observeData() {
        viewModel.addLiveData.observe(viewLifecycleOwner, {
            viewBinder.tvResult.text = it.toString()
        })
    }

    private fun initListner() {
        viewBinder.btnAdd.setOnClickListener {
            viewModel.add(
                Integer.parseInt(viewBinder.et1.text.toString()),
                Integer.parseInt(viewBinder.et2.text.toString())
            )
        }
    }
}
