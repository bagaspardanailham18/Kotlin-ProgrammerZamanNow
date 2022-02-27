package com.pzn.kotlin.oop.app

import com.pzn.kotlin.oop.data.Boss

// dengan menambahkan kunci inner maka class tersebut dapat mengakses data dikelas outernya

fun main() {

    val boss1 = Boss("Maman")
    val employee1 = boss1.Employee("Bagas")

    val boss2 = Boss("Kakang")
    val employee2 = boss2.Employee("Bakti")

    employee1.hi()
    employee2.hi()

}