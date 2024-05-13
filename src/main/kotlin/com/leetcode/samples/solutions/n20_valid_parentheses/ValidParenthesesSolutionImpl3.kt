package com.leetcode.samples.solutions.n20_valid_parentheses

import java.util.*

// Author: https://leetcode.com/problems/valid-parentheses/solutions/3399077/easy-solutions-in-java-python-and-c-look-at-once-with-exaplanation/
class ValidParenthesesSolutionImpl3: IValidParenthesesSolution {

    override fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        for (c in s) {
            when (c) {
                '(' -> stack.push(')')
                '{' -> stack.push('}')
                '[' -> stack.push(']')
                else -> {
                    if (stack.isEmpty() || stack.pop() != c) {
                        return false
                    }
                }
            }
        }
        return stack.isEmpty()
    }
}