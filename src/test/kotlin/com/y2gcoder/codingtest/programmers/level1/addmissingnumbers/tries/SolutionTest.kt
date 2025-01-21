package com.y2gcoder.codingtest.programmers.level1.addmissingnumbers.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class SolutionTest : FunSpec({
    context("0 ~ 9 중 받은 숫자에서 없는 숫자를 더한 값을 구할 수 있다") {
        forAll(
            row(
                intArrayOf(1, 2, 3, 4, 6, 7, 8, 0),
                14,
            ),
            row(
                intArrayOf(5, 8, 4, 0, 6, 7, 9),
                6,
            ),
        ) { numbers, expected ->
            val sut = Solution()

            sut.solution(numbers) shouldBe expected
        }
    }
})
