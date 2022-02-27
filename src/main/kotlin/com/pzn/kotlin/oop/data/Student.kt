package com.pzn.kotlin.oop.data

/**
 * Extension Function hanya bisa mengakses member yang bersifat public di class tersebut
 */
class Student(val name: String, val age: Int)

//fun Student.sayHello(name:String) {
//    println("Hello $name, my name is ${this.name}, and my age is ${this.age}")
//}

fun Student?.sayHello(name:String) {
    if (this != null) {
        println("Hello $name, my name is ${this.name}, and my age is ${this.age}")
    }
}

/**
 * Extension properties hanya bisa diakses dengan menggunakan getter
 */

val Student.uppername: String
    get() = this.name.uppercase()