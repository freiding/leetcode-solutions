package com.leetcode.samples.solutions.n2_add_two_numbers

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class AddTwoNumbersSolutionTest {

    private val solution: IAddTwoNumbersSolution = AddTwoNumbersSolutionImpl()

    @Test
    fun test() {
        val l1 = ListNode(2).apply {
            next = ListNode(4).apply {
                next = ListNode(3)
            }
        }
        val l2 = ListNode(5).apply {
            next = ListNode(6).apply {
                next = ListNode(4)
            }
        }

        val expectedResult = ListNode(7).apply {
            next = ListNode(0).apply {
                next = ListNode(8)
            }
        }

        val result = solution.addTwoNumbers(l1, l2)

        Assertions.assertEquals(expectedResult, result)
    }

    @Test
    fun test2() {
        val l1 = ListNode(0)
        val l2 = ListNode(0)

        val expectedResult = ListNode(0)
        val result = solution.addTwoNumbers(l1, l2)
        Assertions.assertEquals(expectedResult, result)
    }

    @Test
    fun test3() {
        val l1 = ListNode(9).apply {
            next = ListNode(9).apply {
                next = ListNode(9).apply {
                    next = ListNode(9).apply {
                        next = ListNode(9).apply {
                            next = ListNode(9).apply {
                                next = ListNode(9)
                            }
                        }
                    }
                }
            }
        }
        val l2 = ListNode(9).apply {
            next = ListNode(9).apply {
                next = ListNode(9).apply {
                    next = ListNode(9)
                }
            }
        }

        val expectedResult = ListNode(8).apply {
            next = ListNode(9).apply {
                next = ListNode(9).apply {
                    next = ListNode(9).apply {
                        next = ListNode(0).apply {
                            next = ListNode(0).apply {
                                next = ListNode(0).apply {
                                    next = ListNode(1)
                                }
                            }
                        }
                    }
                }
            }
        }

        val result = solution.addTwoNumbers(l1, l2)
        Assertions.assertEquals(expectedResult, result)
    }
}