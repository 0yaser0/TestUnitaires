package com.example.testunitaires.exercice_3

import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.*
import org.junit.Test

class CalculTest {
    private val calcul = Calcul()
    @Test
    fun testCalculAdd() {
        assertEquals(5, calcul.calculAdd(2, 3))
        assertThat(calcul.calculAdd(1, 2), `is`(3))
    }
    @Test
    fun testCalculSub() {
        assertEquals(2, calcul.calculSub(5, 3))
        assertThat(calcul.calculSub(10, 5), `is`(5))
    }
    @Test
    fun testCalculDiv() {
        assertEquals(2, calcul.calculDiv(6, 3))
        assertThat(calcul.calculDiv(9, 3), `is`(3))
    }
    @Test(expected = ArithmeticException::class)
    fun testCalculDivByZero() {
        calcul.calculDiv(5, 0)
    }
    @Test
    fun testCalculMultiple() {
        assertEquals(6, calcul.calculMultiple(2, 3))
        assertThat(calcul.calculMultiple(4, 5), `is`(20))
    }
}
