package com.leetcode.samples.solutions.n20_valid_parentheses

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ValidParenthesesSolutionTest {

    private val solution: IValidParenthesesSolution = ValidParenthesesSolutionImpl()

    @Test
    fun case_1() {
        val source = "()"
        val actualResult = solution.isValid(source)
        Assertions.assertEquals(true, actualResult)
    }

    @Test
    fun case_2() {
        val source = "()[]{}"
        val actualResult = solution.isValid(source)
        Assertions.assertEquals(true, actualResult)
    }

    @Test
    fun case_3() {
        val source = "(]"
        val actualResult = solution.isValid(source)
        Assertions.assertEquals(false, actualResult)
    }

    @Test
    fun case_6() {
        val source = "]"
        val actualResult = solution.isValid(source)
        Assertions.assertEquals(false, actualResult)
    }
}