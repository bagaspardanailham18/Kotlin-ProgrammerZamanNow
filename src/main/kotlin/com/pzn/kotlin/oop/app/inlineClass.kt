package com.pzn.kotlin.oop.app

import com.pzn.kotlin.oop.data.Token

/**
 * INLINE CLASS harus satu parameter
 * - digunakan jika akan membuat class yang hanya 1 parameter
 */

fun main() {
    val token = Token("Ini Token")
    println(token.value)
    println(token.toUpper())
}