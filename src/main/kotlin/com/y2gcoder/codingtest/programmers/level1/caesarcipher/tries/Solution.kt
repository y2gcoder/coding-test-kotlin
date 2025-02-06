package com.y2gcoder.codingtest.programmers.level1.caesarcipher.tries

/**
 * 시저 암호
 * https://school.programmers.co.kr/learn/courses/30/lessons/12926
 * 다른 아이디어: 숫자를 잘 구할 수 있나봐!!
 */
class Solution {
    fun solution(s: String, n: Int): String =
        s.map {
            when {
                it.isLowerCase() -> (lowercaseRange + lowercaseRange)[lowercaseRange.indexOf(it) + n]
                it.isUpperCase() -> (uppercaseRange + uppercaseRange)[uppercaseRange.indexOf(it) + n]
                else -> it
            }
        }.joinToString("")

    companion object {
        private val lowercaseRange = ('a'..'z')
        private val uppercaseRange = ('A'..'Z')
    }
}