package com.pzn.kotlin.intro

/* Syarat
1. Parameter tidak boleh 2
2. Parameter tidak boleh berupa varargs
 */

infix fun String.to(type: String): String {
    return "Hello ${this.uppercase()}"
}

infix fun String.toLower(type: String): String {
    return "Hello ${this.lowercase()}"
}

infix fun String.toDouble(type: String): String {
    return "Hello ${this.toInt().toDouble()}"
}

fun main() {

    val name: String = "bagas"
    val name1: String = "BAGAS"
    val toUpper: String = name to "UP"
    val toLower: String = name1 toLower "LOW"

    println(toUpper)
    println(toLower)


    val num: String = "1"
    val toDouble: String = num toDouble  "D"

    println(toDouble)

}
