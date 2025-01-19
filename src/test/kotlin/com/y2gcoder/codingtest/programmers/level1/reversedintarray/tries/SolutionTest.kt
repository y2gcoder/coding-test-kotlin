package com.y2gcoder.codingtest.programmers.level1.reversedintarray.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class SolutionTest : FunSpec({
    context("자연수를 뒤집어 각 자리 수 배열을 구할 수 있다") {
        val n: Long = 12345

        val sut = Solution()

        val actual = sut.solution(n)

        val expected = intArrayOf(5, 4, 3, 2, 1)

        actual shouldBe expected
    }
})
