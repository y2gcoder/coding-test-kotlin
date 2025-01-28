package com.y2gcoder.codingtest.programmers.level1.sumbynumberofdivisors.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class SolutionTest : FunSpec({
    context("범위의 숫자들의 약수의 개수가 짝수면 더하고 홀수면 뺀 결과를 도출할 수 있다") {
        forAll(
            row(13, 17, 43),
            row(24, 27, 52),
        ) { left: Int, right: Int, expected: Int ->
            val sut = Solution()
            sut.solution(left, right) shouldBe expected
        }
    }

})
