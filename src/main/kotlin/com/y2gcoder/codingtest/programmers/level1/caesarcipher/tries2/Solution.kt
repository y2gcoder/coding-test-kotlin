package com.y2gcoder.codingtest.programmers.level1.caesarcipher.tries2

/**
 * 시저 암호
 * https://school.programmers.co.kr/learn/courses/30/lessons/12926
 * 다른 아이디어: 나머지를 잘 이용해보자! Char 와 Int 가 서로 연산할 수 있구나...
 */
class Solution {
    fun solution(s: String, n: Int): String =
        s.map {
            when {
                it.isLowerCase() -> 'a' + (it + n - 'a') % 26
                it.isUpperCase() -> 'A' + (it + n - 'A') % 26
                else -> it
            }
        }.joinToString("")
}