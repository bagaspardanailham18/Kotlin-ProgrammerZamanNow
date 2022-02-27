package com.pzn.kotlin.oop.app

import com.pzn.kotlin.oop.data.BigNote
import com.pzn.kotlin.oop.data.Note

fun main() {
    val note = Note("Belajar Kotlin")
    println(note.title)

    note.title = ""
    println(note.title)

    val bigNote = BigNote("Belajar Kotlin")
    println(bigNote.title)
    println(bigNote.bigTitle)
}