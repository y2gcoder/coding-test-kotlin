package com.y2gcoder.codingtest.programmers.level1.evenodd.tries

/**
 * 짝수와 홀수
 * https://school.programmers.co.kr/learn/courses/30/lessons/12937
 */
class Solution {
    fun solution(num: Int): String = if (num % 2 == 0) "Even" else "Odd"
}