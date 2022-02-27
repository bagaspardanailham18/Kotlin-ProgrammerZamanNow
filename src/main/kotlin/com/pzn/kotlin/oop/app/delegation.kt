package com.pzn.kotlin.oop.app

import com.pzn.kotlin.oop.data.MyBase
import com.pzn.kotlin.oop.data.MyBaseDelegate

/**
 * DELEGATION OTOMATIS
 *
 * Salah satu design pattern lain (selain Singleton) yang populer adalah Delegation
 * Delegation sederhananya adalah meneruskan properties atau function ke object yang lain
 * Kotlin mendukung delegation tanpa harus membuat kode secara manual
 *
 * Dalam delegation, properties dan function secara otomatis akan didelegasikan ke object yang dipilih
 * Namun kita tetap bisa meng-override properties dan function jika kita mau
 *
 * - dengan menggunakan delegation otomatis (by), maka secara otomatis seluruhnya akan didelegasikan
 * - jika tidak ingin seluruhnya didelegasikan (sebagian), maka perlu di override
 */

fun main() {
    val base = MyBase()
    base.sayHello("Bagas")

    val baseDelegate = MyBaseDelegate(base)
    baseDelegate.sayHello("Eko")
    baseDelegate.sayGoodbye("Eko")
}