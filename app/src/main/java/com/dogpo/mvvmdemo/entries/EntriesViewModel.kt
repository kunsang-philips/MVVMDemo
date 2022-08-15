package com.dogpo.mvvmdemo.entries

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dogpo.mvvmdemo.model.TestData
import com.dogpo.mvvmdemo.repository.EntriesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

// always inject interface or abstract insist of concreate class. Provide implementation through di
@HiltViewModel
class EntriesViewModel @Inject constructor(private val repository: EntriesRepository) : ViewModel() {
    val entriesData = MutableLiveData<TestData>()
    fun retrieveEntries() {
        viewModelScope.launch {
            entriesData.postValue(repository.getEntries())
        }
    }
}
