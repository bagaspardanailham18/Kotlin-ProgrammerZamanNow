package com.pzn.kotlin.oop.app

import com.pzn.kotlin.oop.data.Product

/**
 * Penggunaan Data Class memungkinkan kita menggunakan function copy() untuk menduplikat objek yang sudah dibuat
 */

fun main() {
    val product = Product("Indomie", 2500, "Food")
    val product2 = product.copy()
    val product3 = product.copy(name = "Sedap")

    println(product)
    println(product2)
    println(product3)
}