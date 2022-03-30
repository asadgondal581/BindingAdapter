package com.example.bindingadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.bindingadapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        binding.mainViewModel = viewModel
        binding.lifecycleOwner = this

    }
}