package com.y2gcoder.codingtest.programmers.level1.nearestletter.tries

/**
 * 가장 가까운 같은 글자
 * https://school.programmers.co.kr/learn/courses/30/lessons/142086
 * 2025-01-06
 */
class Solution {
    fun solution(s: String): List<Int> {
        val answer: MutableList<Int> = mutableListOf()

        val chars = s.toCharArray().toList()

        for ((index, char) in chars.withIndex()) {
            val findLastIndex = s.lastIndexOf(char, index - 1)
            if (findLastIndex == -1) {
                answer.add(findLastIndex)
            } else {
                answer.add(index - findLastIndex)
            }

        }

        return answer.toList()
    }
}
