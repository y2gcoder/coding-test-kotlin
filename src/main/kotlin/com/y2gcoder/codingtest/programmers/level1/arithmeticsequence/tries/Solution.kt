package com.y2gcoder.codingtest.programmers.level1.arithmeticsequence.tries

/**
 * x만큼 간격이 있는 n개의 숫자
 * https://school.programmers.co.kr/learn/courses/30/lessons/12954
 */
class Solution {
    fun solution(x: Int, n: Int): LongArray = (1..n).map { x * it.toLong() }.toLongArray()
}