package com.pzn.kotlin.oop.app

import com.pzn.kotlin.oop.data.Account

/**
 * LAZY PROPERTIES
 *
 * - Selain delegating di class, Kotlin mendukung delegating di properties.
 * - Salah satu implementasi delegating properties yang sudah disediakan oleh Kotlin adalah, lazy properties
 * - Lazy adalah standar library yang telah disediakan agar properties baru diinisialisasi ketika properties itu diakses
 * - Intinya lazy properties hanya akan diinisailisasi ketika dipanggil
 */
fun main() {
    val account = Account()
    println(account.name)
    println(account.name)
    println(account.name)

}