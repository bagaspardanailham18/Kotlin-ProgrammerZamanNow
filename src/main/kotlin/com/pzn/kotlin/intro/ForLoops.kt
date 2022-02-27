package com.pzn.kotlin.intro

fun main() {

    val names = arrayOf("Bagas", "Hilda", "Anissa")

    for (i in 1..20 step 2) {
        println(i)
    }

    var index = 0
    for (name in names) {
        println("Index ke $index = $name")
        index++
    }

}