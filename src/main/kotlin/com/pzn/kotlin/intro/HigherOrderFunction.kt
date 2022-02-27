package com.pzn.kotlin.intro

/*

Higher Order Function

-> is a function that using function as parameter or return function

 */



fun main() {

    fun hello(name: String, transformer: (String) -> String): String {
        return transformer(name)
    }

    val upperTransformer = { value: String -> value.uppercase() }
    val lowerTransformer = { value: String -> value.lowercase() }

    println(hello("bagas", upperTransformer))
    println(hello("BAKTI", lowerTransformer))

    // OR

    println(hello("MAMAN", { value: String -> value.lowercase() }))


    // Recommend to use Trailing Lambda

    val result1 = hello("hilda") { value: String ->
        value.uppercase()
    }

    println(result1)
}