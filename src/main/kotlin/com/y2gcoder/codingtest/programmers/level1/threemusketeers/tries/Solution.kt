package com.y2gcoder.codingtest.programmers.level1.threemusketeers.tries

/**
 * 삼총사
 * https://school.programmers.co.kr/learn/courses/30/lessons/131705
 * 아이디어: 조합을 이용해서 구해봤음. 순서 상관없이 삼총사를 더하기 때문. 이전과 달리 점화식을 사용하진 않았음.
 */
class Solution {
    fun solution(number: IntArray): Int = combination(number, 3).map { it.sum() }.count { it == 0 }

    private fun combination(elements: IntArray, r: Int): List<List<Int>> {
        val n = elements.size
        val results = mutableListOf<List<Int>>()

        val result = elements.sliceArray(0 until r)

        fun recursionCombination(depth: Int = 0, index: Int = 0) {
            if (depth == r) {
                results.add(result.toList())
                return
            }

            for (i in index until n) {
                result[depth] = elements[i]
                recursionCombination(depth + 1, i + 1)
            }
        }

        recursionCombination()
        return results
    }
}
