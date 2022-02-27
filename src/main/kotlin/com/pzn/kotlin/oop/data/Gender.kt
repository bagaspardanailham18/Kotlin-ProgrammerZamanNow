package com.pzn.kotlin.oop.data

enum class Gender(val description: String) {
    MALE("Male"),
    FEMALE("Female");

    fun showDescription() {
        println(description)
    }
}