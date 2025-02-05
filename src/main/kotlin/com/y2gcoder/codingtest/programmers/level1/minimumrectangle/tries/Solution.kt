package com.y2gcoder.codingtest.programmers.level1.minimumrectangle.tries

/**
 * 최소직사각형
 * https://school.programmers.co.kr/learn/courses/30/lessons/86491
 * 아이디어: 정렬 후 작은 건 작은 것 끼리 최대, 큰건 큰 것끼리 최대로 구해보자!
 * 다른 아이디어: 정렬하지 않고 바로 큰 값끼리, 작은 값 끼리 해도 되려나?
 */
class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        val sorted = sizes.map { it.sorted() }
        return (sorted.maxOfOrNull { it[0] } ?: 0) * (sorted.maxOfOrNull { it[1] } ?: 0)
    }
}