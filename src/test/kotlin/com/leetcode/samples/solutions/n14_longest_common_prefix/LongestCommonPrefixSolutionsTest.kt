package com.leetcode.samples.solutions.n14_longest_common_prefix

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class LongestCommonPrefixSolutionsTest {

    private val instance: ILongestCommonPrefixSolution = LongestCommonPrefixSolutionImpl3()

    @Test
    fun case_1_test() {
        val actualResult = instance.longestCommonPrefix(arrayOf("flower","flow","flight"))
        val expectedResult = "fl"
        Assertions.assertEquals(expectedResult, actualResult)
    }
    @Test
    fun case_2_test() {
        val actualResult = instance.longestCommonPrefix(arrayOf("dog","racecar","car"))
        val expectedResult = ""
        Assertions.assertEquals(expectedResult, actualResult)
    }
    @Test
    fun case_3_test() {
        val actualResult = instance.longestCommonPrefix(arrayOf(""))
        val expectedResult = ""
        Assertions.assertEquals(expectedResult, actualResult)
    }

    @Test
    fun case_27_test() {
        val actualResult = instance.longestCommonPrefix(arrayOf("a"))
        val expectedResult = "a"
        Assertions.assertEquals(expectedResult, actualResult)
    }

    @Test
    fun case_28_test() {
        val actualResult = instance.longestCommonPrefix(arrayOf("flower", "flower", "flower", "flower"))
        val expectedResult = "flower"
        Assertions.assertEquals(expectedResult, actualResult)
    }

    @Test
    fun case_33_test() {
        val actualResult = instance.longestCommonPrefix(arrayOf("c", "ac", "ccc"))
        val expectedResult = ""
        Assertions.assertEquals(expectedResult, actualResult)
    }

    @Test
    fun case_80_test() {
        val actualResult = instance.longestCommonPrefix(arrayOf("ab","a",))
        val expectedResult = "a"
        Assertions.assertEquals(expectedResult, actualResult)
    }
}