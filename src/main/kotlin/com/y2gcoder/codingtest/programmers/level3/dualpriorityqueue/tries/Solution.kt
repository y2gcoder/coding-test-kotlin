package com.y2gcoder.codingtest.programmers.level3.dualpriorityqueue.tries

import java.util.PriorityQueue

/**
 * 이중우선순위큐
 * https://school.programmers.co.kr/learn/courses/30/lessons/42628
 * 다른 풀이 아이디어? minHeap, maxHeap을 두고 동시 삽입/제거 후 결과 합산
 */
class Solution {
    fun solution(operations: Array<String>): IntArray {
        val queue = PriorityQueue<Int>()

        operations.forEach { operation ->
            val split = operation.split(" ")
            val operator = split[0]
            val operand = split[1].toInt()

            when(operator) {
                "I" -> insertOperation(queue, operand)
                "D" -> deleteOperation(queue, operand)
                else -> {}
            }
        }

        val max = queue.maxOrNull() ?: 0
        val min = queue.minOrNull() ?: 0

        return intArrayOf(max, min)
    }

    private fun insertOperation(queue: PriorityQueue<Int>, operand: Int) {
        queue.offer(operand)
    }

    private fun deleteOperation(queue: PriorityQueue<Int>, operand: Int) {
        if (queue.isEmpty()) {
            return
        }
        if (operand == DELETE_MIN_OPERAND) {
            queue.poll()
            return
        }
        if (operand == DELETE_MAX_OPERAND) {
            queue.remove(queue.maxOrNull()!!)
        }
    }

    companion object {
        private const val DELETE_MIN_OPERAND = -1
        private const val DELETE_MAX_OPERAND = 1
    }
}