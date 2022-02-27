package com.pzn.kotlin.oop.app

import com.pzn.kotlin.oop.data.Cat
import com.pzn.kotlin.oop.data.Dog

/**
 * ABSTRACT PROPERTIES & FUNCTION
 *
 * Ketika kita membuat abstract class maka kita juga bisa membuat properties dan function yang abstract,
 * artinya jika ingin membuat properties dan function yang abstract maka class nya wajib abstract.
 * Properties dan function yang bersifat abstract tidak perlu diinisialisasi value nya. Diinisialisasi hanya
 * ketika dioverride di class child nya
 */

fun main() {
    val cat = Cat()
    cat.run()

    val dog = Dog()
    dog.run()
}