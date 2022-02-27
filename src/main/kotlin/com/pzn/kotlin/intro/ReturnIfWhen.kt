package com.pzn.kotlin.intro

fun main() {

    fun sayHello(name: String): String {
        return if(name == "") {
            "Hello Bro"
        } else {
            "Hello $name"
        }
    }

    println(sayHello(""))


    fun sayHi(name: String): String {
        return when(name) {
            "" -> "Hi Bro"
            else -> "Hi $name"
        }
    }

    println(sayHi("Bagas"))

}