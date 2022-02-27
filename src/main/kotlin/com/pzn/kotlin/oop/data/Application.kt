package com.pzn.kotlin.oop.data

/**
 * INNER OBJECT
 *
 * - singleton object bisa dibuat didalam class
 * - namun berbeda dengan inner class, singleton object tidak bisa mengakses properties atau function yang ada
 * di outer class nya
 */

/**
 * COMPANION OBJECT
 *
 * - kemampuan membuat inner object di dalam class, tanpa harus menggunakan object
 */

class Application(val name: String) {

    object Utilities {
        fun toUpper(name: String): String {
            return name.uppercase()
        }
    }

    companion object {
        fun toLower(name: String): String {
            return name.lowercase()
        }
    }
}