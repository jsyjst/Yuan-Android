package com.example.learnkt

import android.content.Context
import android.os.Bundle
import androidx.core.content.edit
import com.example.learnkt.base.BaseActivity
import com.example.learnkt.expand.lettersCount
import com.example.learnkt.expand.times
import com.example.learnkt.recyclerview.view.RecyclerDemoActivity
import com.example.learnkt.top.learn
import com.example.learnkt.top.startActivity
import com.example.learnkt.view.FirstActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.concurrent.thread

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        jumpToFirstActivityBtn.setOnClickListener {
            FirstActivity.actionStart(this, "data1", 1)
        }
        jumpToFruitRecyclerActivityBtn.setOnClickListener {
            //RecyclerDemoActivity.actionStart(this)
            startActivity<RecyclerDemoActivity>(this) {
                putExtra("param1", 1)
                putExtra("param2", "2")
            }
        }
        learn()
        // 扩展函数
        val letterCount = "djiajij121243jdjwfidajfaj".lettersCount()
        val str = "abc" * 3
    }

    fun initSharedPreference() {
        getSharedPreferences("data", Context.MODE_PRIVATE).edit {
            putString("name", "Tom");
            putInt("age", 28)
        }
    }

    fun startThread() {
        thread {

        }
    }
}