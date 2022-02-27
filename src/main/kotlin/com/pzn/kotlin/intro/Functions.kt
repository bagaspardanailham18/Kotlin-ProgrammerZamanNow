package com.pzn.kotlin.intro

/* Types of Function
1. Unit Returning Function
2. Function Return Type
 */


// Single Expression Function
fun kaliDua(a: Int): Int = a * 2
fun sapa(name: String): Unit = println("My name is $name")


// Function Default Parameter
fun hello(firstName: String, lastName: String? = null) {
    if (lastName == null) {
        println("$firstName")
    } else {
        println("$firstName $lastName")
    }
}

fun fullName(firstName: String, middleName: String, lastName: String) {
    println("Hello my name is $firstName $middleName $lastName")
}


// Function Return Type
fun total(a: Int, b: Int): Int {
    val total = a + b
    return total
}

fun main() {

    hello("Bagas", "Pardana")
    hello("Bintang")


// Function Named Argument
    fullName(lastName = "Banget",
        firstName = "Maman",
        middleName = "Bangsat"
    )

    println(total(2, 4))

}