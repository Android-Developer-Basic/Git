package ru.otus.homework

fun main() {
    println("Hello, World!")

    println("Add Result: ${add(2, 2)}")
    println("Subtract Result: ${subtract(4, 2)}")
}

fun add(a: Int, b: Int): Int {
    println("Adding $a and $b...")
    return a + b
}

fun subtract(a: Int, b: Int): Int {
    println("Subtracting $b from $a...")
    return a - b
}