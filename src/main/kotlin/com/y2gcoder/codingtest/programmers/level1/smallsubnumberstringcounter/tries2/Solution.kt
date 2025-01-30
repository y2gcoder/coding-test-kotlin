package com.y2gcoder.codingtest.programmers.level1.smallsubnumberstringcounter.tries2

/**
 * 크기가 작은 부분 문자열
 * https://school.programmers.co.kr/learn/courses/30/lessons/147355
 */
class Solution {
    fun solution(t: String, p: String): Int {
        return (0..t.length - p.length)
            .map { t.slice(it until it + p.length) }
            .count { it <= p }
    }
}
