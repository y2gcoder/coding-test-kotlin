package com.y2gcoder.codingtest.programmers.level1.coke.tries

/**
 * 콜라 문제
 * https://school.programmers.co.kr/learn/courses/30/lessons/132267
 */
class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        val answer: Int = getAdditionalCoke(0, n, a, b)
        return answer
    }

    private tailrec fun getAdditionalCoke(x: Int, empty: Int, unit: Int, provide: Int): Int {
        if (empty / unit == 0) {
            return x
        }
        val newBottle = (empty / unit) * provide
        val newEmpty: Int = newBottle + (empty % unit)
        return getAdditionalCoke(x + newBottle, newEmpty, unit, provide)
    }
}