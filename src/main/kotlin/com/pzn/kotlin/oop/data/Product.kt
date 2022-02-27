package com.pzn.kotlin.oop.data

/**
 * Data Class akan secara otomatis membuat fungsi toString, equals, dll
 */

data class Product(
    val name: String,
    val price: Int,
    val category: String
)