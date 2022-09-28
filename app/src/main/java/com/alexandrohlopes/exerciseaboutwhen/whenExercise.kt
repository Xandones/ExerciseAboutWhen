package com.alexandrohlopes.exerciseaboutwhen

fun main() {
    val age : UByte  = 40u
    when(age) {
        in 0u..15u -> println("You are too young.")
        in 16u..17u -> println("You may drive now")
        in 18u..20u -> println("You may vote now")
        else -> println("Now you may drink in the US")
    }
}