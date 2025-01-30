package com.y2gcoder.codingtest.programmers.level1.smallsubnumberstringcounter.tries

/**
 * 크기가 작은 부분 문자열
 * https://school.programmers.co.kr/learn/courses/30/lessons/147355
 * 다른 아이디어: range(firstIndex), map, count 를 사용해보자!
 */
class Solution {
    fun solution(t: String, p: String): Int {
        val pointLength = p.length
        val point = p.toLong()

        var answer: Int = 0

        var index = 0
        while (index + pointLength <= t.length) {
            val sliced = t.slice(index until index + pointLength).toLong()
            if (sliced <= point) {
                answer++
            }
            index++
        }

        return answer
    }
}
