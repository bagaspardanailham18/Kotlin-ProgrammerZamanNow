package com.pzn.kotlin.oop.data

/**
 * INLINE CLASS harus satu parameter
 * - digunakan jika akan membuat class yang hanya 1 parameter
 */

// INLINE is depreceted since Kotlin 1.5.0
//inline class Token(val value: String) {
//    fun toUpper() = value.uppercase()
//}

@JvmInline
value class Token(val value: String) {
    fun toUpper() = value.uppercase()
}