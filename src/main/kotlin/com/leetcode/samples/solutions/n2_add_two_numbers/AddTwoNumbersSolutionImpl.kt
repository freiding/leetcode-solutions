package com.leetcode.samples.solutions.n2_add_two_numbers


class AddTwoNumbersSolutionImpl: IAddTwoNumbersSolution {

    override fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {

        val v = (l1?.`val` ?: 0) + (l2?.`val` ?: 0)
        var nextInc = 0
        val value = if (v >= 10) {
            nextInc = 1
            v % 10
        } else {
            v
        }

        val node = ListNode(value)

        if (nextInc > 0 || l1?.next != null  || l2?.next != null) {
            val l1node = if (nextInc > 0) {
                val n = l1?.next ?: ListNode(0)
                n.`val` += nextInc
                n
            } else {
                l1?.next
            }

            val l2node = l2?.next

            val nextNode = addTwoNumbers(l1node, l2node)
            node.next = nextNode
        }

        return node
    }

}