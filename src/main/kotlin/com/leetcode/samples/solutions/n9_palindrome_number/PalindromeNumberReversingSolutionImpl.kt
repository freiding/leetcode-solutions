package com.leetcode.samples.solutions.n9_palindrome_number

class PalindromeNumberReversingSolutionImpl: IPalindromeNumberSolution {
    override fun isPalindrome(x: Int): Boolean {
        var n = x //x will be safe
        var rem: Int
        var rev = 0
        while (n > 0) {
            rem = n % 10 //last digit of n is stored in rem
            rev = rev * 10 + rem //we are now adding the remainders one by one to our rev.
            n /= 10 //removing the last digit from n, as it had been already added to rev
            println("rem = $rem, rev = $rev n = $n")
        }
        return rev == x
    }
}