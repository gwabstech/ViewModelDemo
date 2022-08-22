package com.example.viewmodeldemo1.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(number: Int) : ViewModel() {
    private var count = MutableLiveData<Int>()

    val num:LiveData<Int>
        get()  = count

    init {
        count.value = number
    }

    fun UpdatedCount(){
        count.value = count.value?.plus(1)
    }
}