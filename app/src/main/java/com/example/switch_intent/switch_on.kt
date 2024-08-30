package com.example.switch_intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.switch_intent.databinding.ActivityMainBinding

class switch_on : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}