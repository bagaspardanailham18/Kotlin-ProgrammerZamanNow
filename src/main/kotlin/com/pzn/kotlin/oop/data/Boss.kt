package com.pzn.kotlin.oop.data

class Boss(val name: String) {

    // dengan menambahkan kunci inner maka class tersebut dapat mengakses data dikelas outernya

    inner class Employee(val name: String) {

        fun hi() {
            println("Hi, my name is $name, and my boss name is ${this@Boss.name}")
        }

    }

}