package com.y2gcoder.codingtest.programmers.level1.minimumrectangle.tries2

import kotlin.math.max
import kotlin.math.min

/**
 * 최소직사각형
 * https://school.programmers.co.kr/learn/courses/30/lessons/86491
 * 다른 아이디어: 정렬하지 않고 바로 큰 값끼리, 작은 값 끼리 해도 되려나?
 */
class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        val biggerMax = sizes.maxOf { max(it[0], it[1]) }
        val smallerMax = sizes.maxOf { min(it[0], it[1]) }
        return biggerMax * smallerMax
    }
}