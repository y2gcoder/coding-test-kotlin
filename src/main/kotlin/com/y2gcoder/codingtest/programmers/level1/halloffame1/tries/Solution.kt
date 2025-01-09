package com.y2gcoder.codingtest.programmers.level1.halloffame1.tries

import java.util.PriorityQueue

/**
 * 명예의 전당(1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/138477
 */
class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        val answer = mutableListOf<Int>()

        val topKs = PriorityQueue<Int>()

        //순회
        for (s in score) {
            //우선순위 큐에 넣고(자동 오름차순 정렬)
            topKs.add(s)
            //사이즈가 k보다 커지면
            if (topKs.size > k) {
                // 밀어내기
                topKs.poll()
            }
            //명예의 전당 중 최하위 점수 발표
            answer.add(topKs.peek())
        }

        return answer.toIntArray()
    }
}