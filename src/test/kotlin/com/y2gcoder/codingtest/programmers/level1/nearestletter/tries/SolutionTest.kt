package com.y2gcoder.codingtest.programmers.level1.nearestletter.tries

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class SolutionTest : StringSpec({
    val sut = Solution()

    "banana" {
        val s = "banana"
        sut.solution(s) shouldBe listOf(-1, -1, -1, 2, 2, 2)
    }

    "foobar" {
        val s = "foobar"
        sut.solution(s) shouldBe listOf(-1, -1, 1, -1, -1, -1)
    }
})
