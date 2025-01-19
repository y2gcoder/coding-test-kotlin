package com.y2gcoder.codingtest.programmers.level1.reversedintarray.tries

/**
 * 자연수를 뒤집어 배열로 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12932
 */
class Solution {
    fun solution(n: Long): IntArray {
        val answer = mutableListOf<Int>()
        var temp = n

        while (temp > 0L) {
           answer.add((temp % 10).toInt())
            temp /= 10
        }

        return answer.toIntArray()
    }
}