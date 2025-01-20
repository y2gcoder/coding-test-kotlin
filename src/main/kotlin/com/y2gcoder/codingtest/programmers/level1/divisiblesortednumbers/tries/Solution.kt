package com.y2gcoder.codingtest.programmers.level1.divisiblesortednumbers.tries

/**
 * 나누어 떨어지는 숫자 배열
 * https://school.programmers.co.kr/learn/courses/30/lessons/12910
 */
class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        val result = arr.filter { it % divisor == 0 }.sorted()
        return when {
            result.isEmpty() -> intArrayOf(-1)
            else -> result.toIntArray()
        }
    }
}