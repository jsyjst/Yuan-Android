package com.example.learnkt.mvvm.view

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.learnkt.R
import com.example.learnkt.base.BaseActivity
import com.example.learnkt.mvvm.model.CountViewModel
import kotlinx.android.synthetic.main.activity_count.*

/**
 * Author : jaceyuan
 * Time : 2022/7/6
 * Description : ViewModel的基本用法
 */
class CountActivity : BaseActivity() {
    lateinit var viewModel: CountViewModel

    fun actionStart(context : Context) {
        context.startActivity(Intent())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(CountViewModel::class.java)
        plusOneBtn.setOnClickListener {
            viewModel.counter++
            refreshCounter()
        }
        refreshCounter()
    }

    private fun refreshCounter() {
        infoText.text = viewModel.counter.toString()
    }
}