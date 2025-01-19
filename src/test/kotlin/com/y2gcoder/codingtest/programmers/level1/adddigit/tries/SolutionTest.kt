package com.y2gcoder.codingtest.programmers.level1.adddigit.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

private data class TestData(val n: Int, val expected: Int)

class SolutionTest : FunSpec({
    context("숫자를 받아 각 자릿수의 합을 반환할 수 있다") {
        withData(
            TestData(123, 6),
            TestData(987, 24),
        ) { (n, expected) ->
            val sut = Solution()
            sut.solution(n) shouldBe expected
        }
    }
})
