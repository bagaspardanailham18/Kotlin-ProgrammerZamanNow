package com.pzn.kotlin.oop.app

import com.pzn.kotlin.oop.data.Rectangle
import com.pzn.kotlin.oop.data.Shape
import com.pzn.kotlin.oop.data.Triangle

fun main() {

    val shape = Shape()
    println(shape.corner)

    val shape2 = Rectangle()
    println(shape2.corner)

    val shape3 = Triangle()
    println(shape3.corner)

}