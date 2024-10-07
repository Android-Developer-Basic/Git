package ru.otus.homework

fun main() {
    println("Hello, World!")

    println("Result: ${add(2, 2)}")
}

fun add(a: Int, b: Int): Int {
    println("Adding $a and $b...")
    return a + b
}