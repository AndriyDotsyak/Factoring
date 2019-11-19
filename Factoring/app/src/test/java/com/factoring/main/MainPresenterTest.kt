package com.factoring.main

import com.factoring.screen.main.MainActivity
import com.factoring.screen.main.MainPresenter
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import kotlin.math.sqrt

class MainPresenterTest {

    private lateinit var mainView: MainActivity
    private lateinit var mainPresenter: MainPresenter

    @Before
    fun init() {
        mainView = MainActivity()
        mainPresenter = MainPresenter(mainView)
    }

    @Test
    fun factorTestOne() {
        assertEquals(listOf(3, 3, 5), mainPresenter.factor(45))
    }

    @Test
    fun factorTestTwo() {
        assertEquals(listOf(3), mainPresenter.factor(3))
    }

    @Test
    fun factorTestThree() {
        assertEquals(listOf(2, 3, 5, 7), mainPresenter.factor(210))
    }

    @Test
    fun factorTestDividerZero() {
        assertEquals(listOf(0), mainPresenter.factor(0))
    }

    @Test
    fun factorTestDividerOne() {
        assertEquals(listOf(1), mainPresenter.factor(1))
    }

    @Test(timeout = 1000)
    fun factorTestProductivityAlgorithm() {
        val numberFactoring = 12468280

        val algorithmComplexity = sqrt(numberFactoring.toDouble()).toInt()
        println("Algorithm Complexity = $algorithmComplexity")

        assertEquals(listOf(2, 2, 2, 5, 11, 43, 659), mainPresenter.factor(numberFactoring))
    }
}