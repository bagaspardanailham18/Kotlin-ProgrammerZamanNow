package com.pzn.kotlin.intro

fun finalValue(name: String, vararg values: Int) {
    var total = 0

    for(value in values) {
        total += value
    }

    total /= values.size

    println("Final value $name = $total")
}

fun main() {

    finalValue("Bagas", 1,2,3,4,5)

}