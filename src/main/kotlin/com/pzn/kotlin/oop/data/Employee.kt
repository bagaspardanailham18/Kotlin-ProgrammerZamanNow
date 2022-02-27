package com.pzn.kotlin.oop.data

open class Employee(val name: String) {

    open fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }

}

/**
 * FUNCTION OVERRIDING
 */

open class Manager(name: String) : Employee(name) {
    final override fun sayHello(name: String) {
        println("Hello $name, my name is Manager ${this.name}")
    }
}


/**
 * FINAL OVERRIDE FUNCTION
 */
class SuperManager(name: String) : Manager(name) {
//    override fun sayHello(name: String) {
//        println("Hello $name, my name is Super Manager ${this.name}")
//    }
}

class VicePresident(name: String) : Employee(name) {
    override fun sayHello(name: String) {
        println("Hello $name, my name is Vice President ${this.name}")
    }
}