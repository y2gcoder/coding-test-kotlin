package com.y2gcoder.codingtest.programmers.level1.templarsweapon.tries

import kotlin.math.sqrt

/**
 * 기사단원의 무기
 * https://school.programmers.co.kr/learn/courses/30/lessons/136798
 * 약수를 구하는 방식: 제곱근 사용
 */
class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        return (1..number).map { getDivisorCount(it) }.sumOf { if (it > limit) power else it }
    }

    private fun getDivisorCount(target: Int): Int {
        var result = 0
        for (i in 1..sqrt(target.toDouble()).toInt()) {
            if (i * i == target) {
                result++
            } else if (target % i == 0) {
                result += 2
            }
        }
        return result
    }
}