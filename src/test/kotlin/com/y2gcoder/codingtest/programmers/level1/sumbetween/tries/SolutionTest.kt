package com.y2gcoder.codingtest.programmers.level1.sumbetween.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

private data class TestData(val a: Int, val b: Int, val expected: Long)

class SolutionTest : FunSpec({
    context("두 정수 사이의 합을 구할 수 있다") {
        withData(
            TestData(
                a = 3,
                b = 5,
                expected = 12,
            ),
            TestData(
                a = 3,
                b = 3,
                expected = 3,
            ),
            TestData(
                a = 5,
                b = 3,
                expected = 12,
            ),
        ) { (a, b, expected) ->
            val sut = Solution()

            sut.solution(a, b) shouldBe expected
        }
    }
})
