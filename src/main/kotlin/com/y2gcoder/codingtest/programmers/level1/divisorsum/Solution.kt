package com.y2gcoder.codingtest.programmers.level1.divisorsum

/**
 * 약수의 합
 * https://school.programmers.co.kr/learn/courses/30/lessons/12928
 */
class Solution {
    fun solution(n: Int): Int {
        var answer = 0

        if (n == 0) {
            return answer
        }

        for (i in 1..n) {
            if (n % i == 0) {
                answer += i
            }
        }

        return answer
    }
}