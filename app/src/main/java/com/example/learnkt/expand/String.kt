package com.example.learnkt.expand

import java.lang.StringBuilder

// String的扩展函数
fun String.lettersCount() : Int {
    var count = 0
    for (char in this) {
        if (char.isLetter()) {
            count++
        }
    }
    return count
}

operator fun String.times(n : Int) : String {
    val builder = StringBuilder()
    repeat(n) {
        builder.append(this)
    }
    return builder.toString()
}