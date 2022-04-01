package com.example.learnkt.top

import kotlin.reflect.KProperty

/**
 * Author : jaceyuan
 * Time : 2022/1/13
 * Description : 类委托和委托属性
 */

fun <T> later(action: () -> T) = Later(action)
class Later<T> (val action: () -> T) {
    private var value: Any? = null

    operator fun getValue(any: Any?, prop: KProperty<*>) : T {
        if (value == null) {
            value = action()
        }
        return value as T
    }
}