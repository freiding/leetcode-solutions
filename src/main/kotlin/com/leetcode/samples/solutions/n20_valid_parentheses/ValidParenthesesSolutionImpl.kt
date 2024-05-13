package com.leetcode.samples.solutions.n20_valid_parentheses

import java.util.*
import kotlin.math.abs

class ValidParenthesesSolutionImpl: IValidParenthesesSolution {

    override fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        for (c in s) {
            when (c) {
                '(' -> stack.push(c)
                '{' -> stack.push(c)
                '[' -> stack.push(c)
                else -> {
                    if (stack.isEmpty() || abs(stack.pop() - c) > 2) {
                        return false
                    }
                }
            }
        }
        return stack.isEmpty()
    }
}