package com.y2gcoder.codingtest.programmers.level1.overlay.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class SolutionTest : FunSpec({
    context("최소 덧칠 횟수를 구할 수 있다.") {
        forAll(
            row(
                8,
                4,
                intArrayOf(2, 3, 6),
                2
            ),
            row(5,
                4,
                intArrayOf(1, 3),
                1
            ),
            row(4,
                1,
                intArrayOf(1, 2, 3, 4),
                4
            ),
        ) { n, m, section, expected ->
            val sut = Solution()
            sut.solution(n, m, section) shouldBe expected
        }
    }

})
