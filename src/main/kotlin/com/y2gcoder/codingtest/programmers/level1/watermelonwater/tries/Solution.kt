package com.y2gcoder.codingtest.programmers.level1.watermelonwater.tries

/**
 * 수박수박수박수박수박수?
 * https://school.programmers.co.kr/learn/courses/30/lessons/12922
 */
class Solution {
    fun solution(n: Int): String {
        return (1..n).joinToString("") {
            if (it % 2 != 0) {
                "수"
            } else {
                "박"
            }
        }
    }
}