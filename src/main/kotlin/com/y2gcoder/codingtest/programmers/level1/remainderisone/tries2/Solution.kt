package com.y2gcoder.codingtest.programmers.level1.remainderisone.tries2

/**
 * 나머지가 1이 되는 수 찾기
 * https://school.programmers.co.kr/learn/courses/30/lessons/87389
 */
class Solution {
    fun solution(n: Int): Int {
        return (1..n).first { n % it == 1 }
    }
}