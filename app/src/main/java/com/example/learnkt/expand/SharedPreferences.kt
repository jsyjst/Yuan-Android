package com.example.learnkt.expand

import android.content.SharedPreferences

/**
 * Author : jaceyuan
 * Time : 2022/1/10
 * Description : SharedPreference的扩展
 */
fun SharedPreferences.open(block: SharedPreferences.Editor.() -> Unit) {
    val editor = edit()
    editor.block()
    editor.apply()
}