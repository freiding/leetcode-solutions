package com.leetcode.samples.solutions.n9_palindrome_number

class PalindromeNumberSolutionImpl: IPalindromeNumberSolution {
    override fun isPalindrome(x: Int): Boolean {
        val str = x.toString();
        var i = 0
        var j = str.lastIndex;
        while (i < j) {
            if (str[i] != str[j]) return false;
            ++i
            --j
        }
        return true
    }
}