package com.leetcode.samples.solutions.n14_longest_common_prefix

import java.util.*

class LongestCommonPrefixSolutionImpl3: ILongestCommonPrefixSolution {

    override fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""
        else if (strs.size == 1) return strs[0]
        Arrays.sort(strs)
        var idx = 0
        while (idx < strs[0].length && idx < strs[1].length && strs[0][idx] == strs[1][idx]) idx++
        return strs[0].substring(0, idx)
    }
}