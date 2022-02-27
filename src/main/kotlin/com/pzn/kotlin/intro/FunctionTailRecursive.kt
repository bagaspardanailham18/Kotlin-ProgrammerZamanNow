package com.pzn.kotlin.intro

/* Tail Recursive Function

is a good feature in Kotlin, but unfortunatelly there is a limit in it,
if recursive function that we make when it is run and then call the function it self too deep, then it will stack overflow error.

But in Kotlin, there is a solution for this problem, that is by using tail recursive function.
Tail recursive function is a technique to change recursive function that we make, becomes a simple/regular loop when run.

Not all of recursive function automatically can be changed to tailrec function, there are rules.
Rules : 1. Add tailrec in front of the function
        2. When the function it self is called, can only call the function it self without any additional operations with other data

 */

fun main() {

    /*

    fun tampil(value: Int) {
        println(value)
        if (value > 0) {
            tampil(value - 1)
        }
    }

    tampil(10) -> will ERROR

     */

//    tailrec fun display(value: Int) {
//        println(value)
//        if (value > 0) {
//            display(value - 1)
//        }
//    }
//
//    display(10)


    tailrec fun factorialTailRec(value: Int, total: Int = 1): Int {
        return when(value) {
            1 -> total
            else -> factorialTailRec(value-1, total * value)
        }
    }

    println(factorialTailRec(10))

}