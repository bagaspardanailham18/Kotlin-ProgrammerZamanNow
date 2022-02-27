package com.pzn.kotlin.intro

/*

- Perlu diketahui bahwa function di Kotlin adalah first-class citizens, artinya dianggag seperti tipe data yang lainnya

- Bisa disimpan di variable, array, bahkan ke parameter function itu sendiri
- Lambda Expression sederhananya adalah function yang tidak memiliki nama
- Lambda akan menganggap baris terakhir sebagai nilai return
- cocok untuk kasus sederhana dan tidak kompleks


 */

fun upper(value: String): String {
    return value.uppercase()
}

fun main() {

    val toUpper: (String) -> String = { value: String ->
        value.uppercase()
    }

    val toLower: (String) -> String = {
        it.lowercase()
    }

    val full: (String, String) -> String = { first: String, last: String ->
        val result = "$first $last"
        result
    }

    println(toUpper("bagas"))

    println(toLower("BAGAS"))

    println(full("Bagas", "Pardana"))


    // Method Reference / Function Reference
    // -> menjadikan function yang sudah ada menjadi lambda expression
    val toUpperCase: (String) -> String = ::upper

    println(toUpperCase("bakti"))
}