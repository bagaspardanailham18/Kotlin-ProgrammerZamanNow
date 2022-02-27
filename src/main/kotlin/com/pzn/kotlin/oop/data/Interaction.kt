package com.pzn.kotlin.oop.data

/**
 * Di dalam class interface itu dilarang untuk mendeklarasikan value pada properties,
 * namun diperbolehkan untuk mendekrlarasikan body pada method
 */

interface Interaction {
    val name: String
    fun sayHello(name: String)

    // Concrete Interface
    fun sayGoodbye(name: String) {
        println("Good bye $name")
    }
}

interface Go : Interaction {
    fun go() {
        println("Go!")
    }
}

interface MoveA {
    fun move() = println("Move A")
}

interface MoveB {
    fun move() = println("Move B")
}

class Human(override val name: String) : Go, MoveA, MoveB {
    override fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }

    override fun move() {
        super<MoveA>.move()
        super<MoveB>.move()
        println("Move Human")
    }
}