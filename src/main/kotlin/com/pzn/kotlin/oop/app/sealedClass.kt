package com.pzn.kotlin.oop.app

import com.pzn.kotlin.oop.data.Minus
import com.pzn.kotlin.oop.data.Modulo
import com.pzn.kotlin.oop.data.Operation
import com.pzn.kotlin.oop.data.Plus


/**
 * Sealed Class
 *
 * - merupakan jenis class yang didesain untuk inheritance
 * - tidak bisa diinstansiasi menjadi objek, dan secara standar sealed class merupan abstract class
 * - cocok digunakan sebagai class parent
 *
 * - Sealed class sangat berguna saat kita menggunakan when expression
 * - dengan menggunakan sealed class, kita bisa membatasi class turunannya yang perlu dicheck
 */

fun operation(value1: Int, value2: Int, operation: Operation): Int {
    return when(operation) {
        is Plus -> value1 + value2
        is Minus -> value1 - value2
        is Modulo -> value1 % value2
    }
}

fun main() {
    println(operation(10, 10, Plus()))
    println(operation(10, 5, Minus()))
    println(operation(10, 3, Modulo()))
}