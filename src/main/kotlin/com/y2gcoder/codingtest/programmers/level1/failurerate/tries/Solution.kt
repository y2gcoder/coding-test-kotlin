package com.y2gcoder.codingtest.programmers.level1.failurerate.tries

/**
 * 실패율
 * https://school.programmers.co.kr/learn/courses/30/lessons/42889
 */
class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        return (1..N).sortedWith(compareBy({
            -(stages.count { stage -> it == stage }.toDouble() / stages.count { stage -> it <= stage })
        }, { it })).toIntArray()
    }
}