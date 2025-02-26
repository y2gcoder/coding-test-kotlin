package com.y2gcoder.codingtest.programmers.level1.year2016.tries

/**
 * 2016년
 * https://school.programmers.co.kr/learn/courses/30/lessons/12901?language=kotlin
 * 참고: https://m.blog.naver.com/yhc33758/222922768282
 */
class Solution {
    fun solution(a: Int, b: Int): String {
        var first = (16 / 4) + 16
        if (a == 1 || a == 2) {
            first--
        }
        first += 6
        first += b

        first += PLUS_NUMBER_PER_MONTH[a]

        return DAYS[first % 7]
    }

    companion object {
        private val DAYS = listOf("SAT", "SUN", "MON", "TUE", "WED", "THU", "FRI")
        private val PLUS_NUMBER_PER_MONTH = listOf(0, 1, 4, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6)
    }
}