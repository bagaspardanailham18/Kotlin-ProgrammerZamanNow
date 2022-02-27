package com.pzn.kotlin.oop.app

import com.pzn.kotlin.oop.data.Address

fun main() {

    val address1 = Address("Jalan A", "Jakarta")
    val addrees2 = Address("Jalan A", "Jakarta", "Indonesia")

    println(address1.street)
    println(addrees2.street)

}