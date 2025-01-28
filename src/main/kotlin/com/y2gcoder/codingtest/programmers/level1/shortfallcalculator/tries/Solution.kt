package com.y2gcoder.codingtest.programmers.level1.shortfallcalculator.tries

/**
 * 부족한 금액 계산하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/82612
 */
class Solution {
    fun solution(price: Int, money: Int, count: Int): Long =
        (1..count.toLong())
            .sumOf { it * price }
            .let { if (it > money) it - money else 0 }
}