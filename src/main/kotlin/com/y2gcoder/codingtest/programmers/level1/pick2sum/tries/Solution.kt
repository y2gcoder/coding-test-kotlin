package com.y2gcoder.codingtest.programmers.level1.pick2sum.tries

/**
 * 두 개 뽑아서 더하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/68644
 * 아이디어: 조합으로 뽑아내서 중복을 걸러내고, 정렬 후 반환
 * 다른 아이디어? withIndex, flatMap, withIndex.map 으로 i to j 로 pair로 조합 후 서로 다른 인덱스인 경우로 필터링 후 계산?
 */
class Solution {
    fun solution(numbers: IntArray): IntArray = combination(numbers, 2)
        .map { it.sum() }
        .toSet()
        .sorted()
        .toIntArray()

    private fun combination(numbers: IntArray, r: Int): List<List<Int>> {
        val results = mutableListOf<List<Int>>()
        val temp = numbers.sliceArray(0 until r)

        fun recursive(start: Int, depth: Int) {
            if (depth == r) {
                results.add(temp.toList())
                return
            }
            for(i in start until numbers.size) {
                temp[depth] = numbers[i]
                recursive(i + 1, depth + 1)
            }
        }

        recursive(0, 0)
        return results
    }
}
