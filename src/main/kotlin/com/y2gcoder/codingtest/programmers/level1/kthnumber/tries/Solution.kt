package com.y2gcoder.codingtest.programmers.level1.kthnumber.tries

/**
 * K번째수
 * https://school.programmers.co.kr/learn/courses/30/lessons/42748
 */
class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        return commands.map { command ->
            array
                .slice((command[0] - 1)until command[1])
                .sorted()[command[2] - 1]
        }.toIntArray()
    }
}