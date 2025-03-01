package com.y2gcoder.codingtest.programmers.level1.overlay.tries

/**
 * 덧칠하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/161989
 * 다른 아이디어: 없앨 필요 없이 커서를 옮기는 느낌으로 해도 되는구나?
 */
class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 0

        val remainSection = section.toMutableList()

        while (remainSection.isNotEmpty()) {

            remainSection.removeAll { (remainSection[0]until remainSection[0] + m).contains(it) }

            answer++
        }

        return answer
    }
}