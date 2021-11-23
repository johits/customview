package com.example.customview

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.customview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),NumpadLayout.NumpadListener {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val numpad = findViewById<NumpadLayout>(R.id.cr_numpad)
        numpad.setOnClickNumpadListener(this)

    }

    override fun numClick(num: Int) {
        TODO("Not yet implemented")
        binding.tvNumpadInput.text = num.toString()
    }

}