package com.pzn.kotlin.oop.app

import com.pzn.kotlin.oop.data.SuperTeacher
import com.pzn.kotlin.oop.data.Teacher

fun main() {
    val teacher = Teacher("Bagas")
    println(teacher.name)

    val superTeacher = SuperTeacher("Eko")
    superTeacher.test()
}