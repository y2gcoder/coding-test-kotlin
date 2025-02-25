package com.y2gcoder.codingtest.programmers.level1.memoriesscore.tries

/**
 * 추억 점수
 * https://school.programmers.co.kr/learn/courses/30/lessons/176963
 */
class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        return photo.map { people ->
            people.sumOf { person ->
                (name zip yearning.toTypedArray()).toMap()[person] ?: 0
            }
        }.toIntArray()
    }
}