package com.pzn.kotlin.oop.app

import com.pzn.kotlin.oop.data.Student

fun main() {
    val student = Student("Bagas", 20)
//    println(student.name)
//    println(student.age)

    /** LET FUNCTION **/

    student.let {
        println(it.name)
        println(it.age)
    }

    val result = student.let {
        "Name ${it.name}, Age ${it.age}"
    }

    /** RUN FUNCTION **/

    val result2 = student.run {
        "Name ${this.name}, Age ${this.age}"
    }

    /** APPLY FUNCTION **/
    val result3: Student = student.apply {
        "Name ${this.name}, Age ${this.age}"
    }

    /** ALSO FUNCTION **/
    val result4: Student = student.also {
        "Name ${it.name}, Age ${it.age}"
    }

    val result5 = with(student) {
        "Name ${this.name}, Age ${this.age}"
    }

    println(result)
    println(result3)
    println(result4)
    println(result5)
}