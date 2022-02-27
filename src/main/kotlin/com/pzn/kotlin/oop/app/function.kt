package com.pzn.kotlin.oop.app

import com.pzn.kotlin.oop.data.Person

fun main() {

    val eko = Person()
    eko.firstName = "Bagas"
    eko.middleName = "Pardana"
    eko.lastName = "Ilham"

    eko.sayHello("Maman")
    eko.run()

    val fullname = eko.getFullName()
    println(fullname)

}