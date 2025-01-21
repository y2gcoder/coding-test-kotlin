package com.y2gcoder.codingtest.programmers.level1.dotproduct.tries2

/**
 * 내적
 * https://school.programmers.co.kr/learn/courses/30/lessons/70128
 * 다른 풀이: zip을 쓸 수 있구나...
 */
class Solution {
    fun solution(a: IntArray, b: IntArray): Int =
        a.zip(b).sumOf { it.first * it.second }
}