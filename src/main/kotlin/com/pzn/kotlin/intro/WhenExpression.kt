package com.pzn.kotlin.intro

fun main() {
    val finalExam = "A"

    when(finalExam) {
        "A", "B" -> println("Amazing")
        "C" -> println("Good")
        "D" -> {
            println("Bad")
        }
        else -> println("Worst")
    }

//    When Expresion In

    val passValue = arrayOf("A", "B")

    when(finalExam) {
        in passValue -> println("Lulus")
        !in passValue -> println("Tidak Lulus")
    }

//    When Expression Is

    val name = "Eko"

    when(name) {
        is String -> println("Name is String")
        !is String -> println("Name is not String")
    }

//    When Expression with more flexible like if statement

    val nilaiUjian = 90

    when {
        nilaiUjian > 90 -> println("Amazing")
        nilaiUjian > 80 -> println("Good Job")
    }
}