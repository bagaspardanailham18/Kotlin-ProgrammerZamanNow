package com.pzn.kotlin.oop.app

import com.pzn.kotlin.oop.data.Application
import com.pzn.kotlin.oop.data.Utilities

/**
 * SINGLETON OBJECT
 * - salah satu konsep design pattern
 * - merupakan object yang hanya dibuat satu kali
 * - mirip dengan class, bisa extends class ataupun interface
 * - namun tidak boleh memiliki constructor
 */

/**
 * INNER OBJECT
 *
 * - singleton object bisa dibuat didalam class
 * - namun berbeda dengan inner class, singleton object tidak bisa mengakses properties atau function yang ada
 * di outer class nya
 */

fun main() {
    Utilities.name = "Dirubah"

    // Memanggil Singleton Object
    println(Utilities.toUpper("Eko"))

    a()
    b()

    // Memanggil Inner Object
    println(Application.Utilities.toUpper("Bagas"))

    // Memanggil Companion object
    println(Application.toLower("BAGAS"))
}

fun a() {
    println(Utilities.name)
}

fun b() {
    println(Utilities.name)
}