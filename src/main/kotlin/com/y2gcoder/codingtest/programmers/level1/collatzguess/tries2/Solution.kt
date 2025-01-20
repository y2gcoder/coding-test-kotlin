package com.y2gcoder.codingtest.programmers.level1.collatzguess.tries2

/**
 * 콜라츠 추측
 * https://school.programmers.co.kr/learn/courses/30/lessons/12943
 * 주의: Int 범위가 벗어나면 계산이 이상해질 수 있으니 Long으로 변환하고 구하자!
 * tailrec 를 이용하면 꼬리재귀가 가능!
 */
class Solution {
    fun solution(num: Int): Int {
        return collatz(num.toLong(), 0)
    }

    private tailrec fun collatz(num: Long, count: Int): Int {
        return when {
            count > 500 -> -1
            num == 1L -> count
            else -> collatz(if (num % 2 == 0L) (num / 2) else (num * 3 + 1), count + 1)
        }
    }
}