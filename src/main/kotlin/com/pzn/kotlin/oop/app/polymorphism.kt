package com.pzn.kotlin.oop.app

import com.pzn.kotlin.oop.data.Employee
import com.pzn.kotlin.oop.data.Manager
import com.pzn.kotlin.oop.data.VicePresident


/**
 * POLYMORPHISM
 *
 * Polymorphism berasal dari bahasa Yunani yang berarti banyak bentuk.
 * Dalam OOP, Polymorphism adalah kemampuan sebuah object berubah bentuk menjadi bentuk lain
 * Polymorphism erat hubungannya dengan Inheritance (tidak bisa tercapai tanpa adanya inheritance)
 */

fun main() {
    var employee = Employee("Bagas")
    employee.sayHello("Budi")

    employee = Manager("Bagas")
    employee.sayHello("Budi")

    employee = VicePresident("Bagas")
    employee.sayHello("Budi")
}