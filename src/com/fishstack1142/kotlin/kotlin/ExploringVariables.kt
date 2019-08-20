package com.fishstack1142.kotlin.kotlin

import java.math.BigDecimal

fun main(args: Array<String>) {
    println("hello world")

    var name: String = "Name1"
    println(name)

    val surname = "Surname1"
    println(surname)

    name = "Name2"
    println(name)
//    surname = "Surname2"
    println(name + surname);

    println("Hello $name, long time no see $surname")
    println("Hello ${name.length}, ${surname.get(0)}")

    println("Hello world, the \$name is  ${name.toUpperCase()}  ${surname.toUpperCase()}")

    val testString =  """
            .awesome
            .baby
        """.trimMargin(".")

    println(testString)

    var myDouble = 21.4

    println(myDouble is Double)

    println(myDouble::class.qualifiedName)

    println(myDouble.javaClass)

    val myFloat : Float = 11.2f

    val bd : BigDecimal = BigDecimal(17)

    //Any in Kotlin is equal to Object in java

    var number: Int = 26

    println()


}