package com.pzn.kotlin.oop.app

import com.pzn.kotlin.oop.data.Game
import com.pzn.kotlin.oop.data.Login
import com.pzn.kotlin.oop.data.MinMax

/**
 * Destructuring declaration adalah membuat multiple variables dari sebuah object
 * Destructuring tidak bisa dilakukan untuk semua object, hanya objek yang memiliki function componentX() yang bisa dilakukan destructuring
 * Saat kita membuat data class, secara otomatis akan dibuatkan function componentX() sesuai dengan jumlah parameter nya
 */

/**
 * Destructuring declarations juga bisa dilakukan ketika memanggil function
 * Dengan ini, seakan-akan kita bisa mengembalikan multiple return value pada function
 */

fun minmax(value1: Int, value2: Int): MinMax {
    return when {
        value1 > value2 -> MinMax(value2, value1)
        else -> MinMax(value1, value2)
    }
}

/**
 * Destructuring juga bisa dilakukan di lambda parameter
 * Hal ini bisa mempermudah kita saat ingin mengakses data yang ada di parameter
 */

fun login(login: Login, callback: (Login) -> Boolean): Boolean {
    return callback(login)
}

fun main() {
    val game = Game("Game Kotlin", 100000)
//    val name = game.name
//    val price = game.price

    val (name, price) = game

    println(name)
    println(price)

//    val result = minmax(10, 100)
//    val min = result.min
//    val max = result.max


//    val (min, _) = minmax(10, 100) gunakan "_" jika tidak ingin dipakai
    val (min, max) = minmax(10, 100)

    println(min)
    println(max)

    val login = Login("Bagas", "rahasia")
//    login(login){ login ->
//        login.username == "Bagas" && login.password == "rahasia"
//    }
    login(login){ (username, password) ->
        username == "Bagas" && password == "rahasia"
    }

}