package com.y2gcoder.codingtest.programmers.level1.year2016.tries2

/**
 * 2016년
 * https://school.programmers.co.kr/learn/courses/30/lessons/12901?language=kotlin
 * 정석으로 풀어보자!
 * 1월 1일 넣었을 때 금요일이 나오는 순서대로 요일 배열 순서를 정해놓고, 누적 일을 다 더해서 7로 나누자!
 */
class Solution {
    fun solution(a: Int, b: Int): String {
        val days = (1 until a).map { when (it) {
            1, 3, 5, 7, 8, 10, 12 -> 31
            2 -> 29
            else -> 30
        } }.sum() + b

        return DAYS[days % 7]
    }

    companion object {
        private val DAYS = listOf("THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED")
    }
}