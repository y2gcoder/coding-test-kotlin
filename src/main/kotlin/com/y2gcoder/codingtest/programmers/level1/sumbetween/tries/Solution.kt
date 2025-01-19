package com.y2gcoder.codingtest.programmers.level1.sumbetween.tries

import kotlin.math.max
import kotlin.math.min

/**
 * 두 정수 사이의 합
 * https://school.programmers.co.kr/learn/courses/30/lessons/12912
 */
class Solution {
    fun solution(a: Int, b: Int): Long {
        val min = min(a, b).toLong()
        val max = max(a, b).toLong()
        return (min..max).sum()
    }
}