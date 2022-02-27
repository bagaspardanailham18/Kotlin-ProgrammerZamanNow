package com.pzn.kotlin.oop.app

import com.pzn.kotlin.oop.data.Laptop
import com.pzn.kotlin.oop.data.SmartPhone

fun printObject(any: Any) {
    if (any is Laptop) {
        println("Laptop with name ${any.name}")
    } else if (any is SmartPhone) {
        println("Smartphone with name ${any.name} and OS ${any.os}")
    } else {
        println(any)
    }
}

fun printObjectWithWhen(any: Any) {
    when (any) {
        is Laptop -> println("Laptop with name ${any.name}")
        is SmartPhone -> println("Smartphone with name ${any.name} and OS ${any.os}")
        else -> println(any)
    }
}

fun printString(any: Any) {
    val value = any as String // Penggunaan as tidak disarankan karena tidak aman jika tidak sesuai dengan tipe datanya
    println(value)
}

fun printStringSafe(any: Any) {
    val value: String? = any as? String
    println(value)
}

fun main() {
    printObject("Bagas")
    printObjectWithWhen(1)
    printObject(Laptop("Asus"))
    printObjectWithWhen(SmartPhone("Realme", "Android"))

    printString("Eko") // Success

    // Error cast exception
//    printString(1)

    printStringSafe("Maman") // Success
    printStringSafe(1) // Null
}