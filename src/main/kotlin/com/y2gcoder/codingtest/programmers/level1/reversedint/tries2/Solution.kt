package com.y2gcoder.codingtest.programmers.level1.reversedint.tries2

import kotlin.math.pow
import kotlin.math.sqrt

/**
 * 정수 제곱근 판별
 * https://school.programmers.co.kr/learn/courses/30/lessons/12934
 * 다른 풀이: 제곱근을 1로 나눈 나머지가 0이면 정수 제곱근인가!?
 */
class Solution {
    fun solution(n: Long): Long {
        val sqrt = sqrt(n.toDouble())

        return when {
            sqrt % 1.0 == 0.0 -> (sqrt + 1).pow(2.0).toLong()
            else -> -1
        }
    }
}