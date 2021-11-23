package com.example.customview

import android.content.Context
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.DataBindingUtil
import com.example.customview.databinding.LayoytNumpadBinding

open class NumpadLayout(context: Context) : ConstraintLayout(context) {

    private var numpadListener: NumpadListener? = null


//    private lateinit var binding: LayoytNumpadBinding by lazy {
//        DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.layoyt_numpad, this, true)
//    }
//
    private lateinit var binding: LayoytNumpadBinding


    init {
        binding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.layoyt_numpad, this, true)
        binding.crNumpad = this
        binding.btnOne.setOnClickListener {
            numpadListener?.numClick(1)
        }
        binding.btnTwo.setOnClickListener {
            numpadListener?.numClick(2)
        }
        binding.btnThree.setOnClickListener {
            numpadListener?.numClick(3)
        }
        binding.btnFour.setOnClickListener {
            numpadListener?.numClick(4)
        }
        binding.btnFive.setOnClickListener {
            numpadListener?.numClick(5)
        }
        binding.btnSix.setOnClickListener {
            numpadListener?.numClick(6)
        }
        binding.btnSeven.setOnClickListener {
            numpadListener?.numClick(7)
        }
        binding.btnEight.setOnClickListener {
            numpadListener?.numClick(8)
        }


    }

    fun setOnClickNumpadListener(numpadListener: NumpadListener) {
        this.numpadListener = numpadListener
    }

    interface NumpadListener {
        fun numClick(num: Int)
    }
}