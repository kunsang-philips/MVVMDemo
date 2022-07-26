package com.dogpo.mvvmdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.dogpo.mvvmdemo.databinding.FragmentMainBinding

/**
 * A simple [Fragment] subclass.
 * Use the [MainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainFragment : Fragment() {

    lateinit var viewBinder: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        viewBinder = FragmentMainBinding.inflate(inflater)
        initListner()
        return viewBinder.root
    }

    private fun initListner() {
        viewBinder.buttonAdd.setOnClickListener {
            findNavController().navigate(R.id.gotoAddFragment)
        }
    }
}
