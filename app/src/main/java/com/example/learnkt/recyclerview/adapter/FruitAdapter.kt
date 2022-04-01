package com.example.learnkt.recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.learnkt.R
import com.example.learnkt.recyclerview.enity.Fruit

class FruitAdapter(private val fruitList : List<Fruit>) : RecyclerView.Adapter<FruitAdapter.ViewHolder>() {

    inner class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        val fruitName: TextView = view.findViewById(R.id.fruitName)
        val fruitImg: ImageView = view.findViewById(R.id.fruitImg)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler_fruit, parent, false)
        return ViewHolder(view);
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val fruit = fruitList[position]
        if (fruit.imageId != 0) {
            holder.fruitImg.setImageResource(fruit.imageId)
            holder.fruitImg.visibility = VISIBLE
        } else {
            holder.fruitImg.visibility = GONE
        }
        holder.fruitName.text = fruit.name
    }

    override fun getItemCount(): Int {
        return fruitList.size
    }


}