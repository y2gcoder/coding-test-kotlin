package com.y2gcoder.codingtest.programmers.level1.numericstringsandenglishwords.tries

/**
 * 숫자 문자열과 영단어
 * https://school.programmers.co.kr/learn/courses/30/lessons/81301
 * 아이디어: map으로 만들고 순회하면서 replace
 * 다른 아이디어: 그냥 바로 문자열.replace()를 체이닝 10번 해도 된다!
 */
class Solution {
    fun solution(s: String): Int {
        var answer = s
        for ((k, v) in NUMERIC_STRING_MAP) {
            answer = answer.replace(k, v)
        }
        return answer.toInt()
    }

    companion object {
        private val NUMERIC_STRING_MAP = mapOf(
            "zero" to "0",
            "one" to "1",
            "two" to "2",
            "three" to "3",
            "four" to "4",
            "five" to "5",
            "six" to "6",
            "seven" to "7",
            "eight" to "8",
            "nine" to "9",
        )
    }
}