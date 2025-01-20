package com.y2gcoder.codingtest.programmers.level1.reversedint.tries2

import com.y2gcoder.codingtest.programmers.level1.sqrtchecker.tries.Solution
import io.kotest.core.spec.style.FunSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class SolutionTest : FunSpec({
    context("임의의 양의 정수가 다른 수의 제곱인지 판단할 수 있다") {
        forAll(
            row(121, 144),
            row(3, -1),
            row(101, -1),
        ) { n: Long, expected: Long ->
            val sut = Solution()
            sut.solution(n) shouldBe expected
        }
    }
})
