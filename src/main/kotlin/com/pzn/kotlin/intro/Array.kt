package com.pzn.kotlin.intro

fun main() {

    val names: Array<String> = arrayOf("Bagas", "Bakti", "Bintang")

    println(names.size)
    println(names[0])
    println(names.get(1))

    names.set(1, "Hilda")
    names[2] = "Anissa"


    val members: Array<String?> = arrayOfNulls(3)
    members[0] = "Alif"
    members[1] = null
    members[2] = "Daniel"
    println("Member's size = ${members.size}")

    println("==============================")


    for (name in names) {
        println(name)
    }

    for (member in members) {
        println(member)
    }

}