package com.y2gcoder.codingtest.programmers.level1.strangecharacterscreator.tries

/**
 * 이상한 문자 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12930
 */
class Solution {
    fun solution(s: String): String {
        return s.split(" ").joinToString(" ") {
            it.mapIndexed { index, ch -> if (index % 2 == 0) ch.uppercase() else ch.lowercase() }.joinToString("")
        }
    }
}
