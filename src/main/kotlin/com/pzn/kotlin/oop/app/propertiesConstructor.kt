package com.pzn.kotlin.oop.app

import com.pzn.kotlin.oop.data.User

fun main() {

    var user1 = User("eko", "rahasia")
    var user2 = User("bagas", "rahasia")

    user1.username = "bakti"
    user1.password = "Sangat Rahasia"

    println(user1.username)

}