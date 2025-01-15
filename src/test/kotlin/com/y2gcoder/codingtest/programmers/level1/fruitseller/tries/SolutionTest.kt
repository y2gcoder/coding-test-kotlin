package com.y2gcoder.codingtest.programmers.level1.fruitseller.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

private data class SolutionTestData(val k: Int, val m: Int, val score: IntArray, val expectedResult: Int)

class SolutionTest : FunSpec({
    context("사과의 최대 점수, 한 상자에 들어가는 사과의 수, 사과들의 점수를 받아 최대 이익을 구할 수 있다") {
        withData(
            SolutionTestData(
                k = 4,
                m = 3,
                score = intArrayOf(4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2),
                expectedResult = 33,
            ),
            SolutionTestData(
                k = 3,
                m = 4,
                score = intArrayOf(1, 2, 3, 1, 2, 3, 1),
                expectedResult = 8,
            ),
            SolutionTestData(
                k = 3,
                m = 4,
                score = intArrayOf(1, 2, 3),
                expectedResult = 0,
            ),
        ) { (k, m, score, expectedResult) ->
            val sut = Solution()
            sut.solution(k, m, score) shouldBe expectedResult
        }
    }

})
