package com.pzn.kotlin.intro

/*

Anonymous Function

-> Mirip dengan Lambda Expression
-> Cocok untuk masalah yang kompleks

 */

fun main() {

    fun hello(name: String, transformer: (String) -> String): String {
        return transformer(name)
    }

    val lower = fun(value: String): String {
        if (value == "") {
            return "UPS"
        } else {
            return value.lowercase()
        }
    }

    println(hello("BAGAS", lower))

}