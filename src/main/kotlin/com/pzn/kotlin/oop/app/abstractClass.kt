package com.pzn.kotlin.oop.app

import com.pzn.kotlin.oop.data.City
import com.pzn.kotlin.oop.data.Country

fun main() {
    val city = City("Sumedang")
    val country = Country("Indonesia")

    println(city.name)
    println(country.name)
}