package ru.otus.homework

fun main() {
    println("Hello, World!")

    println("Add Result: ${add(2, 2)}")
    println("Subtract Result: ${subtract(4, 2)}")
    println("Multiply Result: ${multiply(2, 2)}")
}

fun add(a: Int, b: Int): Int {
    println("Adding $a and $b...")
    return a + b + b
}

fun subtract(a: Int, b: Int): Int {
    println("Subtracting $b from $a...")
    return a - b
}

fun multiply(a: Int, b: Int): Int {
    println("Multiplying $a and $b...")
    return a * b
}