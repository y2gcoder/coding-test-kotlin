package com.y2gcoder.codingtest.programmers.level1.harshadnumber.tries

/**
 * 하샤드 수
 * https://school.programmers.co.kr/learn/courses/30/lessons/12947
 */
class Solution {
    fun solution(x: Int): Boolean {
        val sum = x.toString().sumOf { c -> c.digitToInt() }
        return x % sum == 0
    }
}