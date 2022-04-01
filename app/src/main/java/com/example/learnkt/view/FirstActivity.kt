package com.example.learnkt.view

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.example.learnkt.R
import com.example.learnkt.base.BaseActivity

class FirstActivity : BaseActivity() {

    companion object {
        private const val INTENT_EXTRA_DATA_1 = "data1";
        private const val INTENT_EXTRA_DATA_2 = "data2";
        fun actionStart(context: Context, data1: String, data2: Int) {
//            val intent = Intent(context, FirstActivity::class.java)
//            intent.putExtra(INTENT_EXTRA_DATA_1, data1)
//            intent.putExtra(INTENT_EXTRA_DATA_2, data2)
            // 使用apply函数
            val intent = Intent(context, FirstActivity::class.java).apply {
                putExtra(INTENT_EXTRA_DATA_1, data1)
                putExtra(INTENT_EXTRA_DATA_2, data2)
            }
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
    }
}