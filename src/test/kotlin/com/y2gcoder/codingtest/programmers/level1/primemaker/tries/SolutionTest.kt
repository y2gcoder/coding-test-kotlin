package com.y2gcoder.codingtest.programmers.level1.primemaker.tries

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class SolutionTest : StringSpec({
    val sut = Solution()

    "[1, 2, 3, 4] then 1" {
        val nums = intArrayOf(1, 2, 3, 4)

        val result = sut.solution(nums)

        result shouldBe 1
    }

    "[1, 2, 7, 6. 4] then 4" {
        val nums = intArrayOf(1, 2, 7, 6, 4)

        val result = sut.solution(nums)

        result shouldBe 4
    }

})
