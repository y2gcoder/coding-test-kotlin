package com.y2gcoder.codingtest.programmers.level1.sortingstringbydescendingorder.tries

/**
 * 문자열 내림차순으로 배치하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12917
 */
class Solution {
    fun solution(s: String): String =
        s.toCharArray()
            .sortedDescending()
            .joinToString("")
}