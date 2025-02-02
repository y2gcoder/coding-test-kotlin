package com.y2gcoder.codingtest.programmers.level1.ternaryreversal.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class SolutionTest : FunSpec({
    context("10진수를 3진수로 뒤집고 다시 10진수로 변환할 수 있다") {
        forAll(
            row(45, 7),
            row(125, 229),
        ) { n: Int, expected: Int ->
            val sut = Solution()
            sut.solution(n) shouldBe expected
        }
    }
})
