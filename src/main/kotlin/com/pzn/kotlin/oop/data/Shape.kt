package com.pzn.kotlin.oop.data

open class Shape {

    open val corner: Int = 1

    open fun printName() {
        println("This is shape")
    }

}

class Rectangle : Shape() {
    override val corner: Int = 4
    val parentCorner = super.corner // Super properties

    override fun printName() {
        println("This is Rectangle")
        super.printName() // Super function
    }
}

class Triangle : Shape() {
    override val corner: Int = 3
}