package com.y2gcoder.codingtest.programmers.level1.basicstring.tries

/**
 * 문자열 다루기 기본
 * https://school.programmers.co.kr/learn/courses/30/lessons/12918
 * 다른 아이디어: 해당 문자열을 숫자로 만들 수 있는지로 체크할 수도 있을듯?
 */
class Solution {
    fun solution(s: String): Boolean {
        return (s.length == 4 || s.length == 6) && s.toCharArray().all { it.isDigit() }
    }
}