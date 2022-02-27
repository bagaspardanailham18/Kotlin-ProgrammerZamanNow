package com.pzn.kotlin.oop.app

import com.pzn.kotlin.oop.data.Action

fun fireAction(action: Action) {
    action.action()
}

class SampleAction: Action {
    override fun action() {
        println("This is sample action")
    }
}

fun main() {
    fireAction(SampleAction())

    fireAction(object : Action {
        override fun action() = println("Action One")
    })
    fireAction(object : Action {
        override fun action() = println("Action Two")
    })
}