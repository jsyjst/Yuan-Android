package com.example.learnkt.kotlin.泛型

/**
 * Author : jaceyuan
 * Time : 2022/4/2
 * Description : 泛型
 * 1.泛型实化
 * 2.泛型协变
 * 3.泛型逆变
 */

/**
 * 1.泛型实化
 */
inline fun <reified T> getGenericType() = T::class.java

/**
 * 2.泛型协变
 */
open class Person(val name: String, val age: Int)
class Student(name: String, age: Int) : Person(name, age)
class Teacher(name: String, age: Int) : Person(name, age)

class SimpleData<out T>(private val data: T?){
    fun get(): T? {
        return data
    }
}

fun main() {
    // 1.泛型实化
    val result1 = getGenericType<Student>()
    val result2 = getGenericType<Teacher>()
    println("result1 is $result1")
    println("result2 is $result2")
    // 2.泛型协变
    val student = Student("Tom", 19)
    val data = SimpleData(student)
    handleSimpleData(data)
    val studentData = data.get()
    println("studentData is $studentData")
}

fun handleSimpleData(data: SimpleData<Person>) {
    val personData = data.get()
    println("personData is $personData")
}