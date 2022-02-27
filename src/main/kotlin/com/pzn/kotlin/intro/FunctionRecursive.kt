package com.pzn.kotlin.intro

/* Recursive Function

is a function that call the function it self
Sometimes we often find a case where using recursive function is easier than without recursive function
ex : Factorial

 */

fun main() {

    fun factorialLoop(value: Int): Int {
        var result = 1
        for (i in value downTo 1) {
            result *= i
        }

        return result
    }

    println(factorialLoop(10))


    fun factorialRecursive(value: Int): Int {
        return when(value) {
            1 -> 1
            else -> value * factorialRecursive(value-1)
        }
    }

    println(factorialRecursive(10))

}