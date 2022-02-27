package com.pzn.kotlin.oop.data

/**
 * SINGLETON OBJECT
 * - salah satu konsep design pattern
 * - merupakan object yang hanya dibuat satu kali
 * - mirip dengan class, bisa extends class ataupun interface
 * - namun tidak boleh memiliki constructor
 */

object Utilities {
    var name: String = "My Utilities"

    fun toUpper(value: String): String {
        return value.uppercase()
    }
}