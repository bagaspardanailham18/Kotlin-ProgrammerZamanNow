package com.pzn.kotlin.oop.app

import com.pzn.kotlin.oop.data.Television

/**
 * Late Init Properties
 *
 * Dapat menunda inisialisasi data para properties.
 * Dapat membuat properties tanpa langsung mengisi datanya.
 * Lateinit hanya bisa digunakan di var, tidak bisa di val
 */

fun main() {
    val tv = Television()
//    tv.brand = "Samsung"
    tv.initTelevision("Samsung")
    println(tv.brand)
}