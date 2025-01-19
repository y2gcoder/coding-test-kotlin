package com.y2gcoder.codingtest.programmers.level1.remainderisone.tries2

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

private data class TestData(var n: Int, val expected: Int)

class SolutionTest : FunSpec({
    context("나머지가 1이 되는 가장 작은 자연수를 구할 수 있다") {
        withData(
            TestData(10, 3),
            TestData(12, 11),
        ) { (n, expected) ->
            val sut = Solution()

            sut.solution(n) shouldBe expected
        }
    }
})
