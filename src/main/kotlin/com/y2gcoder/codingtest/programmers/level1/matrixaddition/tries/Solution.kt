package com.y2gcoder.codingtest.programmers.level1.matrixaddition.tries

/**
 * 행렬의 덧셈
 * https://school.programmers.co.kr/learn/courses/30/lessons/12950
 */
class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        return arr1.mapIndexed { index1, ints ->
            ints.mapIndexed { index2, value ->
                value + arr2[index1][index2]
            }.toIntArray()
        }.toTypedArray()
    }
}