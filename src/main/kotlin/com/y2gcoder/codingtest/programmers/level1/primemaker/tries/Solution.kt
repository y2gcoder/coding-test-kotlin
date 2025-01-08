package com.y2gcoder.codingtest.programmers.level1.primemaker.tries

/**
 * 소수 만들기 (Summer/Winter Coding(~2018)
 * https://school.programmers.co.kr/learn/courses/30/lessons/12977
 */
class Solution {
    fun solution(nums: IntArray): Int {
        val combinations = combinations(nums.toList(), 3)

        return combinations
            .map { combination ->
                combination.sum()
            }
            .filter { isPrime(it) }
            .size
    }

    /**
     * 조합
     */
    private fun combinations(nums: List<Int>, k: Int): List<List<Int>> {
        if (k == 0) {
            return listOf(emptyList())
        }

        if (nums.size < k) return emptyList()

        val first = nums.first()
        val rest = nums.drop(1)

        val combinationsWithFirst = combinations(rest, k - 1).map { comb: List<Int> ->
            listOf(first) + comb
        }

        val combinationsWithoutFirst = combinations(rest, k)

        // nCk = n-1Ck + n-1Ck-1
        return combinationsWithFirst + combinationsWithoutFirst
    }

    /**
     * 소수인지 판별
     */
    private fun isPrime(n: Int): Boolean {
        var i = 2
        while (i * i <= n) {
            if (n % i == 0) {
                return false
            }
            i += 1
        }
        return true
    }
}