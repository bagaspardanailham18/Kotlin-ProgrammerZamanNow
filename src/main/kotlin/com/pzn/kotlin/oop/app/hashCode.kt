package com.pzn.kotlin.oop.app

import com.pzn.kotlin.oop.data.Company

fun main() {
    val company1 = Company("Eko")
    val company2 = Company("Eko")

    println(company1.hashCode())
    println(company2.hashCode())
    println(company1.hashCode() == company2.hashCode())
}