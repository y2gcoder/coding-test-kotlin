package com.y2gcoder.codingtest.programmers.level1.dotproduct.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

private data class TestData(val a: IntArray, val b: IntArray, val expected: Int)

class SolutionTest : FunSpec({
    context("두 정수 배열의 내적을 구할 수 있다") {
        withData(
            TestData(
                a = intArrayOf(1, 2, 3, 4),
                b = intArrayOf(-3, -1, 0, 2),
                expected = 3,
            ),
            TestData(
                a = intArrayOf(-1, 0, 1),
                b = intArrayOf(1, 0, -1),
                expected = -2,
            ),
        ) { (a, b, expected) ->
            val sut = Solution()

            sut.solution(a, b) shouldBe expected
        }
    }
})
