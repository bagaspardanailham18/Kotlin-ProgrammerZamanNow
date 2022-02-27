package com.pzn.kotlin.intro

fun main() {
//    val bio: String = """
//        >Bagas Pardana Ilham,
//        >21 tahun,
//        >swim
//    """.trimIndent()

    val bio: String = """
        >Bagas Pardana Ilham,
        >21 tahun,
        >swim
    """.trimMargin(">")

    println(bio)
}