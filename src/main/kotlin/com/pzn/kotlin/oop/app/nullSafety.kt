package com.pzn.kotlin.oop.app

/**
 * NULL SAFETY
 *
 * 1. Safe Call
 * 2. Elvis Operator
 * 3. !! Operator
 * 4. Pengecekan manual
 */

data class Friend(val name: String)

fun sayHello(friend: Friend?) {
    // Pengecekan manual
    if (friend != null) {
        println("Hello ${friend.name}")
    }

    // SafeCall (Direkomendasikan) -> jika parameternya null, maka akan ditampilkan string null
    println("Hello ${friend?.name}")

    // Elvis Operator
//    val name = friend?.name ?: "Friend"
//    println("Hello $name")

    // !!Operator (tidak direkomendasikan) -> Jika parameternya null maka akan ERROR
    val name = friend!!.name
    println("Hello $name")
}

fun main() {
    sayHello(Friend("Bagas"))
    sayHello(null) // Menggunakan !!operator akan ERROR
}