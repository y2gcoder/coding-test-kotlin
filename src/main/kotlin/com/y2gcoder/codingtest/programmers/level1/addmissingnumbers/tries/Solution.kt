package com.y2gcoder.codingtest.programmers.level1.addmissingnumbers.tries

/**
 * 없는 숫자 더하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/86051
 * 다른 풀이: 0~9 중에서 받은 배열에 속하지 않는 것만 필터링 해서 합 구하기
 */
class Solution {
    fun solution(numbers: IntArray): Int = ((0..9).toSet() - numbers.toSet()).sum()
}