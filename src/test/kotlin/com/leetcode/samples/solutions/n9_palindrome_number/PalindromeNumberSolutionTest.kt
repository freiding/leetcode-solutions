package com.leetcode.samples.solutions.n9_palindrome_number

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PalindromeNumberSolutionTest {

    private val instance: IPalindromeNumberSolution = PalindromeNumberReversingSolutionImpl()


    @Test
    fun test_valid_palindrome_number() {
        val num = 12321
        Assertions.assertTrue(instance.isPalindrome(num))
    }

    @Test
    fun test_none_palindrome_number() {
        val num = 12345
        Assertions.assertFalse(instance.isPalindrome(num))
    }

    @Test
    fun test_1() {
        val num = 10
        Assertions.assertFalse(instance.isPalindrome(num))
    }

    @Test
    fun test_2() {
        val num = -10
        Assertions.assertFalse(instance.isPalindrome(num))
    }


}