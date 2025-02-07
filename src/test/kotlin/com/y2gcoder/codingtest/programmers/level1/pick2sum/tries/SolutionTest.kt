package com.y2gcoder.codingtest.programmers.level1.pick2sum.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class SolutionTest : FunSpec({
    context("숫자 배열에서 2개씩 뽑아 더한 숫자들의 목록을 구할 수 있다") {
        forAll(
            row(
                intArrayOf(2, 1, 3, 4, 1),
                intArrayOf(2, 3, 4, 5, 6, 7),
            ),
            row(
                intArrayOf(5, 0, 2, 7),
                intArrayOf(2, 5, 7, 9, 12),
            ),
        ) { numbers, expected ->
            val sut = Solution()
            val actual = sut.solution(numbers)
            actual shouldBe expected
        }
    }

})
