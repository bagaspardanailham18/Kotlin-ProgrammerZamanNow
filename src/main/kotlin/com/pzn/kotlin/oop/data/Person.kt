package com.pzn.kotlin.oop.data

class Person {

    var firstName: String = ""
    var middleName: String? = null
    var lastName: String = ""

    fun sayHello(firstName: String) {
        println("Hello $firstName, my name is ${this.firstName}")
    }

    /**
     * FUNCTION OVERLOADING
     * is an ability of function in Kotlin to make two or more function with the same name,
     * but the parameter type or number of paramater must different
     */
    fun sayHello(firstNameParam: String, lastNameParam: String) {
        println("Hello $firstNameParam $lastNameParam, my name is $firstName")
    }

    fun run() {
        println("I'm run")
    }

    fun getFullName(): String {
        return "$firstName $middleName $lastName"
    }

}