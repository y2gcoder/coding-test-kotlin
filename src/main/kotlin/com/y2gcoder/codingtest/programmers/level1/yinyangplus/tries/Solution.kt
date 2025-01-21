package com.y2gcoder.codingtest.programmers.level1.yinyangplus.tries

/**
 * 음양 더하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/76501
 */
class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int =
        absolutes.mapIndexed { index, i -> if (signs[index]) i else -i }.sum()
}