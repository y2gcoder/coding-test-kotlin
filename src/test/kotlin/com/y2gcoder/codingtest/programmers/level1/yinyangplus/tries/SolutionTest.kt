package com.y2gcoder.codingtest.programmers.level1.yinyangplus.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class SolutionTest : FunSpec({
    context("절대값 배열과 부호 배열을 받아 실제 정수의 합을 구할 수 있다") {
        forAll(
            row(
                intArrayOf(4, 7, 12),
                booleanArrayOf(true, false, true),
                9,
            ),
            row(
                intArrayOf(1, 2, 3),
                booleanArrayOf(false, false, true),
                0,
            ),
        ) { absolutes, signs, expected, ->
            val sut = Solution()

            val actual = sut.solution(absolutes, signs)

            actual shouldBe expected
        }
    }
})
