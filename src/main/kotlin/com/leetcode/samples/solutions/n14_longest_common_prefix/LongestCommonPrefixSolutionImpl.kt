package com.leetcode.samples.solutions.n14_longest_common_prefix

import java.util.Stack

class LongestCommonPrefixSolutionImpl: ILongestCommonPrefixSolution {

    override fun longestCommonPrefix(strs: Array<String>): String {
        var maxPrefixLength = 0;
        for (i in strs[0].indices) {
            val letter = strs[0][i];
            var matches = 1;
            for (j in 1 .. strs.lastIndex) {
                if (strs[j].lastIndex >= i && letter == strs[j][i]) {
                    ++matches;
                } else {
                    break;
                }
            }
            if (matches == strs.size) {++maxPrefixLength} else {break;}
        }
        return strs[0].substring(0,maxPrefixLength);
    }
}