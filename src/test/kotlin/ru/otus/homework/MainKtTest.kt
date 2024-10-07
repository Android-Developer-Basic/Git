package ru.otus.homework

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MainKtTest {
    @Test
    fun `adds two numbers`() {
        assertEquals(4, add(2, 2))
    }

    @Test
    fun `subtracts two numbers`() {
        assertEquals(2, subtract(4, 2))
    }
}