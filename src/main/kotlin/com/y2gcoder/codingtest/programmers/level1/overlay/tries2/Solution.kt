package com.y2gcoder.codingtest.programmers.level1.overlay.tries2

/**
 * 덧칠하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/161989
 * 아이디어: 없앨 필요 없이 커서를 옮기는 느낌으로 해도 되는구나?
 */
class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 0

        var nextSection = 0

        section.forEach {
            if (it >= nextSection) {
                answer++
                nextSection = it + m
            }
        }

        return answer
    }
}