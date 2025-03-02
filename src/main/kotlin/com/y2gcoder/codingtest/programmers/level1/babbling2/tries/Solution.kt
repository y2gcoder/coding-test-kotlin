package com.y2gcoder.codingtest.programmers.level1.babbling2.tries

/**
 * 옹알이 (2)
 * https://school.programmers.co.kr/learn/courses/30/lessons/133499
 */
class Solution {
    fun solution(babbling: Array<String>): Int {
        val results = mutableListOf<String>()
        for (b in babbling) {
            var result = b
            for (c in CANNOT_BABBLING) {
                result = result.replace(c, "X")
            }
            for (c in CAN_BABBLING) {
                result = result.replace(c, " ")
            }
            results.add(result)
        }

        return results.count { it.isBlank() }
    }

    companion object {
        private val CAN_BABBLING = listOf( "aya", "ye", "woo", "ma")
        private val CANNOT_BABBLING = listOf( "ayaaya", "yeye", "woowoo", "mama")
    }
}
