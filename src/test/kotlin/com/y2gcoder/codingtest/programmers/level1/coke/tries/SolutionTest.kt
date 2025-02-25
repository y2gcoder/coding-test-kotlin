package com.y2gcoder.codingtest.programmers.level1.coke.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class SolutionTest : FunSpec({
    context("빈 병을 줬을 때 추가로 받을 수 있는 콜라병의 개수를 구할 수 있다") {
        forAll(
            row(2, 1, 20, 19),
            row(3, 1, 20, 9),
        ) { a, b, n, expected ->
            val sut = Solution()
            val actual = sut.solution(a, b, n)
            actual shouldBe expected
        }
    }
})
