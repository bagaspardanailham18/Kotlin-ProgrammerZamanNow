package com.pzn.kotlin.oop.app

import com.pzn.kotlin.oop.data.Human

/**
 * INTERFACE
 *
 * mirip dengan abstract class, yaitu tidak bisa dibuat objek nya secara langsung tapi hanya bisa diturunkan.
 * Namun Interface itu seperti kontrak, artinya class apapun yang extend ke Interface wajib mengoverride semua member yang ada di class Interface
 */

/**
 * Di interface pun ada yang disebut dengan multiple interaction, yang mana setiap class bisa extend ke lebih dari satu class Interface.
 * selain itu
 * Interface juga bisa inherit ke Interface yang lain, tetapi tidak bisa inherit ke class biasa
 */

fun main() {
    val human = Human("Bagas")

    human.sayHello("Eko")
    human.go()
    human.move()

    human.sayGoodbye("Bagas")
}