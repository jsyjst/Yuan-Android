package com.example.learnkt.top

import android.content.Context
import android.content.Intent

/**
 * Author : jaceyuan
 * Time : 2022/2/23
 * Description : 泛型实化
 */

inline fun <reified T> startActivity(context : Context) {
    val intent = Intent(context, T::class.java)
    context.startActivity(intent)
}

inline fun <reified T> startActivity(context : Context, block: Intent.() -> Unit) {
    val intent = Intent(context, T::class.java)
    intent.block()
    context.startActivity(intent)
}