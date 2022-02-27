package com.pzn.kotlin.oop.app

import com.pzn.kotlin.oop.exception.ValidationException

fun validateAndSayHello(name: String) {
    if (name.isBlank()) {
        throw ValidationException("Name is blank")
    } else {
        println("Hello $name")
    }
}

fun main() {

    /**
     * Try -> mencoba melakukan eksekusi program yang mungkin terjadi error
     * Catch -> Menangkap error
     * Finallu -> Eksekusi program baik try catch nya berhasil atau error
     */
    try {
        validateAndSayHello("Bagas")
        validateAndSayHello("") // ERROR
        println("Program") // Tidak akan dieksekusi karena program akan berhenti dibagian yang error
    } catch (error: ValidationException) {
        println("Terjadi Error ${error.message}")
    } catch (error: Throwable) {
        println("Terjadi Error ${error.message}")
    } finally {
        println("Program Selesai") // Akan selelau dieksekusi
    }
}