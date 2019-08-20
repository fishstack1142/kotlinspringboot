package com.fishstack1142.kotlin.kotlin

fun main(args: Array<String>) {

    var name1: String? = null

//    name1 = "in the end"

    if (name1 != null) {
        name1 = name1.toUpperCase()
        println(name1)
    } else {
//        println("this is null")
        name1 =  null
    }

    // or you may use ?
    println(name1?.toUpperCase())

    println(name1!!.toUpperCase())


}