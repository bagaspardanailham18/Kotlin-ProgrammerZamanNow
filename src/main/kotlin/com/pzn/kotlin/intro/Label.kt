package com.pzn.kotlin.intro

fun labelBreak() {
    loopI@ for(i in 1..10) {
        loopJ@ for (j in 1..10) {
            println("$i * $j = ${i*j}")
            if (j == 10) {
                break@loopI
            }
        }
    }
}

fun labelContinue() {
    loopK@ for(i in 1..10) {
        loopL@ for (j in 1..10) {
            println("$i * $j = ${i*j}")
            if (j == 5) {
                continue@loopK
            }
        }
    }
}


fun main() {

    fun test(name: String, operation: (String) -> Unit): Unit = operation(name)

    test("Eko") test@{
        if (it == "") {
            return@test
        } else {
            println("Eko")
        }
    }

}