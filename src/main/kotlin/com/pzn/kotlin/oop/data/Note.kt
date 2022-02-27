package com.pzn.kotlin.oop.data

class Note(title: String) {

    var title: String = title
        get() {
            println("Call getter function")
            return field // field is refers to title
        }
        set(value) {
            println("Call setter function")
            if (value.isNotBlank()) {
                field = value
            } else {
                println("Value is invalid")
            }
        }

}


class BigNote(val title: String) {
    val bigTitle: String
    get() = title.uppercase()
}