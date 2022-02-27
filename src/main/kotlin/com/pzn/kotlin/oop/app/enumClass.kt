package com.pzn.kotlin.oop.app

import com.pzn.kotlin.oop.data.Gender

/**
 * Enum Class digunakan untuk data yang nilainya sudah pasti atau tidak akan berubah. Seperti gender
 */

fun main() {
    val male = Gender.MALE
    val female = Gender.FEMALE
    val allGender: Array<Gender> = Gender.values()

    val manFromGender = Gender.valueOf("MALE")
    val womanFromGender = Gender.valueOf("FEMALE")

    println(male)
    println(female)
    println(allGender.toList())
    println(manFromGender)

    male.showDescription()
}