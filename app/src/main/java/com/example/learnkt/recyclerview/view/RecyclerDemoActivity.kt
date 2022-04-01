package com.example.learnkt.recyclerview.view

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.learnkt.R
import com.example.learnkt.base.BaseActivity
import com.example.learnkt.recyclerview.adapter.FruitAdapter
import com.example.learnkt.recyclerview.enity.Fruit
import com.example.learnkt.top.Fail
import com.example.learnkt.top.Result
import com.example.learnkt.top.Success
import com.example.learnkt.top.Unknown
import kotlinx.android.synthetic.main.activity_recycler_demo.*

class RecyclerDemoActivity : BaseActivity() {
    private val fruitList = ArrayList<Fruit>()

    companion object {
        fun actionStart(context: Context) {
            context.startActivity(Intent(context, RecyclerDemoActivity::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_demo)
        initFruits()
        initRecycler()
    }

    private fun initFruits() {
        repeat(2) {
            fruitList.add(Fruit("apple"))
            fruitList.add(Fruit("banana"))
            fruitList.add(Fruit("orange"))
            fruitList.add(Fruit("peach"))
            fruitList.add(Fruit("pear"))
            fruitList.add(Fruit("cherry"))
            fruitList.add(Fruit("grape"))
            fruitList.add(Fruit("mango"))
        }
    }

    private fun initRecycler() {
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        val adapter = FruitAdapter(fruitList)
        recyclerView.adapter = adapter
    }

    private fun getResultMsg(result : Result) = when(result) {
        is Success -> result.msg
        is Fail -> result.error
        is Unknown -> result.unknown
    }
}