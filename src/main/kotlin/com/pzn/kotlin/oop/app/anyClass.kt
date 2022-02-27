package com.pzn.kotlin.oop.app

import com.pzn.kotlin.oop.data.SmartPhone

fun main() {

    // Secara default, segala function yang kita buat itu parent nya adalah Any() Class
    val smartPhone = SmartPhone("Xiaomi", "Android")

    println(smartPhone.toString())
    println(smartPhone.hashCode())
}