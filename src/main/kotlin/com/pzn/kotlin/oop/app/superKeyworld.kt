package com.pzn.kotlin.oop.app

import com.pzn.kotlin.oop.data.Rectangle

fun main() {
    val rectangle = Rectangle()
    println("Corner ${rectangle.corner}")
    println("Parent Corner ${rectangle.parentCorner}")

    rectangle.printName()
}