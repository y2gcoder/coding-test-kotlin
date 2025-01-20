package com.y2gcoder.codingtest.programmers.level1.reversedint.tries

/**
 * 정수 내림차순으로 배치하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12933
 */
class Solution {
    fun solution(n: Long): Long =
        n.toString().toCharArray().sortedDescending().joinToString(separator = "").toLong()
}