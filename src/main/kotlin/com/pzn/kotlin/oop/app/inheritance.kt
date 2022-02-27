package com.pzn.kotlin.oop.app

import com.pzn.kotlin.oop.data.Manager
import com.pzn.kotlin.oop.data.VicePresident

fun main() {

    val manager = Manager("Bagas")
    manager.sayHello("Budi")

    val vicePresident = VicePresident("Budi")
    vicePresident.sayHello("Bagas")
}