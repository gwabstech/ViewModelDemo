package com.example.viewmodeldemo1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodeldemo1.databinding.ActivityMainBinding
import com.example.viewmodeldemo1.viewModel.MainActivityViewModel
import com.example.viewmodeldemo1.viewModel.ViewModelFactory

class MainActivity : AppCompatActivity() {

    // Please do "Build => Clean Project" and "Build => Rebuild Project" before run the code 

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var viewModelFactory: ViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        viewModelFactory = ViewModelFactory(10)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainActivityViewModel::class.java)
        binding.lifecycleOwner = this
        binding.myViewModel = viewModel
      /*
        viewModel.num.observe(this, Observer {
            binding.countText.text = it.toString()
        })

       */


    }
}