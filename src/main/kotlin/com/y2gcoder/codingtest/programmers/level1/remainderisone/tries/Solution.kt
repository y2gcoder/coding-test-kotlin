package com.y2gcoder.codingtest.programmers.level1.remainderisone.tries

/**
 * 나머지가 1이 되는 수 찾기
 * https://school.programmers.co.kr/learn/courses/30/lessons/87389
 * 다른 풀이: 1부터 증가하는 범위에서 나머지가 1이 되는 가장 첫번째 수를 추출해도 되겠다
 */
class Solution {
    fun solution(n: Int): Int {
        var temp = n - 1
        var result = n - 1

        while (temp > 0) {
            if (n % temp == 1) {
                result = temp
            }
            temp--
        }

        return result
    }
}