package com.y2gcoder.codingtest.programmers.level1.removesmallestnumber.tries

/**
 * 제일 작은 수 제거하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12935
 */
class Solution {
    fun solution(arr: IntArray): IntArray {
        val min = arr.minOrNull()!!
        val result = arr.filterNot { it == min }
        return if (result.isNotEmpty()) result.toIntArray() else intArrayOf(-1)
    }
}