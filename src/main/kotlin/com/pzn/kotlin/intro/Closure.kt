package com.pzn.kotlin.intro

/*
CLOSURE

- is ability of a function, lambda, or anonymous function to interact with datas around it in the same scope
- Harap gunakan fitur closure ini dengan bijak

 */

fun main() {

    var counter: Int = 0

    val lambdaIncrement: () -> Unit = {
        println("Lambda Increment")
        counter++
    }

    val anonymousIncrement = fun() {
        println("Anonymus Function Increment")
        counter++
    }

    fun functionIncrement() {
        println("Function Increment")
        counter++
    }

    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()
    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()

    println(counter)


}