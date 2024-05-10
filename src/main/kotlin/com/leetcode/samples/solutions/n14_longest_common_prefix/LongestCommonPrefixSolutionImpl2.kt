package com.leetcode.samples.solutions.n14_longest_common_prefix

class LongestCommonPrefixSolutionImpl2: ILongestCommonPrefixSolution {

    override fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""
        else if (strs.size == 1) return strs[0]
        var max = strs[0].length
        for (j in 1 .. strs.lastIndex) {
            var right = 0
            if (strs[j].length < max) max = strs[j].length
            while (right < max && strs[0][right] == strs[j][right]) right++
            if (right < max) max = right
        }
        return strs[0].substring(0, max)
    }
}