package com.pzn.kotlin.oop.app

import com.pzn.kotlin.oop.data.ExecutiveCustomer
import com.pzn.kotlin.oop.data.PremiumCustomer

fun main() {
    val premiumCustomer = PremiumCustomer("Eko")
    println(premiumCustomer.name)

    val executiveCustomer = ExecutiveCustomer("Eko", 1_000_000_000)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)
}