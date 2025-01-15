package com.y2gcoder.codingtest.programmers.level1.fruitseller.tries

/**
 * 과일 장수
 * https://school.programmers.co.kr/learn/courses/30/lessons/135808
 */
class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        //1. score 정렬(내림 차순)
        val sortedScores = score.toList().sortedDescending()

        //2. 과일 박스 만들기
        val boxes = sortedScores.chunked(m).filter { it.size == m }

        //3-1. 박스가 없으면 이익 0
        if (boxes.isEmpty()) {
            return 0
        }

        //3-2 최저 점수 과일별로 박스 집합
        val groupBy = boxes.groupBy { it.minOrNull() ?: 0 }

        //4. 점수 계산
        return groupBy.entries.sumOf { it.key * m * it.value.size }
    }
}