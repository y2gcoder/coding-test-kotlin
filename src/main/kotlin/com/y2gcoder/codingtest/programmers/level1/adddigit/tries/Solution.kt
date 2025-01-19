package com.y2gcoder.codingtest.programmers.level1.adddigit.tries

/**
 * 자릿수 더하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12931
 */
class Solution {
    fun solution(n: Int): Int {
        var result = 0
        var temp: Int = n

        while (temp > 0) {
            result += temp % 10
            temp /= 10
        }

        return result
    }
}