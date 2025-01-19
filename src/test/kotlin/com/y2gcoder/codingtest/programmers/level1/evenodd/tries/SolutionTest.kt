package com.y2gcoder.codingtest.programmers.level1.evenodd.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

private data class TestData(var num: Int, var expected: String)

class SolutionTest : FunSpec({
    withData(
        TestData(3, "Odd"),
        TestData(4, "Even"),
        TestData(0, "Even"),
    ) { (num, expected) ->
        val sut = Solution()

        sut.solution(num) shouldBe expected
    }
})
