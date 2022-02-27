package com.pzn.kotlin.oop.data

interface Base {
    fun sayHello(name: String)
    fun sayGoodbye(name: String)
}

class MyBase : Base {
    override fun sayHello(name: String) {
        println("Hello $name")
    }

    override fun sayGoodbye(name: String) {
        println("Goodbye $name")
    }
}

/**
 * DELEGATION OTOMATIS
 * - dengan menggunakan delegation otomatis (by), maka secara otomatis seluruhnya akan didelegasikan
 * - jika tidak ingin seluruhnya didelegasikan (sebagian), maka perlu di override yang tidak ingin dedelegasikan nya
  */


class MyBaseDelegate(val base: Base) : Base by base


// DELEGATION MANUAL

//class MyBaseDelegate(val base: Base) : Base {
//    override fun sayHello(name: String) {
//        base.sayHello(name)
//    }
//
//    override fun sayGoodbye(name: String) {
//        base.sayGoodbye(name)
//    }
//}
