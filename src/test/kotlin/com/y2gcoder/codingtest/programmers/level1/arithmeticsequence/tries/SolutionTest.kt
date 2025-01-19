package com.y2gcoder.codingtest.programmers.level1.arithmeticsequence.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

private data class TestData(val x: Int, val n: Int, val expected: LongArray)

class SolutionTest : FunSpec({
    withData(
        TestData(
            x = 2,
            n = 5,
            expected = longArrayOf(2, 4, 6, 8, 10),
        ),
        TestData(
            x = 4,
            n = 3,
            expected = longArrayOf(4, 8, 12),
        ),
        TestData(
            x = -4,
            n = 2,
            expected = longArrayOf(-4, -8),
        ),
        TestData(
            x = 0,
            n = 4,
            expected = longArrayOf(0, 0, 0 , 0),
        ),
    ) { (x, n, expected) ->
        val sut = Solution()

        sut.solution(x, n) shouldBe expected
    }
})
