package com.y2gcoder.codingtest.programmers.level1.sumbynumberofdivisors.tries

import kotlin.math.sqrt

/**
 * 약수의 개수와 덧셈
 * https://school.programmers.co.kr/learn/courses/30/lessons/77884
 */
class Solution {
    fun solution(left: Int, right: Int): Int {
        return (left..right).sumOf { if (isSquareNumber(it)) -it else it }
    }

    private fun isSquareNumber(i: Int): Boolean {
        return sqrt(i.toDouble()) % 1 == 0.0
    }
}