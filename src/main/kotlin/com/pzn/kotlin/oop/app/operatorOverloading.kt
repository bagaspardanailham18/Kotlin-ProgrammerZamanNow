package com.pzn.kotlin.oop.app

import com.pzn.kotlin.oop.data.Fruit

/**
 * OPERATOR OVERLOADING
 *
 * Kotlin mendukung operator overloading, artinya kita bisa membuat function dari operator-operator seperti operator matematika, dan lain-lain
 * Kemampuan ini membuat kita bisa melakukan operasi apapun di object seperti layaknya tipe data Integer
 * Ada banyak sekali operator yang bisa di override di Kotlin
 */

fun main() {
    val fruit1 = Fruit(100)
    val fruit2 = Fruit(100)
    val fruit3 = fruit1 + fruit2
    println(fruit3)
    println(fruit3.quantity)

    println(fruit3 - Fruit(10))
}