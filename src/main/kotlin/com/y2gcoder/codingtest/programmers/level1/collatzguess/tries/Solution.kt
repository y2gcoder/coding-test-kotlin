package com.y2gcoder.codingtest.programmers.level1.collatzguess.tries

/**
 * 콜라츠 추측
 * https://school.programmers.co.kr/learn/courses/30/lessons/12943
 * 주의: Int 범위가 벗어나면 계산이 이상해질 수 있으니 Long으로 변환하고 구하자!
 * 다른 아이디어: 재귀로 풀 수가 있구나!!
 */
class Solution {
    fun solution(num: Int): Int {
        var answer = 0
        var temp: Long = num.toLong()

        while (temp != 1L && answer < 500) {
            answer++
            if (temp % 2L == 0L) {
                temp /= 2
            } else {
                temp = (temp * 3) + 1
            }
        }

        return if (answer >= 500) -1 else answer
    }
}