package com.y2gcoder.codingtest.programmers.level1.mockexam.tries

/**
 * 모의고사
 * https://school.programmers.co.kr/learn/courses/30/lessons/42840
 */
class Solution {
    fun solution(answers: IntArray): IntArray {
        val scoreBoard = mutableListOf(0, 0, 0)

        answers.forEachIndexed { i, answer ->
            if (answer == FIRST_PATTERN[i % FIRST_PATTERN.size]) {
                scoreBoard[0] = scoreBoard[0] + 1
            }
            if (answer == SECOND_PATTERN[i % SECOND_PATTERN.size]) {
                scoreBoard[1] = scoreBoard[1] + 1
            }
            if (answer == THIRD_PATTERN[i % THIRD_PATTERN.size]) {
                scoreBoard[2] = scoreBoard[2] + 1
            }
        }

        val maxScore = scoreBoard.maxOrNull() ?: scoreBoard[0]


        val result = mutableListOf<Int>()

        scoreBoard.forEachIndexed { i, score ->
            if (score == maxScore) {
                result.add(i + 1)
            }
        }

        return result.toIntArray()
    }

    companion object {
        private val FIRST_PATTERN = listOf(1, 2, 3, 4, 5)
        private val SECOND_PATTERN = listOf(2, 1, 2, 3, 2, 4, 2, 5)
        private val THIRD_PATTERN = listOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

    }
}