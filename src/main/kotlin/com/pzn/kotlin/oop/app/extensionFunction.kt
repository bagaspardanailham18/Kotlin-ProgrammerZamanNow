package com.pzn.kotlin.oop.app

import com.pzn.kotlin.oop.data.Student
import com.pzn.kotlin.oop.data.sayHello
import com.pzn.kotlin.oop.data.uppername

fun main() {
    val student: Student? = Student("Bagas", 20)
    student.sayHello("Budi")

    println(student?.uppername)
}