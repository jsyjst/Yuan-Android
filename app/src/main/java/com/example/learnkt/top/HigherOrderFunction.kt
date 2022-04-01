package com.example.learnkt.top

import java.lang.StringBuilder

/**
 * Author : jaceyuan
 * Time : 2022/1/10
 * Description : 高阶函数学习
 */
inline fun num1AndNum2(num1: Int, num2: Int, action: (Int, Int) -> Int): Int {
    return action(num1, num2)
}

fun plus(num1: Int, num2: Int) : Int {
    return num1 + num2
}

fun minus(num1: Int, num2: Int): Int {
    return num1 - num2
}

fun StringBuilder.build(action: StringBuilder.() -> Unit) : StringBuilder {
    action()
    return this
}

fun main() {
    val num1 = 10
    val num2 = 6
    val result1 = num1AndNum2(num1, num2, ::plus)
    val result2 = num1AndNum2(num1, num2, ::minus)
    val result3 = num1AndNum2(2, 3) {
        n1, n2 -> n1 + n2
    }
    println("result1 is $result1")
    println("result2 is $result2")

    val result = StringBuilder().apply {

    }


}