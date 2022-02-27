package com.pzn.kotlin.oop.app

import com.pzn.kotlin.oop.data.Account

/**
 * OBSERVABLE PROPERTIES
 *
 * - Salah satu standar library yang disediakan oleh Kotlin untuk delegating di properties adalah observable properties
 * - Dengan observable properties, kita bisa tahu properties, value sebelum dan value setelah ketika diubah
 */

fun main() {
    val account = Account()

    account.description = "Contoh"
    account.description = "Ubah"
    account.description = "Diubah"
}