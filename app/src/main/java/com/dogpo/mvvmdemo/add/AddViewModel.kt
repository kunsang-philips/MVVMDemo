package com.dogpo.mvvmdemo.add

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AddViewModel @Inject constructor(val add: Add) : ViewModel() {
    // never create object inside another inside. Instead, use hilt and get the object reference through contructor injection
    // val addImpl = AddImpl1()
    val addLiveData = MutableLiveData<Int>()
    fun add(number1: Int, number2: Int) {
        val result = add.add(number1, number2)
        addLiveData.postValue(result)
    }
}
