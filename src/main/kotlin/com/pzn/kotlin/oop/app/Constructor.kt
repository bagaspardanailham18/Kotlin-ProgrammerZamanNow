package com.pzn.kotlin.oop.app

import com.pzn.kotlin.oop.data.Car

fun main() {
    val avanza = Car("Toyota")
    val almaz = Car("Wuling", "Almaz")

    println(avanza.brand)
    println(almaz.brand)
    println(avanza.year)
    println(almaz.year)
}