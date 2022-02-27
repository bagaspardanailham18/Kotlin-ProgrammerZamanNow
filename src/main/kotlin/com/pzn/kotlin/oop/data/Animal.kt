package com.pzn.kotlin.oop.data

/**
 * ABSTRACT PROPERTIES & FUNCTION
 *
 * Ketika kita membuat abstract class maka kita juga bisa membuat properties dan function yang abstract,
 * artinya jika ingin membuat properties dan function yang abstract maka class nya wajib abstract.
 * Properties dan function yang bersifat abstract tidak perlu diinisialisasi value nya. Diinisialisasi hanya
 * ketika dioverride di class child nya
 */

abstract class Animal {
    abstract val name: String
    abstract fun run(): Unit
}

class Cat : Animal() {
    override val name: String = "Cat"
    override fun run() {
        println("Cat run")
    }
}

class Dog : Animal() {
    override val name: String
        get() = "Dog"

    override fun run() {
        println("Dog run")
    }
}