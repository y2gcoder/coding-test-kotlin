package com.y2gcoder.codingtest.programmers.level1.collatzguess.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class SolutionTest : FunSpec({
    context("콜라츠 추측의 결과를 얻을 수 있다") {
        forAll(
            row(6, 8),
            row(16, 4),
            row(626331, -1),
            row(1, 0),
        ) { num, expected ->
            val sut = Solution()

            sut.solution(num) shouldBe expected
        }
    }
})
