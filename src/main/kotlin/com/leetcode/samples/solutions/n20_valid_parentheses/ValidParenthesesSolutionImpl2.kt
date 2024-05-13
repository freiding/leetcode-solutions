package com.leetcode.samples.solutions.n20_valid_parentheses

import java.util.*

class ValidParenthesesSolutionImpl2: IValidParenthesesSolution {

    override fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        for (c in s) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c)
            } else if (!stack.isEmpty()){
                val prev = stack.pop()
                println("c = $c ASCII = ${c.code} | prev = $prev ASCII = ${prev.code}")
                when (c) {
                    ')' -> {if (prev != '(') return false}
                    ']' -> {if (prev != '[') return false}
                    '}' -> {if (prev != '{') return false}
                }
            } else {
                return false
            }
        }
        return stack.isEmpty()
    }
}