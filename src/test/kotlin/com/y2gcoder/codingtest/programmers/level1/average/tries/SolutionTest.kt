package com.y2gcoder.codingtest.programmers.level1.average.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

private data class TestData(val arr: IntArray, val expected: Double)

class SolutionTest : FunSpec({
    context("정수 배열의 평균값을 구할 수 있다") {
        withData(
            TestData(
                arr = intArrayOf(1, 2, 3, 4),
                expected = 2.5
            ),
            TestData(
                arr = intArrayOf(5, 5),
                expected = 5.0
            ),
        ) { (arr, expected) ->
            val sut = Solution()
            sut.solution(arr) shouldBe expected
        }
    }
})
