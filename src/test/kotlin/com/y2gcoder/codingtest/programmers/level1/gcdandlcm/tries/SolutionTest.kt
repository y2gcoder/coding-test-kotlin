package com.y2gcoder.codingtest.programmers.level1.gcdandlcm.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class SolutionTest : FunSpec({
    context("두 수의 최대공약수와 최대공배수를 구할 수 있다") {
        forAll(
            row(3, 12, intArrayOf(3, 12)),
            row(2, 5, intArrayOf(1, 10)),
        ) { n, m, expected ->
            val sut = Solution()
            sut.solution(n, m) shouldBe expected
        }
    }
})
