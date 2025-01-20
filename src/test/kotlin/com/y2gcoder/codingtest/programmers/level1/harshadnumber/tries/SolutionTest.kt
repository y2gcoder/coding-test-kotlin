package com.y2gcoder.codingtest.programmers.level1.harshadnumber.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class SolutionTest : FunSpec({
    context("주어진 수가 하샤드 수인지 구할 수 있다") {
        forAll(
            row(10, true),
            row(12, true),
            row(11, false),
            row(13, false),
        ) { x, expected ->
            val sut = Solution()

            sut.solution(x) shouldBe expected
        }
    }
})
