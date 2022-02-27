package com.pzn.kotlin.oop.app

import com.pzn.kotlin.oop.data.Person

fun main() {
    val eko = Person()
    eko.firstName = "Eko"

    eko.sayHello("Bagas")
    eko.sayHello("Bagas", "Pardana")
}