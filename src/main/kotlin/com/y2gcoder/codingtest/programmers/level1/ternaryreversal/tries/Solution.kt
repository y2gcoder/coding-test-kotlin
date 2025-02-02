package com.y2gcoder.codingtest.programmers.level1.ternaryreversal.tries

/**
 * 3진법 뒤집기
 * https://school.programmers.co.kr/learn/courses/30/lessons/68935
 */
class Solution {
    fun solution(n: Int): Int = n.toString(3).reversed().toInt(3)
}