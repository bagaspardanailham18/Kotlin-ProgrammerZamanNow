package com.pzn.kotlin.intro

fun String.sayHello(): String {
    return "Hello $this"
}

fun String.printHello(): Unit = println("Hello $this")

fun main() {
    val name: String = "Eko"
    val hello: String = name.sayHello()

    println(hello)
    name.printHello()
    "Bagas".printHello()

}