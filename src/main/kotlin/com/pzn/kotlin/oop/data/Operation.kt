package com.pzn.kotlin.oop.data

/**
 * Sealed Class
 *
 * - merupakan jenis class yang didesain untuk inheritance
 * - tidak bisa diinstansiasi menjadi objek, dan secara standar sealed class merupan abstract class
 * - cocok digunakan sebagai class parent
 *
 * - Sealed class sangat berguna saat kita menggunakan when expression
 * - dengan menggunakan sealed class, kita bisa membatasi class turunannya yang perlu dicheck
 */

sealed class Operation(val name: String)

class Plus: Operation("Plus")
class Minus: Operation("Minus")
class Modulo: Operation("Modulo")