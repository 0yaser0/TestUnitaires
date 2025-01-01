package com.example.testunitaires.exercice_1

import org.junit.Assert.*
import org.junit.Test

class CalculTest {

    private val calcul = CalculTDD()

    @Test
    fun testCalculAdd() {
        assertEquals(8, calcul.calculAdd(5, 3))
    }

    @Test
    fun testCalculSub() {
        assertEquals(6, calcul.calculSub(10, 4))
    }

    @Test
    fun testCalculDiv() {
        assertEquals(4, calcul.calculDiv(12, 3))
    }

    @Test(expected = ArithmeticException::class)
    fun testCalculDivByZero() {
        calcul.calculDiv(5, 0)
    }

    @Test
    fun testCalculMultiple() {
        val result = calcul.calculMultiple(7, 6)
        assertEquals(42, result)
    }
}
