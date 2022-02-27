package com.pzn.kotlin.oop.app

import com.pzn.kotlin.oop.data.Application

typealias App = Application
typealias Aplikasi = App
typealias App2 = com.pzn.kotlin.oop.data2.Application

// Type Alias untuk function
typealias StringSupplier = () -> String

/**
fun sayHello(supplier: () -> String) {
    println("Hello ${supplier()}")
}
**/

fun sayHello(supplier: StringSupplier) {
    println("Hello ${supplier()}")
}

fun main() {
    val app = App("Kotlin App")
    val aplikasi = Aplikasi("Kotlin App")
    val app2 = App2("Kotlin App")

    sayHello { "Hello" }
}